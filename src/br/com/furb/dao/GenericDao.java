package br.com.furb.dao;

import java.util.List;

import javax.persistence.Query;

import br.com.furb.model.Desafio;
import br.com.furb.model.DesafioNivel;
import br.com.furb.model.DesafioNivelPergunta;
import br.com.furb.model.OpcaoPergunta;
import br.com.furb.utils.SystemAction;

public class GenericDao {
	
	public List<Desafio> listaDesafios(){
		User user = SystemAction.getInstance().getSessionUser();
		List<Desafio> desafios = user.getManager().createQuery("from Desafio as e ").getResultList();
		return desafios;
	}
	
	public DesafioNivel getDesafiosNivel(Long idDesafio){
		User user = SystemAction.getInstance().getSessionUser();
		Query query = user.getManager().createQuery("from DesafioNivel as d" +
							" where d.desafio = :desafio and nr_nivel = " + user.getNrNivelJogo());
		query.setParameter("desafio", searchDesafio(idDesafio, user));
		DesafioNivel desafioNivel = (DesafioNivel)query.getResultList().get(0);
		return desafioNivel;
	}
	
	public DesafioNivelPergunta getPerguntaJogo(Long idDesafio){
		User user = SystemAction.getInstance().getSessionUser();
		Query query = user.getManager().createQuery("from DesafioNivelPergunta as d"+
								" where d.desafioNivel = :desafioNivel and nr_pergunta = " + user.getNrPergunta());
		query.setParameter("desafioNivel", getDesafiosNivel(idDesafio));
		DesafioNivelPergunta desafioNivelPergunta = (DesafioNivelPergunta) query.getResultList().get(0);
		return desafioNivelPergunta;
	}
	
	public List<OpcaoPergunta> listaOpcaoPergunta(Long idPergunta){
		User user = SystemAction.getInstance().getSessionUser();
		Query query = user.getManager().createQuery("from OpcaoPergunta as o"+
				" where o.desafioNivelPergunta = :desafioNivelPergunta");
		query.setParameter("desafioNivelPergunta", searchDesafioNivelPergunta(idPergunta,user));
		List<OpcaoPergunta> listOpcaoPergunta = query.getResultList();
		return listOpcaoPergunta;
	}
	
	public Desafio searchDesafio(Long idDesafio, User user) {
		return user.getManager().find(Desafio.class, idDesafio);
	}
	
	public DesafioNivelPergunta searchDesafioNivelPergunta(Long idDesafioNivelPergunta, User user) {
		return user.getManager().find(DesafioNivelPergunta.class, idDesafioNivelPergunta);
	}
	

}
