package com.academia.escola.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.academia.escola.entities.Venda;
import com.academia.escola.repositories.VendaRepository;

@Service
public class VendaService {
	@Autowired
	VendaRepository repository;

	@Transactional(readOnly = true)
	public List<Venda> findAll() {
		List<Venda> vendas = repository.findAll();
		return vendas;
	}

	@Transactional(readOnly = true)
	public Venda findById(Long id) {
		Venda c = repository.findById(id).get();
		return c;
	}
	
	@Transactional
	public Venda saveVenda(Venda venda) {
		repository.saveAndFlush(venda);
		return venda;
	}
}
