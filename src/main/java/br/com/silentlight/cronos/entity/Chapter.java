package br.com.silentlight.cronos.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_chapter")
public class Chapter {
	
	@Id
	@Column(name="nr_chapter")
	private long number;
	@Column(name="ds_title")
	private String title;
	@Column(name="ds_description")
	private String description;
	
	public Chapter() {
		super();
	}

	public Chapter(long number, String title, String description) {
		super();
		this.number = number;
		this.title = title;
		this.description = description;
	}

	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
