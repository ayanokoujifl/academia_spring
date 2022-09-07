package com.academia.escola.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.academia.escola.entities.Cliente;
import com.academia.escola.services.ClienteService;

@RestController
@RequestMapping(value = "/clientes")
public class ClienteController {

	@Autowired
	ClienteService service;

	@GetMapping
	public List<Cliente> findAll() {
		return service.findAll();
	}

	@GetMapping(value = "/{id}")
	public Cliente findById(@PathVariable Long id) {
		Cliente c = service.findById(id);
		return c;
	}

	@PutMapping
	public Cliente saveCliente(@RequestBody Cliente c) {
		service.saveCliente(c);
		return c;
	}
}
