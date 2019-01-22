package br.com.eclipse;

import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		System.out.println("Digite um numero");
		Scanner in = new Scanner(System.in);
//		in.close();
//		System.out.println(in.nextLine());
		int contador = 0;
		int max = Integer.parseInt(in.nextLine());
		while(contador <= max) {
			System.out.println(contador);
			contador ++;
		}
	}

}