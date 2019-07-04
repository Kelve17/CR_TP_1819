package com.sample;

public class Item {
	int Id;
	float Preco;
	String Nome;
	TipoItem Tipo;
	int QuantidadeEmArmazem;
	Item Complementar;
	
	public Item( String nome, float preco) {
		super();
		Preco = preco;
		Nome = nome;
	}
	public Item(int id, float preco, String nome, TipoItem tipo, Item complementar,
			int quantidadeEmArmazem) {
		super();
		Id = id;
		Preco = preco;
		Nome = nome;
		Tipo = tipo;
		Complementar = complementar;
		QuantidadeEmArmazem = quantidadeEmArmazem;
	}

	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public float getPreco() {
		return Preco;
	}
	public void setPreco(float preco) {
		Preco = preco;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public TipoItem getTipo() {
		return Tipo;
	}
	public void setTipo(TipoItem tipo) {
		Tipo = tipo;
	}
	public Item getComplementar() {
		return Complementar;
	}
	public void setComplementar(Item complementar) {
		Complementar = complementar;
	}
	public int getQuantidadeEmArmazem() {
		return QuantidadeEmArmazem;
	}
	public void setQuantidadeEmArmazem(int quantidadeEmArmazem) {
		QuantidadeEmArmazem = quantidadeEmArmazem;
	}
	
	
	@Override
	public String toString() {
	    return Nome+ " " +"--"+ "--"+ " "+ Preco+"€";
	}
}


