package br.com.maratona.javacore.introducaoclassestest;
import br.com.maratona.javacore.introducaoclasses.Estudante;

public class EstudanteTest {

	public static void main(String[] args) {
		Estudante joao = new Estudante();
		joao.nome = "Joao";
		joao.matricula = "1212";
		joao.idade = 15;
		
		System.out.println(joao.nome);

	}

}
