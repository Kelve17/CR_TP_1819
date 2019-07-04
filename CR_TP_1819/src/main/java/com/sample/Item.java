package com.sample;

public class Item {
	int Id;
	float Preco;
	String Nome;
	TipoItem Tipo;
	int QuantidadeEmArmazem;
	int IdComplementar;
	boolean AdicionarCarinho = false;
	boolean RemoverCarinho = false;
	
	public Item(int id, float preco, String nome, TipoItem tipo, int complementar,
			int quantidadeEmArmazem) {
		super();
		Id = id;
		Preco = preco;
		Nome = nome;
		Tipo = tipo;
		IdComplementar = complementar;
		QuantidadeEmArmazem = quantidadeEmArmazem;
	}
	
	public Item(int id, float preco, String nome, TipoItem tipo, int complementar,
			int quantidadeEmArmazem, boolean add, boolean rem) {
		super();
		Id = id;
		Preco = preco;
		Nome = nome;
		Tipo = tipo;
		IdComplementar = complementar;
		QuantidadeEmArmazem = quantidadeEmArmazem;
		AdicionarCarinho = add;
		RemoverCarinho = rem;
	}


	public int getIdComplementar() {
		return IdComplementar;
	}

	public void setIdComplementar(int idComplementar) {
		IdComplementar = idComplementar;
	}

	public boolean isAdicionarCarinho() {
		return AdicionarCarinho;
	}

	public void setAdicionarCarinho(boolean adicionarCarinho) {
		AdicionarCarinho = adicionarCarinho;
	}

	public boolean isRemoverCarinho() {
		return RemoverCarinho;
	}

	public void setRemoverCarinho(boolean removerCarinho) {
		RemoverCarinho = removerCarinho;
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
	public int getComplementar() {
		return IdComplementar;
	}
	public void setComplementar(int complementar) {
		IdComplementar = complementar;
	}
	public int getQuantidadeEmArmazem() {
		return QuantidadeEmArmazem;
	}
	public void setQuantidadeEmArmazem(int quantidadeEmArmazem) {
		QuantidadeEmArmazem = quantidadeEmArmazem;
	}
	
	
	@Override
	public String toString() {
	    return Nome+ " " +"--"+ Tipo + "--"+ " "+ Preco+"€";
	}
}

