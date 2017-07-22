package br.com.silentlight.cronos.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_personagem")
public class Personagem {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="cd_personagem")
	private int codigo;
	@Column(name="nm_personagem")
	private String nome;
	@Column(name="ds_descricao")
	private String descricao;
	
	public Personagem(){}

	public Personagem(int codigo, String nome, String descricao) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.descricao = descricao;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	

}
