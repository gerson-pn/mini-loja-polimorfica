package com.gpn.dominio;

import com.gpn.dados.Produto;
import com.gpn.descontos.Desconto;
import com.gpn.descontos.DescontoPorValor;
import com.gpn.io.Entrada;

public class CriadorDesconto {
	private Entrada leitor;

	public Desconto criarDesconto(Produto produto) {
		leitor = new Entrada();
		System.out.println("0 - Não\n1 - Sim");
		int opcaoDesconto = leitor.receberNumeroInteiro();
		if (opcaoDesconto == 1) {
			System.out.println("Qual o valor do desconto?");
			double valorDesconto = leitor.receberNumeroDouble();
			Desconto desconto = new DescontoPorValor(produto, valorDesconto);
			return desconto;
		}else {
			Desconto desconto = new DescontoPorValor(produto,0);
			return desconto;
		}

	}
}
