package br.com.java;

class Medidas {
	float altura, peso, cintura, pescoco;
	char calca, camisa, sapato;
}

class Aparencia {
	String corPele = "branco";
	String corOlhos = "verdes";
	String corCabelos, tipoCabelos;

	public String getCorOlhos() {
		return corOlhos;
	}

	public void setCorOlhos(String corOlhos) {
		this.corOlhos = corOlhos;
	}
	
}

class Pessoa{
	String nome;
	String sobrenome;
	
	Aparencia ap = new Aparencia();
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aparencia ap = new Aparencia();
		ap.setCorOlhos("azuis") ;
	}

}
