package br.com.maratona.javacore.Uresourcebundle.test;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(Locale.getDefault());
		ResourceBundle rb = ResourceBundle.getBundle("messages", new Locale("pt", "BR"));
//		;
		System.out.println(rb.getString("hello"));
		System.out.println(rb.getString("good.morning"));
		System.out.println(rb.getString("show"));
		System.out.println("======================================");
		ResourceBundle rb2 = ResourceBundle.getBundle("messages", new Locale("en", "US"));
		System.out.println(rb2.getString("hello"));
		System.out.println(rb2.getString("good.morning"));
		System.out.println(rb2.getString("show"));

	}
}