package br.com.ecommerce.modelo;

public class Cd extends Produto {
	private String artista;
	private String gravadora;
	private String duracao;

	public Cd() {
		super();
	}
	
	public Cd(int id, String descricao, float valorCompra, float valorVenda, int qtde, String tipo, String artista,
			String gravadora, String duracao) {
		super(id, descricao, valorCompra, valorVenda, qtde, tipo);
		this.artista = artista;
		this.gravadora = gravadora;
		this.duracao = duracao;
	}
	
	public String getAll() {
		return
				"--- PRODUTO --- \n" + super.getAll() +
				"--- CD ---\n" +
				"Artista: " + this.artista +
				"\nGravadora: " + this.gravadora +
				"\nDuracao: " + this.duracao;
	}
	
	public void setAll(int id, String descricao, float valorCompra, float valorVenda, int qtde, String tipo, String artista,
			String gravadora, String duracao) {
		
		super.setAll(id, descricao, valorCompra, valorVenda, qtde, tipo);
		this.artista = artista;
		this.gravadora = gravadora;
		this.duracao = duracao;
	}

	public String getArtista() {
		return artista;
	}
	public void setArtista(String artista) {
		this.artista = artista;
	}
	public String getGravadora() {
		return gravadora;
	}
	public void setGravadora(String gravadora) {
		this.gravadora = gravadora;
	}
	public String getDuracao() {
		return duracao;
	}
	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}
}
