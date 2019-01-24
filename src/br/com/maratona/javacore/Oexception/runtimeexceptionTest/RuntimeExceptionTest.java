package br.com.maratona.javacore.Oexception.runtimeexceptionTest;

public class RuntimeExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object o = null;
//			int a = 10;
//			int b = 0;
//			if(b != 0) {
//				int c = a / b;
//				System.out.println(c);
//			}
		try {
			int[] a = new int[2];
			System.out.println(a[2]);
			System.out.println("imprimindo depois do possivel erro");
		} catch (RuntimeException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
