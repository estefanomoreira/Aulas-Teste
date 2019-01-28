package br.com.maratona.javacore.Rstrings.test;

public class StringPerformanceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long inicio = System.currentTimeMillis();
		concatString(30000);
		long fim = System.currentTimeMillis();
		System.out.println("Tempo gasto: " + (fim - inicio) + "ms");
		
		inicio = System.currentTimeMillis();
		concatStringBuilder(30000);
		fim = System.currentTimeMillis();
		System.out.println("Tempo gasto StringBuilder: " + (fim - inicio) + "ms");
		
		inicio = System.currentTimeMillis();
		concatStringBuffer(30000);
		fim = System.currentTimeMillis();
		System.out.println("Tempo gasto StringBuffer: " + (fim - inicio) + "ms");
	}
	
	public static void concatString (int tam) {
		String string = "";
		for(int i = 0; i < tam; i++) {
			string += i;
		}
	}
		
	public static void concatStringBuilder (int tam) { // StringBuilder melhor performance
		StringBuilder sb = new StringBuilder(tam);     // multi thread
		for(int i = 0; i < tam; i++) {
			sb.append(i);
		}
	}
	
	public static void concatStringBuffer (int tam) { // StringBuilder melhor performance
		StringBuffer sb = new StringBuffer(tam);	  // single thread
		for(int i = 0; i < tam; i++) {
			sb.append(i);
		}
	}
}
