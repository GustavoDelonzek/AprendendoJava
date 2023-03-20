package aula07;

public class Testes {

	public static void main(String[] args) {
		Lutador[] L = new Lutador[4];
		L[0] = new Lutador("Pretty boy", "França", 31, 1.75, 68.9, 11, 3, 1);
		L[1] = new Lutador("Putscript", "Brasil", 29, 1.68, 57.8, 14, 2, 3);
		L[2] = new Lutador("Snapshadow", "EUA", 35, 1.65, 80.9, 12, 2, 1);
		L[3] = new Lutador("Dead code", "Austrália", 28, 1.93, 81.6, 12, 0 , 2);
		
		Luta UEC01 = new Luta();
		UEC01.marcarluta(L[0], L[3]);
		UEC01.lutar();
		
		Luta UEC02 = new Luta();
		UEC02.marcarluta(L[0], L[1]);
		UEC02.lutar();
		L[0].Status();
		L[1].Status();
	}

}
