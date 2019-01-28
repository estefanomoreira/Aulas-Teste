package br.com.maratona.javacore.Sdatas.test;

import java.util.Calendar;
import java.util.Date;

public class ManipulacaoDeDatasTest {

	public static void main(String[] args) {
//		Date date = new Date(1_000_000_000_000L); 
		Date date = new Date();
		date.setTime(date.getTime() + 3_600_000); // Nao usar a classe Date!!!
		System.out.println(date);
//		System.out.println(date.getTime());

		Calendar ca = Calendar.getInstance();
		ca.setTime(date);
		if(Calendar.SUNDAY == ca.getFirstDayOfWeek()){
			System.out.println("Domingo e' o primeiro dia da semana");
		}
		
//		System.out.print(ca);
		System.out.println(ca.get(Calendar.DAY_OF_MONTH));
		System.out.println(ca.get(Calendar.DAY_OF_WEEK));
		System.out.println(ca.get(Calendar.DAY_OF_YEAR));
		
		ca.add(Calendar.HOUR, 24); // adicionar horas troca o dia
		ca.roll(Calendar.HOUR, 24); // roll mantem o dia
		ca.roll(Calendar.MONTH, 9); // adicionar horas
		
		Date date2 = ca.getTime();
		System.out.println(date2);
	}

}
