package com.sample;

public class Compra {
	int IdCliente;
	float ValorTotal;
	
	public int getIdCliente() {
		return IdCliente;
	}
	public void setIdCliente(int idCliente) {
		IdCliente = idCliente;
	}
	public float getValorTotal() {
		return ValorTotal;
	}
	public void setValorTotal(float valorTotal) {
		this.ValorTotal = valorTotal;
	}
	public Compra(int idCliente, float valorTotal) {
		super();
		IdCliente = idCliente;
		this.ValorTotal = valorTotal;
	}
}
