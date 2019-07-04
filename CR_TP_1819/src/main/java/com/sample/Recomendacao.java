package com.sample;

public class Recomendacao {
	String Titulo;
	Item itemRecomendado;

	public Recomendacao(String titulo,Item item) {
		super();
		this.Titulo = titulo;
		this.itemRecomendado = item;
	}

	public Item getItem() {
		return itemRecomendado;
	}

	public void setItem(Item item) {
		this.itemRecomendado = item;
	}
	
	
}
