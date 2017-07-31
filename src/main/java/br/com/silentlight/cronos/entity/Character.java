package br.com.silentlight.cronos.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_character")
public class Character {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="cd_character")
	private int code;
	@Column(name="nm_character")
	private String name;
	@Column(name="ds_description")
	private String description;
	
	public Character(){}

	public Character(int code, String name, String description) {
		super();
		this.code = code;
		this.name = name;
		this.description = description;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
