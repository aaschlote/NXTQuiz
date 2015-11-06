package br.com.furb.model;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "Usuario_Jogo")
public class UsuarioJogo {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name = "DT_INICIO_JOGO")
	@Temporal(TemporalType.DATE)
	private Calendar dtInicioJogo;
	
	@Column(name = "QT_PONTUACAO")
	private int qtPontuacao;
	
	@Column(name = "DT_FIM_JOGO")
	@Temporal(TemporalType.DATE)
	private Calendar dtFimJogo;
	
	@Column(name = "QT_TENTATIVAS")
	private int qtTentativas;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Calendar getDtInicioJogo() {
		return dtInicioJogo;
	}

	public void setDtInicioJogo(Calendar dtInicioJogo) {
		this.dtInicioJogo = dtInicioJogo;
	}

	public int getQtPontuacao() {
		return qtPontuacao;
	}

	public void setQtPontuacao(int qtPontuacao) {
		this.qtPontuacao = qtPontuacao;
	}

	public Calendar getDtFimJogo() {
		return dtFimJogo;
	}

	public void setDtFimJogo(Calendar dtFimJogo) {
		this.dtFimJogo = dtFimJogo;
	}

	public int getQtTentativas() {
		return qtTentativas;
	}

	public void setQtTentativas(int qtTentativas) {
		this.qtTentativas = qtTentativas;
	}

}
