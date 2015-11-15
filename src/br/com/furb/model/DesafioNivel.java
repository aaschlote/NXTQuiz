package br.com.furb.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Desafio_Nivel")
public class DesafioNivel {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name = "NR_NIVEL")
	private int nrNivel;
	
	@Column(name = "QT_PERGUNTAS")
	private int qtPerguntas;
	
	@Column(name = "DS_QUESTAO")
	private String dsQuestao;
	
	@ManyToOne
	@JoinColumn(name = "ID_DESAFIO")
	private Desafio desafio;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getNrNivel() {
		return nrNivel;
	}

	public void setNrNivel(int nrNivel) {
		this.nrNivel = nrNivel;
	}

	public int getQtPerguntas() {
		return qtPerguntas;
	}

	public void setQtPerguntas(int qtPerguntas) {
		this.qtPerguntas = qtPerguntas;
	}
	
	public String getDsQuestao() {
		return dsQuestao;
	}

	public void setDsQuestao(String dsQuestao) {
		this.dsQuestao = dsQuestao;
	}

	public Desafio getDesafio() {
		return desafio;
	}

	public void setDesafio(Desafio desafio) {
		this.desafio = desafio;
	}

}
