package com.academia.escola.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.academia.escola.entities.Funcionario;
import com.academia.escola.repositories.FuncionarioRepository;

@RestController
@RequestMapping(value = "/funcionarios")
public class FuncionarioController {
	
	@Autowired
	FuncionarioRepository repository;
	
	@GetMapping
	public List<Funcionario> findAll(){
		List<Funcionario> funcionarios = repository.findAll();
		return funcionarios;
	}
	
}
