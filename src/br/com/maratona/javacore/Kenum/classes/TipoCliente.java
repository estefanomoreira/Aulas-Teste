package br.com.maratona.javacore.Kenum.classes;

public enum TipoCliente {
	// tudo é considerado constante
	PESSOA_FISICA(1, "Pessoa Fisica"), PESSOA_JURIDICA(2, "Pessoa Juridica");
	
	private int tipo;
	private String nome;

	TipoCliente(int tipo, String nome) {
		this.tipo = tipo;
		this.nome = nome;
	}

	public int getTipo() {
		return tipo;
	}

	public String getNome() {
		return nome;
	}

}

