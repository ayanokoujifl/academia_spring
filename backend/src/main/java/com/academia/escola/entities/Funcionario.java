package com.academia.escola.entities;

import java.time.LocalDate;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

public class Funcionario {

	public enum tipoFuncionario {
		INSTRUTOR, FAXINEIRO, RH, GERENTE, VENDEDOR;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private Long cpf;
	private Double salario;
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private LocalDate data_nascimento;
	private Integer dia_pagamento;
	private tipoFuncionario tipo;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Long getCpf() {
		return cpf;
	}

	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public LocalDate getData_nascimento() {
		return data_nascimento;
	}

	public void setData_nascimento(LocalDate data_nascimento) {
		this.data_nascimento = data_nascimento;
	}

	public Integer getDia_pagamento() {
		return dia_pagamento;
	}

	public void setDia_pagamento(Integer dia_pagamento) {
		this.dia_pagamento = dia_pagamento;
	}

	public tipoFuncionario getTipo() {
		return tipo;
	}

	public void setTipo(tipoFuncionario tipo) {
		this.tipo = tipo;
	}

}