package exercicioPratc;

public class Livro implements Publicacao{
	private String titulo;
	private String autor;
	private int totPaginas;
	private int pagAtual;
	private boolean aberto; 
	private Pessoa leitor;
	
	public String detalhes() {
		return "Livro \nTitulo= " + titulo + ", Autor= " + autor + "; \nTotPaginas= " + totPaginas + ", PagAtual= " + pagAtual
				+ ";\nAberto= " + aberto + "; \nLeitor= " + leitor.getNome() + ", Idade= " + leitor.getIdade() + ", Sexo= " + leitor.getSexo() + ";";
	}
	
	// construtor
	public Livro(String titulo, String autor, int totPaginas,Pessoa leitor) {
		this.titulo = titulo;
		this.autor = autor;
		this.totPaginas = totPaginas;
		this.aberto = false;
		this.pagAtual = 0;
		this.leitor = leitor;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getTotPaginas() {
		return totPaginas;
	}
	public void setTotPaginas(int totPaginas) {
		this.totPaginas = totPaginas;
	}
	public int getPagAtual() {
		return pagAtual;
	}
	public void setPagAtual(int pagAtual) {
		this.pagAtual = pagAtual;
	}
	public boolean isAberto() {
		return aberto;
	}
	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}
	public Pessoa getLeitor() {
		return leitor;
	}
	public void setLeitor(Pessoa leitor) {
		this.leitor = leitor;
	}
	
	//Métodos abstratos
	
	@Override
	public void abrir() {
		if(isAberto() == false) {
			setAberto(true);
		} else {
			System.out.println("Livro aberto já!");
		}
		
	}

	@Override
	public void fechar() {
		if(aberto) {
			setAberto(false);
		} else {
			System.out.println("Livro fechado já!");
		}
		
	}

	@Override
	public void folhear(int p) {
		if(aberto) {
			if(p> getTotPaginas()) {
				setPagAtual(0);
			}else {
				setPagAtual(p);
			}
		} else {
			System.out.println("Abra seu livro!");
		}
	}

	@Override
	public void avançarPag() {
		if(aberto) {
			if(getPagAtual() == getTotPaginas()) {
				System.out.println("Terminou o livro");
			} else {
				setPagAtual(getPagAtual() + 1);
			}
		} else {
			System.out.println("Abra seu livro!");
		}
		
	}

	@Override
	public void voltarPag() {
		if(aberto) {
			if (getPagAtual() == 0) {
				System.out.println("Ação Impossível");
			}else {
				setPagAtual(getPagAtual() - 1);
			}	
		} else {
			System.out.println("Abra seu livro");
		}
	}
	
}
