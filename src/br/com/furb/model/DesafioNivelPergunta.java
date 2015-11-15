package br.com.furb.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Desafio_Nivel_Pergunta")
public class DesafioNivelPergunta {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name = "DS_PERGUNTA")
	private String dsPergunta;
	
	@Column(name = "NR_PERGUNTA")
	private int nrPergunta;
	
	@Column(name = "QT_PONTUACAO")
	private int qtPontuacao;
	
	@Column(name = "DS_DIRECAO")
	private String dsDirecao;
	
	@Column(name = "QT_MOVIMENTACAO")
	private String qtMovimentacao;
	
	@ManyToOne
	@JoinColumn(name = "ID_DESAFIO_NIVEL")
	private DesafioNivel desafioNivel;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDsPergunta() {
		return dsPergunta;
	}

	public void setDsPergunta(String dsPergunta) {
		this.dsPergunta = dsPergunta;
	}

	public int getNrPergunta() {
		return nrPergunta;
	}

	public void setNrPergunta(int nrPergunta) {
		this.nrPergunta = nrPergunta;
	}

	public int getQtPontuacao() {
		return qtPontuacao;
	}

	public void setQtPontuacao(int qtPontuacao) {
		this.qtPontuacao = qtPontuacao;
	}

	public DesafioNivel getDesafioNivel() {
		return desafioNivel;
	}

	public void setDesafioNivel(DesafioNivel desafioNivel) {
		this.desafioNivel = desafioNivel;
	}
	
	

}
