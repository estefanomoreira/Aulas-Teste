package br.com.maratona.javacore.introducaoclassestest;

import br.com.maratona.javacore.introducaoclasses.Carro;

public class CarroTest {
	public static void main(String[] args) {
		Carro carro = new Carro("EYL9645", "J3 Turim", 150);
		System.out.println(carro.getPlaca());
		System.out.println(carro.getModelo());
		System.out.println(carro.getVelocidade());
	}
}
