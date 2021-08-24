package com.gpn;

import com.gpn.dados.Estoque;
import com.gpn.dados.Produto;
import com.gpn.descontos.Desconto;
import com.gpn.dominio.CriadorDesconto;
import com.gpn.dominio.Seletor;
import com.gpn.io.Entrada;
import com.gpn.pagamentos.Boleto;
import com.gpn.pagamentos.FormaPagamento;

public class App {
	public static void main(String[] args) {
		Estoque estoque = new Estoque();
		boolean execucao = true;

		while (execucao) {
			System.out.println("Qual operação você deseja fazer:");
			System.out.println("1 - Cadastrar um produto");
			System.out.println("2 - Listar produtos");
			System.out.println("3 - Obter forma de pagamento");
			System.out.println("0 - Sair do sistema");

			Entrada leitor = new Entrada();
			int operacao = leitor.receberNumeroInteiro();

			switch (operacao) {
			case 0:
				execucao = false;
				System.out.println("Até mais!\n");
				break;
			case 1:
				leitor = new Entrada();
				System.out.println("\nDigite o nome do produto:");
				String nome = leitor.receberTexto();
				System.out.println("Digite o valor do produto:");
				double valor = leitor.receberNumeroDouble();
				Produto produto = new Produto(nome, valor);
				estoque.getProdutos().add(produto);
				System.out.println("\n");
				break;
			case 2:
				System.out.println("\nLista de todos os produtos:");
				for (int i = 0; i < estoque.getProdutos().size(); i++) {
					Produto item = estoque.getProdutos().get(i);
					System.out.println("ID: " + (i + 1) + " Nome: " + item.getNome() + " valor: " + item.getValor());
				}
				System.out.println("\n");
				break;
			case 3:
				Seletor seletor = new Seletor();
				Produto produtoEscolhido = seletor.selecionarProduto(estoque);
				CriadorDesconto criadorDesconto = new CriadorDesconto();
				Desconto desconto = criadorDesconto.criarDesconto(produtoEscolhido);
				FormaPagamento formaPagamento = new Boleto(produtoEscolhido, desconto);
				formaPagamento.processarPagamento();
				break;
			}

		}
	}
}