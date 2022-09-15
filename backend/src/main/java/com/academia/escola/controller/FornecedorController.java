package com.academia.escola.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.academia.escola.entities.Fornecedor;
import com.academia.escola.services.FornecedorService;

@RestController
@RequestMapping(value = "/fornecedores")
public class FornecedorController {

	@Autowired
	FornecedorService service;

	@GetMapping
	public List<Fornecedor> findAll() {
		List<Fornecedor> fornecedores = service.findAll();
		return fornecedores;
	}

	@GetMapping(value = "/{id}")
	public Fornecedor findById(@PathVariable Long id) {
		Fornecedor fornecedor = service.findById(id);
		return fornecedor;
	}

	@PutMapping
	public void saveFornecedor(@RequestBody Fornecedor fornecedor) {
		service.saveFornecedor(fornecedor);
	}
}
