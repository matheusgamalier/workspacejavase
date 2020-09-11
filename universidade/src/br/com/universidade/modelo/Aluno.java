package br.com.universidade.modelo;

public class Aluno {
	private int rm;
	private String nome;
	private String email;
	
	public void setNome(String nome) { this.nome = nome.toUpperCase(); }
	
	public void setEmail(String email) { this.email = email.toLowerCase(); }
	
	public void setRm(int rm) {	this.rm = rm; }
	
	public String getNome() { return this.nome; }
	
	public String getEmail() { return this.email; }
	
	public int getRm() { return this.rm; }
	
}
