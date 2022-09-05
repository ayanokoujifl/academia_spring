package com.academia.escola.entities;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import com.academia.escola.enums.FuncionarioTipo;

@Entity
@Table(name="tb_funcionario")
public class Funcionario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private Long cpf;
	private Double salario;
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private LocalDate data_nascimento;
	private Integer dia_pagamento;
	@Enumerated(EnumType.STRING)
	private FuncionarioTipo tipo;

	public Funcionario() {
		// TODO Auto-generated constructor stub
	}
		
	public Funcionario(Long id, String nome, Long cpf, Double salario, LocalDate data_nascimento, Integer dia_pagamento,
			FuncionarioTipo tipo) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
		this.data_nascimento = data_nascimento;
		this.dia_pagamento = dia_pagamento;
		this.tipo = tipo;
	}

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

	public FuncionarioTipo getTipo() {
		return tipo;
	}

	public void setTipo(FuncionarioTipo tipo) {
		this.tipo = tipo;
	}

}