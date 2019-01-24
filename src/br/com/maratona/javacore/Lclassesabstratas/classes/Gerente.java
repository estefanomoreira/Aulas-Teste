package br.com.maratona.javacore.Lclassesabstratas.classes;

public class Gerente extends Funcionario{
	public Gerente() {
		
	}
	
	public Gerente(String nome, double salario) {
		super(nome, salario);
	}

	@Override
	public void calculaSalario() {
		// TODO Auto-generated method stub
		this.salario = salario * 1.4;

	}

	
	
}
	