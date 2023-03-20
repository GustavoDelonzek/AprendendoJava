package aula07;

import java.util.Random;

public class Luta {
	private Lutador desafiado;
	private Lutador desafiante;
	private int rounds;
	private boolean aprovada;
	
	public void marcarluta(Lutador l1, Lutador l2) {
		if(l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {
			setAprovada(true);
			setDesafiado(l1);
			setDesafiante(l2);
		} else {
			setAprovada(false);
			setDesafiado(null);
			setDesafiante(null);
		}
	}
	public void lutar() {
		if(this.aprovada) {
			desafiado.apresentar();
			desafiante.apresentar();
			
			Random aleatorio = new Random();
			
			int vencedor = aleatorio.nextInt(3);
			switch(vencedor) {
			case 0: //empate
				System.out.println("Empatou!");
				this.desafiado.empatarLuta();
				this.desafiante.empatarLuta();
				break;
			case 1: //Desafiado vence
				System.out.println("Vitória do " + this.desafiado.getNome());
				this.desafiado.ganharLuta();
				this.desafiante.perderLuta();
				break;
			case 2: //Desafiante vence
				System.out.println("Vitória do " + this.desafiante.getNome());
				this.desafiado.perderLuta();
				this.desafiante.ganharLuta();
				break;
			}
		} else {
			System.out.println("A luta não pode acontecer!");
		}
	}
	public Lutador getDesafiado() {
		return desafiado;
	}
	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}
	public Lutador getDesafiante() {
		return desafiante;
	}
	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}
	public int getRounds() {
		return rounds;
	}
	public void setRounds(int rounds) {
		this.rounds = rounds;
	}
	public boolean isAprovada() {
		return aprovada;
	}
	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}
	
	
}
