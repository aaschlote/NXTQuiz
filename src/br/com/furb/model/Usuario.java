package br.com.furb.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Usuario")
public class Usuario implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name = "DS_USUARIO")
	private String dsUsuario;
	
	@Column(name = "DS_SENHA")
	private String dsSenha;
	
	@Column(name = "NM_ALUNO")
	private String nmAluno;
	
	@Column(name = "QT_IDADE")
	private int qtIdade;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDsUsuario() {
		return dsUsuario;
	}

	public void setDsUsuario(String dsUsuario) {
		this.dsUsuario = dsUsuario;
	}

	public String getDsSenha() {
		return dsSenha;
	}

	public void setDsSenha(String dsSenha) {
		this.dsSenha = dsSenha;
	}

	public String getNmAluno() {
		return nmAluno;
	}

	public void setNmAluno(String nmAluno) {
		this.nmAluno = nmAluno;
	}

	public int getQtIdade() {
		return qtIdade;
	}

	public void setQtIdade(int qtIdade) {
		this.qtIdade = qtIdade;
	}
	
	
	

}
