package br.com.eclipse;

public class ArrayAninhado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 11, b = 11;
		int[][] matriz = new int [a][b];


		String str = "";
		for(int x = 0; x < a; x++) {
			for(int y = 0; y < b; y++) {
				matriz[x][y] = (2 * x) + (y * y);
//				System.out.println(matriz[x][y]);
				
				if (y < b -1) 
					str += matriz[x][y] + ", ";
				else
					str += matriz[x][y] + ",\n";
				
			}
		}
		System.out.println(str);
	}

}
