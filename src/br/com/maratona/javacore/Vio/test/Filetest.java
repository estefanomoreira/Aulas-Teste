package br.com.maratona.javacore.Vio.test;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class Filetest {
// como criar deletar e pegar informacoes basicas de arquivos
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("../Aulas-Teste/src/br/com/maratona/javacore/Vio/test/Arquivo.txt");
		try {
			System.out.println(file.createNewFile());
			boolean exists = file.exists();
			System.out.println("Permissao de leitura?: " + file.canRead());
			System.out.println("Path : " + file.getPath());
			System.out.println("Path full : " + file.getAbsolutePath());
			System.out.println("diretorio?: "+ file.isDirectory());
			System.out.println("hidden?: "+ file.isHidden());
			System.out.println("last mod?: "+ file.lastModified());
			System.out.println("last mod?: "+ new Date(file.lastModified()));
			
			
			if(exists) {
				System.out.println("Deletado?: " + file.delete());
			}
//			System.out.println(newFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
