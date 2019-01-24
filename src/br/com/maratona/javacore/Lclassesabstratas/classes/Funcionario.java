package br.com.maratona.javacore.Lclassesabstratas.classes;

public abstract class Funcionario extends Pessoa{

	protected double salario;
	protected String clt;
	
	public Funcionario() {

	}

	public Funcionario(String nome, double salario) {
//		super(nome, cpf, endereco);
		this.nome = nome;
		this.salario = salario;
//		this.clt = clt;
	}

	@Override
	public String toString() {
		return "Funcionario [salario=" + salario + ", clt=" + clt + ", nome=" + nome + ", cpf=" + cpf + ", endereco="
				+ endereco + "]";
	}

	public abstract void calculaSalario();
	
	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getClt() {
		return clt;
	}

	public void setClt(String clt) {
		this.clt = clt;
	}

	public void imprime() {
		super.imprime();
		imprimeRecibo();
		
	}
	
	public void imprimeRecibo() {
		System.out.println("Eu ," + super.nome + ", recebi :" + this.salario);
	}
}
