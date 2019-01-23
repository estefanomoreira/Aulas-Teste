package br.com.maratona.javacore.Kenum.classes;

public class Clientes {
	private String nome;
	public static final int PESSOA_FISICA = 1;
	public static final int PESSOA_JURIDICA = 2;
	private int tipo;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	public Clientes(String nome, int tipo) {
		super();
		this.nome = nome;
		this.tipo = tipo;
	}
	@Override
	public String toString() {
		String tipoP;
		if(tipo == 1)
			tipoP = "Pessoa Fisica";
		else
			tipoP = "Pessoa Juridica";
		return "Cliente\n  nome: " + this.nome + "\n  tipo: " + tipoP;
	}
	
	
	
}
