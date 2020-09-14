package br.com.universidadereferencia.beans;

public class Curso {
	private String nome;
	private float valor;
	private int cargaHoraria;
	
	public Curso() {};
	
	public Curso(String nome, float valor, int cargaHoraria) {
		super();
		this.nome = nome;
		this.valor = valor;
		this.cargaHoraria = cargaHoraria;
	}
	
    public String getAll() {
        return 
                "Nome: " + nome + "\n" +
                "Valor: " + valor + "\n" +
                "Carga Horaria: " + cargaHoraria;
    }
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
	
}
