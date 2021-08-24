package com.gpn.pagamentos;

import com.gpn.dados.Produto;
import com.gpn.descontos.Desconto;

public class CartaoDebito extends FormaPagamento{

	public CartaoDebito(Produto produto, Desconto desconto) {
		super(produto, desconto);
	}

	@Override
	public void processarPagamento() {
		System.out.println("Pagamento com cartão de débito, à vista");
		System.out.println("Nome do produto: " + produto.getNome());
		System.out.println("Valor sem desconto: " + produto.getValor());
		System.out.println("Valor com desconto: " + desconto.calcularDesconto());
	}

	@Override
	public void processarPagamentoParcelado(int numeroVezes) {
		
	}

}