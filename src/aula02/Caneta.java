package aula02;

public class Caneta {
	String cor;
	String modelo;
	float ponta;
	int carga;
	boolean tampada;
	
	void status() {
		System.out.println("Cor da caneta: " + this.cor);
		System.out.println("Está tampada? " + this.tampada);
	}
	
	void rabiscar() {
		if (this.tampada == true) {
			System.out.println("ERRO");
		} else {
			System.out.println("RABISCANDO");
		}
	}
	
	void tampar() {
		this.tampada = true;
	}
	
	void destampar() {
		this.tampada = false;
	}
}
