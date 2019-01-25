package br.com.maratona.javacore.Oexception.checkedexceptionTest;

import java.io.File;
import java.io.IOException;

public class CheckedExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			try {
				criarArquivo();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

	public static void criarArquivo() throws IOException {
		File file = new File("Teste.txt");
		try {
			System.out.println("Arquivo criado?: " + file.createNewFile());
		} catch (IOException e) {
			e.printStackTrace();
			throw e;
		}
	}
}

// outra forma de tratar excessao
//public class CheckedExceptionTest {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		try {
//			criarArquivo();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//
//	public static void criarArquivo() throws IOException {
//		File file = new File("Teste.txt");
//		try {
//			System.out.println("Arquivo criado?: " + file.createNewFile());
//		} catch (IOException e) {
//			e.printStackTrace();
//			System.out.println("Nao");
//		}
//	}
//}
