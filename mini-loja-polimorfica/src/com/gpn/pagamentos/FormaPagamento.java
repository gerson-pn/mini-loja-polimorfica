package com.gpn.pagamentos;

import com.gpn.dados.Produto;
import com.gpn.descontos.Desconto;

public abstract class FormaPagamento {
	protected Produto produto;
	protected Desconto desconto;
	public FormaPagamento(Produto produto, Desconto desconto) {
		this.produto = produto;
		this.desconto = desconto;
	}
	public abstract void processarPagamento();
	public abstract void processarPagamentoParcelado(int numeroVezes);
}

