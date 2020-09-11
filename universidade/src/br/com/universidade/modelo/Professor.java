package br.com.universidade.modelo;

public class Professor {
	private int id;
	private String nome;
	private String area;
	private float valorHora;
		
	public void setId(int id) {	this.id = id; }
	
	public void setNome(String nome) { this.nome = nome.toUpperCase(); }
	
	public void setArea(String area) { this.area = area.toUpperCase(); }
	
	public void setValorHora(float valorHora) { this.valorHora = valorHora; }
	
	public int getId() { return this.id; }
	
	public String getNome() { return this.nome; }
	
	public String getArea() { return this.area; }
	
	public float getValorHora() { return this.valorHora; }

}
