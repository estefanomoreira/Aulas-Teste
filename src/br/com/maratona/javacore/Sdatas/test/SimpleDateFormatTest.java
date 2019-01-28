package br.com.maratona.javacore.Sdatas.test;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class SimpleDateFormatTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar c = Calendar.getInstance();
		String mascara = "'Cajamar,' yyy.MM.dd G 'as' HH:mm:ss z";
		SimpleDateFormat formatador = new SimpleDateFormat(mascara); // tem regras que temq que seguir ver documentacao
		System.out.println(formatador.format(c.getTime()));
		
	}

}
