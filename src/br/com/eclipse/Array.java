package br.com.eclipse;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array;
		array = new int[10];
		System.out.printf("%s%10s\n","indice","valores");
		for(int i = 0; i <=9; i++) {
			System.out.printf("{%5d} {%7d}\n", i, array[i]);
		}
	}

}
