package com.academia.escola.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.academia.escola.entities.Funcionario;
import com.academia.escola.repositories.FuncionarioRepository;

@Service
public class FuncionarioService {

	@Autowired
	FuncionarioRepository repository;

	@Transactional(readOnly = true)
	public List<Funcionario> findAll() {
		List<Funcionario> funcionario = repository.findAll();
		return funcionario;
	}

	@Transactional(readOnly = true)
	public Funcionario findById(Long id) {
		Funcionario funcionario = repository.findById(id).get();
		return funcionario;
	}
	
}
