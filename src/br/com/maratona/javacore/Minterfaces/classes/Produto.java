package br.com.maratona.javacore.Minterfaces.classes;

public class Produto implements Tributavel, Trasportavel{ // em implements se diz: e' um ...
	private String nome;
	private double preco;
	private double peso;
	private double precoFinal;
	private double valorFrete;
	
	public double getPrecoFinal() {
		return precoFinal;
	}

	public double getValorFrete() {
		return valorFrete;
	}

	@Override
	public void calcularImposto() {
		// TODO Auto-generated method stub
		precoFinal = this.preco * IMPOSTO;
	}

	@Override
	public void calculaFrete() {
		// TODO Auto-generated method stub
		this.valorFrete  = this.preco / peso * 0.1;
	}

	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", preco=" + preco + ", peso=" + peso + ", precoFinal com imposto=" + precoFinal
				+ ", valorFrete=" + valorFrete + "]";
	}

	public Produto(String nome, double preco, double peso) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.peso = peso;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
}
