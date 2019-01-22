package br.com.eclipse;
import java.util.Scanner;

public class Aula008 {
	public static void main (String[] args) {
		
		// TODO Auto-generated method stub
		System.out.println("Informe a idade do cachorro: ");
		Scanner in = new Scanner(System.in);
		int idadeCachorro = in.nextInt();
		idadeCachorro *= 7;
		System.out.println("Seu chachorro tem: " + idadeCachorro + " anos");
		

	}
}
