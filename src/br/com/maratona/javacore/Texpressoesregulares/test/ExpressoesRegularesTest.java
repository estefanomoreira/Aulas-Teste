package br.com.maratona.javacore.Texpressoesregulares.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressoesRegularesTest {
	public static void main(String[] args) {
		
//		String regex = "aba";
//		String texto = "abababa";
//		Pattern pattern = Pattern.compile(regex);
//		Matcher matcher = pattern.matcher(texto);
//		System.out.println("texto:  " + texto);
//		System.out.println("indice: 0123456789");
//		System.out.println("expressao: "+ matcher.pattern());
//		while(matcher.find()) {
//			System.out.print(matcher.start() + " ");
//		}
		
		// metacaracteres
		// \d - todos os digitos
		// \D - todos os nao digitos
		// \s - espacos em branco estes sao espacos na ASC: \t \n \f \r
		// \S - caractere que nao e' branco
		// \w - caracteres de palavras a-z A-Z digitos e _
		// \W - o que nao for caractere de palavra
		// []
		// Quantificadores: 
		//	? zero ou uma
		// 	* zero ou mais
		//	+ uma ou mais
		//	{n,m} de n ate m {2, } deixar em branco para ate infinito 
		// ( ) exemplo o(v|c)0 = ovo, oco
		// |
		// $ fim de linha
		// . coringa ex: 1.3 = 123, 133, 1#3, 1 3
		// ^ caractere de negacao [^abc]
		
		
		
////		int numeroHex = 0X;
//		int hex = 0x1;
//		String regex = "0[xX]([0-9a-fA-F])+(\\s|$)"; //"[abcABC]" "[a-zA-Z]" [a-zA-Z0-9]
//		String texto = "12 0x 0X 0xFFABC 0x10G 0x1";
//		Pattern pattern = Pattern.compile(regex);
//		Matcher matcher = pattern.matcher(texto);
//		System.out.println("texto:  " + texto);
//		System.out.println("indice: 0123456789");
//		System.out.println("expressao: "+ matcher.pattern());
//		System.out.println("posicoes encontradas: ");
//		while(matcher.find()) {
//			System.out.println(matcher.start() + " " + matcher.group());
//		}
////		System.out.println(numeroHex);
		
//		int numeroHex = 0X;
//		int hex = 0x1;
//		String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+"; //"[abcABC]" "[a-zA-Z]" [a-zA-Z0-9]
//		String regex = "([\\w\\.])+@(\\w)+(\\.([a-zA-Z])+)+"; //"[abcABC]" "[a-zA-Z]" [a-zA-Z0-9]
//		String texto = "fulano@hotmail.com, 102Abc@gmail.com, #@!abrao@mail.br, teste@gmail.com.co.br, teste@mail";
		
//		String regex = "\\d{2}/\\d{2}/\\d{2,4}";
//		String texto = "05/10/2010 05/05/2015 1/1/01 01/05/95"; //dd/MM/yyyy
		
		String regex = "proj([^,])*";
		String texto = "proj1.bkp, proj1.java proj1.classe, proj1final.java ,proj2.bkp, proj3.java, diagrama, texto, foto"; //dd/MM/yyyy
		
		
//		System.out.println("Email valido? " + "#@!abrao@mail.br".matches(regex)); // para validar
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(texto);
		System.out.println("texto:  " + texto);
		System.out.println("indice: 0123456789");
		System.out.println("expressao: "+ matcher.pattern());
		System.out.println("posicoes encontradas: ");
		while(matcher.find()) {
			System.out.println(matcher.start() + " " + matcher.group());
		}
//		System.out.println(numeroHex);

	}

}
