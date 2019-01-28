package br.com.maratona.javacore.Sdatas.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ISO 639 - pt=portugues BR - BRazil, en - ingles ...
		Locale locale = new Locale("it", "IT");
		Locale locSuica = new Locale("it", "CH");

		Calendar c = Calendar.getInstance();
		c.set(2015, Calendar.DECEMBER, 23);
		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, locale);
		DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, locSuica);
		System.out.println(df.format(c.getTime()));
		System.out.println(df2.format(c.getTime()));
				
	}

}
