package br.com.maratona.javacore.Vio.test;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterReaderTest {
	public static void main(String[] args) {
		File file = new File("../Aulas-Teste/src/br/com/maratona/javacore/Vio/test/Arquivo.txt");
		try (FileWriter fw = new FileWriter(file, true); FileReader fr = new FileReader(file);) {
			fw.write("escrevendo uma mensagem no arquivo\n E pulando uma linha");
			fw.flush();
			; // para ter certeza que mandou tudo

			char[] in = new char[500];
			int size = fr.read(in);
			System.out.println("tamanho " + size);
			for (char c : in) {
				System.out.print(c);
			}
		} catch (

		IOException e) {
			e.printStackTrace();
		}

//	try	{
//		FileWriter fw = new FileWriter(file, true);
//		fw.write("escrevendo uma mensagem no arquivo\n E pulando uma linha");
//		fw.flush();
//		; // para ter certeza que mandou tudo
//		fw.close();
//
//		FileReader fr = new FileReader(file);
//		char[] in = new char[500];
//		int size = fr.read(in);
//		System.out.println("tamanho " + size);
//		for (char c : in) {
//			System.out.print(c);
//		}
//		fr.close();
//	}catch(
//	IOException e)
//	{
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
	}
}
