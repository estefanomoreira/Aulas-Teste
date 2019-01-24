package br.com.maratona.javacore.Npolimorfismo.classes;

public class Gerente extends Funcionario{
	private double pnl;
	
	public double getPnl() {
		return pnl;
	}

	public void setPnl(double pnl) {
		this.pnl = pnl;
	}

	public Gerente(String nome, double salario, double pnl) {
		super(nome, salario);
		this.pnl = pnl;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void calcularPagamento() {
		// TODO Auto-generated method stub
		
	}
	

}
