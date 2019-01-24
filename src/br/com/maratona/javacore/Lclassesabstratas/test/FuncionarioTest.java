package br.com.maratona.javacore.Lclassesabstratas.test;

import br.com.maratona.javacore.Lclassesabstratas.classes.Funcionario;
import br.com.maratona.javacore.Lclassesabstratas.classes.Gerente;
import br.com.maratona.javacore.Lclassesabstratas.classes.Vendedor;

public class FuncionarioTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gerente f = new Gerente("Jose",2000 );
		Vendedor v = new Vendedor("Anna", 2000);
		f.calculaSalario();
		v.calculaSalario();
		
		System.out.println(f);
		System.out.println(v);
	}

}
