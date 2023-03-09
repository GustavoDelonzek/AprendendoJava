package aula04;

public class Caneta {
	public String modelo;
	private double ponta;
	private String cor;
	private boolean tampada;
	
	public Caneta(String m, String c, double p){ //Esse é o metodo construtor	
		this.modelo = m;
		this.cor = c;
		this.ponta = p;
		this.tampar();
	}
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public double getPonta() {
		return ponta;
	}
	public void setPonta(double ponta) {
		this.ponta = ponta;
	}
	
	public void tampar() {
		this.tampada = true;
	}
	
	public void destampar() {
		this.tampada = false;
	}
	
	public void status() {
		System.out.println("CANETA");
		System.out.println("Modelo = " + this.getModelo());
		System.out.println("Ponta = " + this.getPonta());
		System.out.println("Cor = " + this.cor);
		System.out.println("Tampada = " + this.tampada);
	}
	
}
