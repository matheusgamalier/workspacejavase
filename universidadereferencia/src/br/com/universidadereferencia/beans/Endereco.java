package br.com.universidadereferencia.beans;

public class Endereco {
	private String logradouro;
	private String numero;
	private String complemento;
	
	public Endereco() {}
	
	public Endereco(String logradouro, String numero, String complemento) {
		super();
		this.logradouro = logradouro;
		this.numero = numero;
		this.complemento = complemento;
	}
	
	public String getAll() {
		return
                "Logradouro: " + logradouro + "\n" +
                "Numero: " + numero + "\n" +
                "Complemento: " + complemento;
	}
	
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	
	
}
