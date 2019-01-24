package br.com.maratona.javacore.Npolimorfismo.classes;

public class Vendedor extends Funcionario{
	public Vendedor(String nome, double salario) {
		super(nome, salario);
		// TODO Auto-generated constructor stub
	}

	private double totalVendas;

	public Vendedor(String nome, double	 salario, double totalVendas) {
		super(nome, salario);
		this.totalVendas = totalVendas;
	}

	@Override
	public void calcularPagamento() {
		// TODO Auto-generated method stub
		this.salario = this.salario + totalVendas * 0.05;
	}
	
	
}
