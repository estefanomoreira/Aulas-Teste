package br.com.java;

class Fatorial {
	int fat(int n) {
		if (n <= 1)
			return 1;
		int r = fat(n - 1) * n;
		return r;
	}
}

public class Recursividade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new Fatorial().fat(5));
	}

}
