package br.com.eclipse;

public class Blocos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		label1: {
			System.out.println("label 1 ini");
			label2:{
				System.out.println("label 2 ini");
				label3:{
					System.out.println("label 3 ini");
					if(true)
						break label2;
				}
				System.out.println("label 2 fim");
			}
			System.out.println("label 1 fim");
	}
	
	}

}
