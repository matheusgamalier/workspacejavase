package br.com.polimorfismo.beans;

public class Formacao {
	String descricao = "";
	int periodo;
	double mensalidade;
	int duracao;
	
	
	public Formacao() {
		
	}
	
	public Formacao(String descricao, int periodo, double mensalidade, int duracao) {
		super();
		this.descricao = descricao;
		this.periodo = periodo;
		this.mensalidade = mensalidade;
		this.duracao = duracao;
	}
	
	public void definirDuracao() {
		if (this instanceof Medio) {
			duracao = 36;
		}
		else if (this instanceof Tecnologo) {
			duracao = 24;
		}
		else if (this instanceof Bacharelado) {
			if (!descricao.contains("ENGENHARIA")) {
				duracao = 48;
			}
			else {
				duracao = 60;
			}
		}
	}
	
	public void calcularMensalidade(double fator) {}
	
	public double exibirMedia(double ps1, double ps2) {
		return (ps1 * 0.5) + (ps2 * 0.5) ;
	}
	
	public double exibirMedia(double ps1, double ps2, double nac1, double nac2) {
		return (ps1 * 0.4) + (ps2 * 0.4) + (nac1 * 0.1) + (nac2 * 0.1);
	}
	
	public double exibirMedia(double ps1, double ps2, double nac1, double nac2, double am1, double am2) {
		return (ps1 * 0.25) + (ps2 * 0.25) + (nac1 * 0.1) + (nac2 * 0.1) + (am1 * 0.15) + (am2 * 0.15);
	}
	
	public void setAll(String descricao, int periodo, double mensalidade, int duracao) {
		this.descricao = descricao;
		this.periodo = periodo;
		this.mensalidade = mensalidade;
		this.duracao = duracao;
	}
	
	public String getAll() {
		return
				"Descricao: " + this.descricao +
				"\nPeriodo: " + this.periodo +
				"\nMensalidade: " + this.mensalidade +
				"\nDuracao: " + this.duracao;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getPeriodo() {
		return periodo;
	}
	public void setPeriodo(int periodo) {
		this.periodo = periodo;
	}
	public double getMensalidade() {
		return mensalidade;
	}
	public void setMensalidade(double mensalidade) {
		this.mensalidade = mensalidade;
	}
	public int getDuracao() {
		return duracao;
	}
	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
	
	
}
