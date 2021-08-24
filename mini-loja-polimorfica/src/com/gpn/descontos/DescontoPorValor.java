package com.gpn.descontos;

import com.gpn.dados.Produto;

public class DescontoPorValor extends Desconto{

	public DescontoPorValor(Produto produto, double valor) {
		super(produto, valor);
	}

	@Override
	public double calcularDesconto() {
		return produto.getValor() - valor;
	}
}