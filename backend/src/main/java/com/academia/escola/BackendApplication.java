package com.academia.escola;

import java.time.LocalDate;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.academia.escola.entities.Funcionario;
import com.academia.escola.enums.FuncionarioTipo;
import com.academia.escola.repositories.FuncionarioRepository;

@SpringBootApplication
public class BackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}

	@Autowired
	FuncionarioRepository repository;
	
	@Override
	public void run(String... args) throws Exception {

		LocalDate d1 = LocalDate.parse("1995-08-17");
		LocalDate d2 = LocalDate.parse("2004-08-17");
		
		Funcionario f1 = new Funcionario(null, "Rosinei", 12345678910L, 8000.00,d1 , 20,
				FuncionarioTipo.INSTRUTOR);
		Funcionario f2 = new Funcionario(null, "Luis", 21345768910L, 8000.99,d2 , 10,
				FuncionarioTipo.INSTRUTOR);
		
		repository.saveAllAndFlush(Arrays.asList(f1,f2));
	}

}
