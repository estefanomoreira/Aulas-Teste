package br.com.maratona.javacore.Sdatas.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float valor = 123987.45683f;
		Locale locFR = new Locale("FR");
		NumberFormat[] nfa = new NumberFormat[4];
		nfa[0] = NumberFormat.getInstance();
		nfa[1] = NumberFormat.getInstance(locFR);
		nfa[2] = NumberFormat.getCurrencyInstance();
		nfa[3] = NumberFormat.getCurrencyInstance(locFR);

		for (NumberFormat nf : nfa) {
			System.out.println(nf.format(valor));
		}
		NumberFormat nf = NumberFormat.getInstance();
		System.out.println(nf.getMaximumFractionDigits());
		nf.setMaximumFractionDigits(1);
		System.out.println(nf.format(valor));
		String valorString = "123987,45A683";
		try {
			System.out.println(nf.parse(valorString));
			nf.setParseIntegerOnly(true);
			System.out.println(nf.parse(valorString));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
