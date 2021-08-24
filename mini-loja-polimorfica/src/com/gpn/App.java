package com.gpn;

import com.gpn.io.Entrada;

public class App {
	public static void main(String[] args) {
		boolean execucao = true;;

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
				break;
			case 2:
				break;
			}

		}
	}
}