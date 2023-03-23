package aula12;

public class Aula012 {

	public static void main(String[] args) {
		//Mamifero m = new Mamifero();
		//Reptil r = new Reptil();
		//Peixe p = new Peixe();
		//Ave a = new Ave();
		
		//m.setPeso(85.3);
		//m.setIdade(2);
		//m.setMembros(4);
		//m.locomover();
		//m.alimentar();
		//m.emitirSom();
		
		//p.setPeso(0.35);
		//p.setIdade(1);
		//p.setMembros(0);
		//p.locomover();
		//p.alimentar();
		//p.emitirSom();
		//p.soltarBolha();
		//System.out.println("-----------------");
		//a.setPeso(0.89);
		//a.setIdade(2);
		//a.setMembros(2);
		//a.locomover();
		//a.alimentar();
		//a.emitirSom();
		//a.fazerNinho();
		
		//NOVOS TESTES
		Mamifero m = new Mamifero();
		Canguru c = new Canguru();
		Cachorro k = new Cachorro();
		
		m.setPeso(5.70);
		m.setIdade(8);
		m.setMembros(4);
		m.locomover();
		m.alimentar();
		m.emitirSom();
		
		c.setPeso(55.40);
		c.setIdade(3);
		c.setMembros(4);
		c.locomover();
		c.alimentar();
		c.emitirSom();
		c.usarBolsa();
		
		k.emitirSom();
		
	}

}
