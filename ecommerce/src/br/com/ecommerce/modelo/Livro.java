package br.com.ecommerce.modelo;

public class Livro extends Produto {
	private String isbn;
	private String autor;
	private String editora;
	
	
	public Livro() {
		super();
	}

	public Livro(int id, String descricao, float valorCompra, float valorVenda, int qtde, String tipo, String isbn,
			String autor, String editora) {
		super(id, descricao, valorCompra, valorVenda, qtde, tipo);
		this.isbn = isbn;
		this.autor = autor;
		this.editora = editora;
	}
	
	public void setAll(int id, String descricao, float valorCompra, float valorVenda, int qtde, String tipo, String isbn, String autor, String editora) {
		super.setAll(id, descricao, valorCompra, valorVenda, qtde, tipo);
		this.isbn = isbn;
		this.autor = autor;
		this.editora = editora;
	}
	
	public String getAll() {
		return
				"--- PRODUTO --- \n" + super.getAll() +
				"--- LIVRO ---\n" +
				"ISBN: " + this.isbn +
				"\nAutor: " + this.autor +
				"\nEditora: " + this.editora;
	}
	
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	
	
}
