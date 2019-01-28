package br.com.maratona.javacore.Sdatas.test;

import java.text.DateFormat;
import java.util.Calendar;

public class DateFormatTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar c = Calendar.getInstance();
		DateFormat[] dfa = new DateFormat[6];
		dfa[5] = DateFormat.getInstance();
		dfa[0] = DateFormat.getDateInstance();
		dfa[1] = DateFormat.getDateInstance(DateFormat.SHORT);
		dfa[2] = DateFormat.getDateInstance(DateFormat.MEDIUM);
		dfa[3] = DateFormat.getDateInstance(DateFormat.LONG);
		dfa[4] = DateFormat.getDateInstance(DateFormat.FULL);
		
		for (DateFormat df:dfa) {
			System.out.println(df.format(c.getTime()));
		}
	}

}
