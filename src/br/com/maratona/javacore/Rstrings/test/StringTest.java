package br.com.maratona.javacore.Rstrings.test;

public class StringTest {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
		String nome = "Joao";
		nome.concat(" Bastista"); // Joao e' igual a nome =+ " Batista"
		String nome2 = nome.concat(" Bastista"); //Joa Batista
		String nome3 = new String("Catarina"); // 1 variavel de referencia, 2 um objeto do tipo string, 3- Uma string no Pool de string
//		System.out.println(nome3);
		
		String teste = "Goko";
		String teste2 = "goko";

		System.out.println(teste.charAt(0)); // retorna a letra da posicao
		System.out.println(teste.equals(teste2)); // usar equals para comparar strings
		System.out.println(teste.equalsIgnoreCase(teste2));
		System.out.println(teste.length());
		System.out.println(teste.replace("o", "a"));
		System.out.println(teste.replace("o", "a"));
		System.out.println(teste.substring(0, 2));
		System.out.println(teste.trim()); // retira espacos
		
		
		
		
	}

}
