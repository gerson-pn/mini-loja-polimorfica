package com.gpn.dominio;

import com.gpn.dados.Estoque;
import com.gpn.dados.Produto;
import com.gpn.io.Entrada;

public class Seletor {
	private Entrada leitor;

	public Produto selecionarProduto(Estoque estoque) {
		leitor = new Entrada();
		System.out.println("\nDigite o ID do produto:");
		int id = leitor.receberNumeroInteiro();
		Produto produtoEscolhido = estoque.getProdutos().get(id - 1);
		System.out.println("Produto escolhido:");
		System.out.println("Nome: " + produtoEscolhido.getNome() + " valor: " + produtoEscolhido.getValor());
		System.out.println("Deseja aplicar um desconto sobre o valor do produto?");
		return produtoEscolhido;
	}
}
