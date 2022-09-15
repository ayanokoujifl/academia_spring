package com.academia.escola.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.academia.escola.entities.Venda;
import com.academia.escola.services.VendaService;

@RestController
@RequestMapping(value = "/vendas")
public class VendaController {

	@Autowired
	VendaService service;

	@GetMapping
	public List<Venda> findAll() {
		List<Venda> vendas = service.findAll();
		return vendas;
	}

	@GetMapping(value = "/{id}")
	public Venda findById(@PathVariable Long id) {
		Venda venda = service.findById(id);
		return venda;
	}

	@PutMapping
	public void saveVenda(@RequestBody Venda v) {
		service.saveVenda(v);
	}

}
