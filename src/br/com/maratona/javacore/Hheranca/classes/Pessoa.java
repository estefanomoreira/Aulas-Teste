package br.com.maratona.javacore.Hheranca.classes;

public class Pessoa {
	protected String nome;
	protected String cpf;
	protected Endereco endereco;

	public Pessoa(String nome) {
		super();
		this.nome = nome;
	}

	
	public Pessoa(String nome, String cpf, Endereco endereco) {
		this(nome);
		this.cpf = cpf;
		this.endereco = endereco;
	}


	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", cpf=" + cpf + ", endereco=" + endereco + "]";
	}


	public void imprime() {
		System.out.println(this.nome);
		System.out.println(this.cpf);
		System.out.println(this.endereco.getRua());
		System.out.println(this.endereco.getBairro());
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	
	

}
