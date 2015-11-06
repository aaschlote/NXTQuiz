package br.com.furb.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Desafio")
public class Desafio {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name = "NM_DESAFIO")
	private String nmDesafio;
	
	@Column(name = "DS_INFO_DESAFIO")
	private String dsinfoDesafio;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNmDesafio() {
		return nmDesafio;
	}

	public void setNmDesafio(String nmDesafio) {
		this.nmDesafio = nmDesafio;
	}

	public String getDsinfoDesafio() {
		return dsinfoDesafio;
	}

	public void setDsinfoDesafio(String dsinfoDesafio) {
		this.dsinfoDesafio = dsinfoDesafio;
	}
	
	

}
