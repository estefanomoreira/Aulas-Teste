package br.com.maratona.javacore.Texpressoesregulares.test;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner("1 true 100 oi");
//		scanner.useDelimiter("-"); // se precisar torcar o delimitador o padrao e' o espaco
		while (scanner.hasNext()) {
			System.out.println(scanner.next()); // next ja muda o indice automaticamente
		}
		System.out.println("-----------------------");
		Scanner scanner2 = new Scanner("1 true 100 oi");
		while (scanner2.hasNext()) {
			if (scanner2.hasNextInt()) {
				int i = scanner2.nextInt();
				System.out.println("int " + i);
			} else if (scanner2.hasNextBoolean()) {
				boolean b = scanner2.nextBoolean();
				System.out.println(b);
			} else {
				System.out.println(scanner2.next());
			}
		}
	}

//		

}
