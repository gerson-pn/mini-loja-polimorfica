package com.gpn.pagamentos;

import com.gpn.dados.Produto;
import com.gpn.descontos.Desconto;

public class Boleto extends FormaPagamento {

	public Boleto(Produto produto, Desconto desconto) {
		super(produto, desconto);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void processarPagamento() {
		System.out.println("Nome do produto: " + produto.getNome());
		System.out.println("Valor sem desconto: " + produto.getValor());
		System.out.println("Valor com desconto: " + desconto.calcularDesconto());
	}
}