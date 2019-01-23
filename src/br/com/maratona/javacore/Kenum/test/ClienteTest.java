package br.com.maratona.javacore.Kenum.test;

import br.com.maratona.javacore.Kenum.classes.Cliente;
//import br.com.maratona.javacore.Kenum.classes.Cliente.TipoPagamento;
import br.com.maratona.javacore.Kenum.classes.TipoCliente;

public class ClienteTest {
	public static void main (String[] args) {
		
		Cliente p = new Cliente("Vania", TipoCliente.PESSOA_JURIDICA, Cliente.TipoPagamento.AVISTA);
		System.out.println(p);
	}
}
