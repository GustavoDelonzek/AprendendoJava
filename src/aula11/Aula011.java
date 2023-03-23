package aula11;

public class Aula011 {

	public static void main(String[] args) {
		Aluno a1 = new Aluno();
		a1.setNome("Gustavo");
		a1.setMatricula(1111);
		a1.pagarMensalidade();
		Bolsista a2 = new Bolsista();
		a2.setNome("Alfredo");
		a2.setBolsa(12);
		a2.setSexo("M");
		a2.pagarMensalidade();
	}

}
