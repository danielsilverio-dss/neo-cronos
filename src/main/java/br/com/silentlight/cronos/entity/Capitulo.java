package br.com.silentlight.cronos.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_capitulo")
public class Capitulo {
	
	@Id
	@Column(name="nr_capitulo")
	private long numero;
	@Column(name="ds_titulo")
	private String titulo;
	@Column(name="ds_descricao")
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
