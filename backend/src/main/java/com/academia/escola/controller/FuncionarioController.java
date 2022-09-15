package com.academia.escola.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.academia.escola.entities.Funcionario;
import com.academia.escola.services.FuncionarioService;

@RestController
@RequestMapping(value = "/funcionarios")
public class FuncionarioController {

	@Autowired
	FuncionarioService service;

	@GetMapping
	public List<Funcionario> findAll() {
		List<Funcionario> funcionarios = service.findAll();
		return funcionarios;
	}

	@GetMapping(value = "/{id}")
	public Funcionario findById(@PathVariable Long id) {
		Funcionario func = service.findById(id);
		return func;
	}

	@PutMapping
	public void saveFuncionario(@RequestBody Funcionario funcionario) {
		service.saveFuncionario(funcionario);
	}
}
