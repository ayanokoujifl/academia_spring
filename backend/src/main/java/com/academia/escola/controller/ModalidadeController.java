package com.academia.escola.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.academia.escola.entities.Modalidade;
import com.academia.escola.services.ModalidadeService;

@RestController
@RequestMapping(value = "/modalidades")
public class ModalidadeController {

	@Autowired
	ModalidadeService service;

	@GetMapping
	public List<Modalidade> findAll() {
		List<Modalidade> modalidades = service.findAll();
		return modalidades;
	}

	@GetMapping(value = "/{id}")
	public Modalidade findById(@PathVariable Long id) {
		Modalidade modalidade = service.findById(id);
		return modalidade;
	}
	
	@PutMapping
	public void saveModalidade(@RequestBody Modalidade m) {
		service.saveModalidade(m);
	}

}
