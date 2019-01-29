package br.com.maratona.javacore.Vio.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("../Aulas-Teste/src/br/com/maratona/javacore/Vio/test/Arquivo.txt");
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(file));
				BufferedReader br = new BufferedReader(new FileReader(file))) {
			bw.write("Escrevendo mais mensagens: ");
			bw.newLine();
			bw.write("MAis linhas ...");
			bw.flush();
			String s;
			while ((s = br.readLine()) != null) {
				System.out.println(s);
			}
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
