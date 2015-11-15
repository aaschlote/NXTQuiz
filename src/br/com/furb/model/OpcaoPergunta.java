package br.com.furb.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Opcao_Pergunta")
public class OpcaoPergunta {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name = "DS_OPCAO")
	private String dsPergunta;
	
	@Column(name = "IE_RESPOSTA_CERTA")
	private String ieRespostaCerta;
	
	@ManyToOne
	@JoinColumn(name = "ID_DESAFIO_NIVEL_PERGUNTA")
	private DesafioNivelPergunta desafioNivelPergunta;

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

	public String getIeRespostaCerta() {
		return ieRespostaCerta;
	}

	public void setIeRespostaCerta(String ieRespostaCerta) {
		this.ieRespostaCerta = ieRespostaCerta;
	}

	public DesafioNivelPergunta getDesafioNivelPergunta() {
		return desafioNivelPergunta;
	}

	public void setDesafioNivelPergunta(DesafioNivelPergunta desafioNivelPergunta) {
		this.desafioNivelPergunta = desafioNivelPergunta;
	}
	
	

}
