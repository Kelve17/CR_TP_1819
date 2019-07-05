package com.sample;

public class Cliente {
	int Id;
	String nome;
	Sexo sexo;
	EstadoCivil estadoCivil;
	boolean possuiFilhos;

	public Cliente(int id, String nome, Sexo sexo, EstadoCivil estadoCivil, boolean possuiFilhos) {
		super();
		Id = id;
		this.nome = nome;
		this.sexo = sexo;
		this.estadoCivil = estadoCivil;
		this.possuiFilhos = possuiFilhos;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public EstadoCivil getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(EstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public boolean isPossuiFilhos() {
		return possuiFilhos;
	}

	public void setPossuiFilhos(boolean possuiFilhos) {
		this.possuiFilhos = possuiFilhos;
	}
	
	
	
	
}
