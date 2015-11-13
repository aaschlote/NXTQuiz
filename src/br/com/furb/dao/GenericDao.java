package br.com.furb.dao;

import java.util.List;

import br.com.furb.model.Desafio;
import br.com.furb.utils.SystemAction;

public class GenericDao {
	
	public List<Desafio> listaDesafios(){
		User user = SystemAction.getInstance().getSessionUser();
		List<Desafio> desafios = user.getManager().createQuery("from Desafio as e ").getResultList();
		return desafios;
	}

}
