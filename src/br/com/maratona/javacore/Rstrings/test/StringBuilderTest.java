package br.com.maratona.javacore.Rstrings.test;

public class StringBuilderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String string = "Uma frase comum";
		StringBuilder sb = new StringBuilder(16);
		//sBuilder += sb;  erro
		// 
		sb.append("Uma frase comum"); //appendo e' igual a concat ou +=
		System.out.println(sb);
		System.out.println(sb.reverse()); // inverte a ordem
		sb.append("0123456789");
		System.out.println(sb.delete(0, 2));
		System.out.println(sb.insert(2, "####"));
		sb.append("def").insert(3, "ghi").reverse().delete(2, 4);
		System.out.println(sb);
		
	}

}
