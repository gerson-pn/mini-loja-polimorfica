package com.gpn.pagamentos;

import com.gpn.dados.Produto;
import com.gpn.descontos.Desconto;

public class CartaoCredito extends FormaPagamento  {
	public CartaoCredito(Produto produto, Desconto desconto) {
		super(produto, desconto);
	}
	@Override
	public void processarPagamento() {
		System.out.println("Pagamento com cartão de crédito, de uma vez");
		System.out.println("Nome do produto: " + produto.getNome());
		System.out.println("Valor sem desconto: " + produto.getValor());
		System.out.println("Valor com desconto: " + desconto.calcularDesconto());
	}

	@Override
	public void processarPagamentoParcelado(int numeroVezes) {
		System.out.println("Pagamento com cartão de crédito, em " + numeroVezes + " vezes");
		System.out.println("Nome do produto: " + produto.getNome());
		System.out.println("Valor sem desconto: " + produto.getValor());
		System.out.println("Valor com desconto: " + desconto.calcularDesconto());
		double valorParcela = desconto.calcularDesconto() / numeroVezes;
		System.out.println("Valor parcelado: " + numeroVezes + "x" + valorParcela);

	}

}

