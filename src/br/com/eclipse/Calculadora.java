package br.com.eclipse;
import java.util.Scanner;
public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double valor1, valor2;
		String operador;
		System.out.println("Entre com um numero: ");
		Scanner in = new Scanner(System.in);
		valor1 = in.nextDouble();
		
		while(true) {
			System.out.println("Entre com o operador: ");
			operador = in.next();
			System.out.println("Entre com outro numero: ");
	//		Scanner n2 = new Scanner(System.in);
			valor2 = in.nextDouble();
	//		System.out.println("A soma é: " + (valor1 - valor2) + operador);
			switch (operador) {
			case "+":
				valor1 = valor1 + valor2;
				System.out.println("A soma é: " + valor1);
				break;
			case "-":
				valor1 = valor1 - valor2;
				System.out.println("A subtracao é: " + valor1);
				break;
			case "*":
				valor1 = valor1 * valor2;
				System.out.println("A multiplicacao é: " + valor1);
				break;
			case "/":
				valor1 = valor1 / valor2;
				System.out.println("A divisao é: " + valor1);
				break;
			default:
				System.out.println("Entre com um numero: ");
				valor1 = in.nextDouble();
			}
		}
	}

}
