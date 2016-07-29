package com.pvmeira.festa.model;

public class Convidado {
	private String nome;
	private Integer quantidadeAcompanhates;

	public Convidado() {

	}

	public Convidado(String nome, Integer quantidadeAcompanhates) {
		this.nome = nome;
		this.quantidadeAcompanhates = quantidadeAcompanhates;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getQuantidadeAcompanhates() {
		return quantidadeAcompanhates;
	}

	public void setQuantidadeAcompanhates(Integer quantidadeAcompanhates) {
		this.quantidadeAcompanhates = quantidadeAcompanhates;
	}

}
