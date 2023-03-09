package exercicioObjetos;

public class banco {
	public int numConta;
	protected String tipo;
	private String dono;
	private double saldo;
	private boolean status;
	
	public banco() {
		setStatus(false); 
		setSaldo(0);
	}
	
	public void abrirConta(String x){
		this.setStatus(true);
		this.setTipo(x);
		if (x == "cc") {
			this.setSaldo(50);
		} else if(x == "cp") {
			this.setSaldo(150);
		}
	}
	
	public void fecharConta() {
		if (this.saldo > 0){
			System.out.printf("A conta tem dinheiro");
		} else if(this.saldo < 0) {
			System.out.println("Você está com saldo negativo, o cancelamento da conta foi NEGADO!");
		} else {
			setStatus(false);
		}
	}
	
	public void depositar(double x) {
		if(isStatus()) {
			this.saldo += x;
		} else {
			System.out.println("Conta fechada!");
		}
		
	}
	
	public void sacar(double x) {
		if (x <= this.saldo){
			this.saldo -= x;
		} else {
			System.out.println("Saldo insuficiente para o saque!\n");
		}
	}
	
	public void pagarMensal() {
		if (this.tipo == "cc"){
			this.saldo -= 12;
			System.out.printf("Foram pagos 12 reais na mensalidade, seu saldo atual é de R$%.2f\n", this.saldo);
		} else {
			this.saldo -= 20;
			System.out.printf("Foram pagos 20 reais na mensalidade, seu saldo atual é de R$%.2f", this.saldo);
		}
	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "banco [numConta=" + numConta + ", tipo=" + tipo + ", dono=" + dono + ", saldo=" + saldo + ", status="
				+ status + "]";
	}
	
	
}
