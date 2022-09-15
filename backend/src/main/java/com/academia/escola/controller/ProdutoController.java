package com.academia.escola.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.academia.escola.entities.Produto;
import com.academia.escola.services.ProdutoService;

@RestController
@RequestMapping(value = "/produtos")
public class ProdutoController {

	@Autowired
	ProdutoService service;
	
	@GetMapping
	public List<Produto> findAll(){
		List<Produto> produtos = service.findAll();
		return produtos;
	}
	
	@GetMapping(value = "/{id}")
	public Produto findById(@PathVariable Long id) {
		Produto produto = service.findById(id);
		return produto;
	}
	
	@PutMapping
	public void saveProduto(@RequestBody Produto p) {
		service.saveProduto(p);
	}
	
}
