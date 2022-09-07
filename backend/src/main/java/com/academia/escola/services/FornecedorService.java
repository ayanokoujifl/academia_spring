package com.academia.escola.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.academia.escola.entities.Fornecedor;
import com.academia.escola.repositories.FornecedorRepository;

@Service
public class FornecedorService {
	@Autowired
	FornecedorRepository repository;

	@Transactional(readOnly = true)
	public List<Fornecedor> findAll() {
		List<Fornecedor> fornecedor = repository.findAll();
		return fornecedor;
	}

	@Transactional(readOnly = true)
	public Fornecedor findById(Long id) {
		Fornecedor c = repository.findById(id).get();
		return c;
	}

	@Transactional
	public Fornecedor saveFornecedor(Fornecedor fornecedor) {
		repository.saveAndFlush(fornecedor);
		return fornecedor;
	}
}
