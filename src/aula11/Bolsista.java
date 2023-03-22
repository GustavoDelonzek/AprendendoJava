package aula11;

public class Bolsista extends Aluno{
	private int bolsa;
	
	public void renovarBolsa() {
		System.out.println("Renovando bolsa de " + getNome());
	}
	
	@Override
	public void pagarMensalidade() {
		System.out.println(getNome() + " é bolsita, pagamento facilitado!");
	}
	
	public int getBolsa() {
		return bolsa;
	}

	public void setBolsa(int bolsa) {
		this.bolsa = bolsa;
	}
	
}
