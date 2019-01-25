package br.com.maratona.javacore.Oexception.runtimeexceptionTest;

public class RuntimeExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			divisao(10, 0);
			;
		} catch (RuntimeException e) {
			// TODO: handle exception
			System.out.println(e.getMessage()); // pega somente a mensagem
			e.printStackTrace();
		}
	}

	private static void divisao(int num1, int num2) {
		if (num2 == 0) {
			throw new IllegalArgumentException("dif de zero");
		}
		int result = num1 / num2;
		System.out.println(result);
	}
}

// public static void main(String[] args) {
//	Object o = null;
////int a = 10;
////int b = 0;
////if(b != 0) {
////	int c = a / b;
////	System.out.println(c);
////}
//try {
//int[] a = new int[2];
//System.out.println(a[2]);
//System.out.println("imprimindo depois do possivel erro");
//} catch (RuntimeException e) {
//// TODO: handle exception
//e.printStackTrace();
//}
//}