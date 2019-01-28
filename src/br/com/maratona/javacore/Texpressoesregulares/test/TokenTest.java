package br.com.maratona.javacore.Texpressoesregulares.test;

public class TokenTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Willian,1 Paulo,2 Joana,3 Camila,4 Anna,5 John,6 Matheus7";
//		String[] tokens = str.split(", ");
		String[] tokens = str.split("\\d");
		for(String arrr: tokens) {
			System.out.println(arrr.trim());
		}
	}

}
