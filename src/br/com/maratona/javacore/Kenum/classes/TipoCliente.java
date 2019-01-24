package br.com.maratona.javacore.Kenum.classes;

public enum TipoCliente {
	// tudo � considerado constante
	PESSOA_FISICA(1, "Pessoa Fisica"), PESSOA_JURIDICA(2, "Pessoa Juridica"){
		public String getId() { // constant specific class body
			return "B";
		}
	};
	
	private int tipo;
	private String nome;

	TipoCliente(int tipo, String nome) {
		this.tipo = tipo;
		this.nome = nome;
	}
	public String getId() {
		return "A";
	}
	public int getTipo() {
		return tipo;
	}

	public String getNome() {
		return nome;
	}

}

