package br.com.silentlight.cronos.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TB_CRN_CAPITULO")
public class Capitulo {
	
	@Id
	@Column(name="NR_CAPITULO")
	private long numero;
	@Column(name="DS_TITULO")
	private String titulo;
	@Column(name="DS_DESCRICAO")
	private String descricao;
	
	public Capitulo() {
		super();
	}

	public Capitulo(long numero, String titulo, String descricao) {
		super();
		this.numero = numero;
		this.titulo = titulo;
		this.descricao = descricao;
	}

	public long getNumero() {
		return numero;
	}

	public void setNumero(long numero) {
		this.numero = numero;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}
