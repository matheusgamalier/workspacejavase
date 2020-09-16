package br.com.colecoes.beans;

public class Cargo {
	private String nome;
	private String nivel;
	private double salario;
	
	public Cargo() {
		super();
	}

	public Cargo(String nome, String nivel, double salario) {
		super();
		this.nome = nome;
		this.nivel = nivel;
		this.salario = salario;
	}
	
	public String getAll() {
		return
				"Nome: " + nome +
				"\nNivel " + nivel +
				"\nSalario " + salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
}
