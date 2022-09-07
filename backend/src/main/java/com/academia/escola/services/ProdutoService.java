package com.academia.escola.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.academia.escola.entities.Produto;
import com.academia.escola.repositories.ProdutoRepository;

@Service
public class ProdutoService {
	@Autowired
	ProdutoRepository repository;

	@Transactional(readOnly = true)
	public List<Produto> findAll() {
		List<Produto> produtos = repository.findAll();
		return produtos;
	}

	@Transactional(readOnly = true)
	public Produto findById(Long id) {
		Produto c = repository.findById(id).get();
		return c;
	}
	
	@Transactional
	public Produto saveProduto(Produto produto) {
		repository.saveAndFlush(produto);
		return produto;
	}
}
