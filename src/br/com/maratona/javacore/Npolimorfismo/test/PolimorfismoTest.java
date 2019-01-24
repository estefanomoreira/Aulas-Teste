package br.com.maratona.javacore.Npolimorfismo.test;

import br.com.maratona.javacore.Npolimorfismo.classes.Gerente;
import br.com.maratona.javacore.Npolimorfismo.classes.RelatorioPagamento;
import br.com.maratona.javacore.Npolimorfismo.classes.Vendedor;

public class PolimorfismoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gerente g = new Gerente("Fabio", 5000, 2000);
		Vendedor v = new Vendedor("Yuri", 2000, 20000);
		RelatorioPagamento relatorio = new RelatorioPagamento();
//		relatorio.relatorioPagamentoGerente(g);
//		System.out.println("-----------------");
//		relatorio.relatorioPagamentoVendedor(v);
		
		relatorio.relatorioPagamentoGenerico(g);
		System.out.println("-----------------");
		relatorio.relatorioPagamentoGenerico(v);
		
	}

}
