package com.academia.escola.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.academia.escola.entities.Cliente;
import com.academia.escola.repositories.ClienteRepository;

@RestController
@RequestMapping(value="/clientes")
public class ClienteController {

	@Autowired
	ClienteRepository repository;
	
	@GetMapping
	public List<Cliente> findAll(){
		List<Cliente> clientes= repository.findAll(); 
		return clientes;
	}
	
}
