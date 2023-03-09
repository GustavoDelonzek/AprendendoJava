package aula03;

public class Caneta {
	public String cor;
	public String modelo;
	private float ponta;
	protected int carga;
	private boolean tampada;
	
	public void status(){
		System.out.println("cor= " + this.cor);
		System.out.println("Modelo= " + this.modelo);
		System.out.println("Ponta= "+ this.ponta);
		System.out.println("Carga= " + this.carga);
		System.out.println("Esta tampada? " + this.tampada);
	}

	public void rabiscar() {
		if (this.tampada == true) {
			System.out.println("ERRO");
		} else {
			System.out.println("RABISCANDO");
		}
	}
	
	public void tampar() {
		this.tampada = true;
	}
	
	public void destampar() {
		this.tampada = false;
	}
}
