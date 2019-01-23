package br.com.maratona.javacore.Hheranca.test;

import br.com.maratona.javacore.Hheranca.classes.Endereco;
import br.com.maratona.javacore.Hheranca.classes.Funcionario;
import br.com.maratona.javacore.Hheranca.classes.Pessoa;

public class HerancaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pessoa p = new Pessoa("Maria");
		Endereco end = new Endereco(null, null);
		
//		p.setNome("Maria");
		p.setCpf("123.123.123-10");
		end.setRua("rua ipanema");
		end.setBairro("Paraiso");
		
		p.setEndereco(end);
//		System.out.println(p.getEndereco().getBairro());
		Funcionario f = new Funcionario(p.getNome());
//		f.setNome(p.getNome());
		f.setCpf(p.getCpf());
		f.setEndereco(p.getEndereco());
		f.setSalario(4000);
//		System.out.println(f);
		f.imprime();
		
	}

}
