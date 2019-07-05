package com.sample;

public class Item {
	int Id;
	float Preco;
	String Nome;
	TipoItem Tipo;
	ClasseRoupa Classe;
	int QuantidadeEmArmazem;
	int IdComplementar;
	boolean AdicionarCarinho = false;
	boolean RemoverCarinho = false;
	
	public ClasseRoupa getClasse() {
		return Classe;
	}

	public void setClasse(ClasseRoupa classe) {
		Classe = classe;
	}

	public Item(Item item) {
		this.AdicionarCarinho = item.AdicionarCarinho;
		this.RemoverCarinho = item.RemoverCarinho;
		this.Id = item.Id;
		this.Preco = item.Preco;
		this.Nome = item.Nome;
		this.Tipo = item.Tipo;
		this.Classe = item.Classe;
		this.QuantidadeEmArmazem = item.QuantidadeEmArmazem;
		this.IdComplementar = item.IdComplementar;
	}

	public Item(int id, float preco, String nome, TipoItem tipo, ClasseRoupa classe, int quantidadeEmArmazem,
			int idComplementar, boolean adicionarCarinho, boolean removerCarinho) {
		super();
		Id = id;
		Preco = preco;
		Nome = nome;
		Tipo = tipo;
		Classe = classe;
		QuantidadeEmArmazem = quantidadeEmArmazem;
		IdComplementar = idComplementar;
		AdicionarCarinho = adicionarCarinho;
		RemoverCarinho = removerCarinho;
	}

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

	public Item(int id, float preco, String nome, TipoItem tipo, ClasseRoupa classe, int i, boolean b,
			boolean c) {
		super();
		Id = id;
		Preco = preco;
		Nome = nome;
		Tipo = tipo;
		QuantidadeEmArmazem = i;
		AdicionarCarinho = b;
		RemoverCarinho = c;
		// TODO Auto-generated constructor stub
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
	    return Tipo+ " " +"--"+ Classe + "--"+ " "+ Preco+"€";
	}
}

