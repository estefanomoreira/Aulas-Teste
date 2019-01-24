package br.com.maratona.javacore.Oexception.checkedexceptionTest;

import java.io.File;
import java.io.IOException;


public class CheckedExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		criarArquivo();
	}
	
	public static void criarArquivo() {
		File file = new File("Teste.txt");
		try {
			System.out.println("Arquivo criado?: " + file.createNewFile());						
		}catch(IOException e) {
			e.printStackTrace();
			System.out.println("Nao");
		}
	}
}
