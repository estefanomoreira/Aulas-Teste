package br.com.maratona.javacore.Jmodificadorfinal.classes;

import br.com.maratona.javacore.introducaoclasses.*;
public class Carro1 extends Carro {
	private String nome, marca;
	public static double VELOCIDADE_FINAL = 250;
	
	public Carro1(String placa, String modelo, float velocidade, String nome, String marca) {
		super(placa, modelo, velocidade);
		this.nome = nome;
		this.marca = marca;
	}



	@Override
	public String toString() {
		return "Carro1 [nome=" + nome + ", marca=" + marca + ", toString()=" + super.toString() + "]";
	}



	public static double getVELOCIDADE_FINAL() {
		return VELOCIDADE_FINAL;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

}
