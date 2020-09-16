package br.com.polimorfismo.beans;

import br.com.polimorfismo.padrao.PadraoFormacao;

public class Bacharelado extends Formacao implements PadraoFormacao{
	private String projetoConclusao;
	private int cargaHorariaEstagio;
	
	
	public Bacharelado() {
		super();
	}

	public Bacharelado(String descricao, int periodo, double mensalidade, int duracao, String projetoConclusao,
			int cargaHorariaEstagio) {
		super(descricao, periodo, mensalidade, duracao);
		this.projetoConclusao = projetoConclusao;
		this.cargaHorariaEstagio = cargaHorariaEstagio;
	}
	
	public void calcularMensalidade(double fator) {
		super.setMensalidade((super.getDuracao() * fator * 600) + (this.cargaHorariaEstagio * 12));
	}
	
	public String getAll() {
		return
				"Formacao \n" + super.getAll() +
				"\nProjeto Conclusao: " + this.projetoConclusao + 
				"\nCarga Horaria Estagio: " + this.cargaHorariaEstagio; 
	}
	
	public String getProjetoConclusao() {
		return projetoConclusao;
	}
	public void setProjetoConclusao(String projetoConclusao) {
		this.projetoConclusao = projetoConclusao;
	}
	public int getCargaHorariaEstagio() {
		return cargaHorariaEstagio;
	}
	public void setCargaHorariaEstagio(int cargaHorariaEstagio) {
		this.cargaHorariaEstagio = cargaHorariaEstagio;
	}

	@Override
	public String exibirDetalhes() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
