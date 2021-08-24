package com.gpn.dados;

import java.util.*;

public class Estoque {
	private List<Produto> produtos;
	public Estoque() {
		produtos = new ArrayList<>();
	}
	public List<Produto> getProdutos() {
		return produtos;
	}
}