package br.com.ecommerce.modelo;

public class Produto {
	private int id;
	private String descricao;
	private String tipo;
	private float valorCompra;
	private float valorVenda;
	private int qtde;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public float getValorCompra() {
		return valorCompra;
	}
	public void setValorCompra(float valorCompra) {
		this.valorCompra = valorCompra;
	}
	public float getValorVenda() {
		return valorVenda;
	}
	public void setValorVenda(float valorVenda) {
		this.valorVenda = valorVenda;
	}
	public int getQtde() {
		return qtde;
	}
	public void setQtde(int qtde) {
		this.qtde = qtde;
	}
	
	public void setAll(int id, String descricao, String tipo, float valorCompra, float valorVenda, int qtde) {
		this.id = id;
		this.descricao = descricao;
		this.tipo = tipo;
		this.valorCompra = valorCompra;
		this.valorVenda = valorVenda;
		this.qtde = qtde;
	}
	
	public String getAll() {
		return 	"Id: " + this.id + 
				"\nDescricao: " + this.descricao + 
				"\nTipo: " + this.tipo + 
				"\nValor da Compra: " + this.valorCompra +
				"\nValor da Venda: " + this.valorVenda +
				"\nQuantidade: " + this.qtde;
	}
	
}
