package com.gpn.descontos;

import com.gpn.dados.Produto;

public abstract class Desconto {
	protected Produto produto;
	protected double valor;

	public Desconto(Produto produto, double valor) {
		this.produto = produto;
		this.valor = valor;
	}

	public abstract double calcularDesconto();

	public Produto getProduto() {
		return produto;
	}

	public double getValor() {
		return valor;
	}
}