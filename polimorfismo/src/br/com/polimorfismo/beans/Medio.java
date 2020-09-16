package br.com.polimorfismo.beans;

import br.com.polimorfismo.padrao.PadraoFormacao;

public class Medio extends Formacao implements PadraoFormacao {
	private String tipo;

	public Medio() {
		super();
	}

	public Medio(String descricao, int periodo, double mensalidade, int duracao, String tipo) {
		super(descricao, periodo, mensalidade, duracao);
		this.tipo = tipo;
	}
	
	public void calcularMensalidade(double fator) {
		super.setMensalidade(super.getDuracao() * fator * 500);
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String exibirDetalhes() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
