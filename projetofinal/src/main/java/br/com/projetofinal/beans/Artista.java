package br.com.projetofinal.beans;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="tb_artista")
public class Artista {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id") // Nome que estiver dentro da tabela
	private int id;
	
	@Column(name = "nome_artistico", length = 40)
	private String nomeArtistico;
	
	@Column(name = "nacionalidade", length = 40)
	private String nacionalidade;
	
	@JsonIgnoreProperties("artista")
	@OneToMany(mappedBy = "artista", cascade = CascadeType.ALL)
	private List<Musica> musicas;
	
	
	public List<Musica> getMusicas() {
		return musicas;
	}
	public void setMusicas(List<Musica> musicas) {
		this.musicas = musicas;
	}
	public Artista() {
		super();
	}
	public Artista(int id, String nomeArtistico, String nacionalidade) {
		super();
		this.id = id;
		this.nomeArtistico = nomeArtistico;
		this.nacionalidade = nacionalidade;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNomeArtistico() {
		return nomeArtistico;
	}
	public void setNomeArtistico(String nomeArtistico) {
		this.nomeArtistico = nomeArtistico;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	
}
