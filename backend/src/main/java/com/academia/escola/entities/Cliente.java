package com.academia.escola.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "tb_cliente")
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private Long cpf;
	private Double valor_mensalidade;
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private LocalDate data_nascimento; 
	private Integer dia_pagamento;

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

	public Double getValor_mensalidade() {
		return valor_mensalidade;
	}

	public void setValor_mensalidade(Double valor_mensalidade) {
		this.valor_mensalidade = valor_mensalidade;
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

}
