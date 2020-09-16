package br.com.polimorfismo.beans;

public class Tecnologo extends Formacao{
	private boolean planoEstendido;

	public Tecnologo() {
		super();
	}

	public Tecnologo(String descricao, int periodo, double mensalidade, int duracao, boolean planoEstendido) {
		super(descricao, periodo, mensalidade, duracao);
		this.planoEstendido = planoEstendido;
	}
	
	public void calcularMensalidade(double fator) {
		super.setMensalidade(super.getDuracao() * fator * 600);
	}

	public boolean isPlanoEstendido() {
		return planoEstendido;
	}
	
	public String getAll() {
		return
				"Formacao \n" + super.getAll() +
				"\nPlano Estendido: " + this.planoEstendido;
	}

	public void setPlanoEstendido(boolean planoEstendido) {
		this.planoEstendido = planoEstendido;
	}
	
	
}
