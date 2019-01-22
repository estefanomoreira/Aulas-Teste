package br.com.eclipse;

public class ForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] lista = new int[5];
		
		lista[0] = 5;
		lista[1] = 4;
		lista[2] = 3;
		lista[3] = 2;
		lista[4] = 1;
		
		for(int item:lista) {
			System.out.println(item);
		}
	}

}
