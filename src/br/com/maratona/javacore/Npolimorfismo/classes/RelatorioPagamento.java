package br.com.maratona.javacore.Npolimorfismo.classes;

public class RelatorioPagamento {
//	public void relatorioPagamentoGerente(Gerente gerente) {
//		System.out.println("Gerando relatorio de pagamento para gerencia");
//		gerente.calcularPagamento();
//		System.out.println("Nome: " + gerente.getNome());
//		System.out.println("Salario: " + gerente.getSalario());
//		
//	}
//	public void relatorioPagamentoVendedor(Vendedor vendedor) {
//		System.out.println("Gerando relatorio de pagamento para vendedores");
//		vendedor.calcularPagamento();
//		System.out.println("Nome: " + vendedor.getNome());
//		System.out.println("Salario: " + vendedor.getSalario());		
//	}

	public void relatorioPagamentoGenerico(Funcionario funcionario) {
		System.out.println("Gerando relatorio de pagamento");
		funcionario.calcularPagamento();
		System.out.println("Nome: " + funcionario.getNome());
		System.out.println("Salario: " + funcionario.getSalario());
	}
}
