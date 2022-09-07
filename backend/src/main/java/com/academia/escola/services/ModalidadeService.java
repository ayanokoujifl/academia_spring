package com.academia.escola.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.academia.escola.entities.Modalidade;
import com.academia.escola.repositories.ModalidadeRepository;

@Service
public class ModalidadeService {
	@Autowired
	ModalidadeRepository repository;

	@Transactional(readOnly = true)
	public List<Modalidade> findAll() {
		List<Modalidade> modalidades = repository.findAll();
		return modalidades;
	}

	@Transactional(readOnly = true)
	public Modalidade findById(Long id) {
		Modalidade c = repository.findById(id).get();
		return c;
	}

	@Transactional
	public Modalidade saveModalidade(Modalidade modalidade) {
		repository.saveAndFlush(modalidade);
		return modalidade;
	}
	
}
