package br.com.maratona.javacore.introducaoclasses;

public class Carro {
	private String placa;
	private String modelo;
	private float velocidade;
	
	@Override
	public String toString() {
		return "Carro [placa=" + placa + ", modelo=" + modelo + ", velocidade=" + velocidade + "]";
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public float getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(float velocidade) {
		this.velocidade = velocidade;
	}
	public Carro(String placa, String modelo, float velocidade) {
		super();
		this.placa = placa;
		this.modelo = modelo;
		this.velocidade = velocidade;
	}
}
