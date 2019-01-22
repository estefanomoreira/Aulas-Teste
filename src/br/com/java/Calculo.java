package br.com.java;

class Calcula {
	void soma(int num1, int num2) {
		System.out.println(num1 + num2);
	}

}

public class Calculo{
	public static void main(String args []) {
		Calcula cal = new Calcula();
		cal.soma(1, 2);

	}
}