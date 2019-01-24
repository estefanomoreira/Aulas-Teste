package br.com.maratona.javacore.Lclassesabstratas.classes;

public class Vendedor extends Funcionario{
	
	public Vendedor() {
		
	}
	
	public Vendedor(String nome, double salario) {
		super(nome, salario);
	}

	@Override
	public void calculaSalario() {
			this.salario = salario * 1.2;
	}
}
