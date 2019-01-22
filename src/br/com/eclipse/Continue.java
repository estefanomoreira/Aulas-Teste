package br.com.eclipse;

public class Continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Imprima pares");
		for (int i = 0; i <= 100; i++) {
			if (i % 2 == 0) 
				System.out.println(i);
			else
				continue;
			
			int a = 0, soma = 0;
			while (a <= i) {
				a++;
				soma += a;
			}
			System.out.println("a soma de todos os numeros é: " + soma);
		}
	}

}
