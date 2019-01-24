package br.com.maratona.javacore.Minterfaces.test;

import br.com.maratona.javacore.Minterfaces.classes.Produto;

public class ProdutoTest {
	public static void main (String[] args) {
		Produto p = new Produto("Notebook", 3000, 4);
		p.calcularImposto();
		p.calculaFrete();
		System.out.println(p);
	}
}
