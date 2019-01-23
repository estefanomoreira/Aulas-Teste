package br.com.maratona.javacore.Hheranca.classes;

public class Funcionario extends Pessoa{

	private double salario;

	public Funcionario(String nome) {
		super(nome);
	}

	@Override
	public String toString() {
		return "Funcionario [salario=" + salario + ", nome=" + nome + ", cpf=" + cpf + ", endereco=" + endereco + "]";
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public void imprime() {
		super.imprime();
		imprimeRecibo();
		
	}
	
	public void imprimeRecibo() {
		System.out.println("Eu ," + super.nome + ", recebi :" + this.salario);
	}
}
