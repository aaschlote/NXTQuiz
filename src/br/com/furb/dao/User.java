package br.com.furb.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.furb.model.Usuario;

public class User {
	
	private EntityManagerFactory factory; 
	private EntityManager manager;
	private Usuario usuario;
	private int nrNivelJogo;
	private int nrPergunta;
	
	public User(){
		factory = new Persistence().createEntityManagerFactory("connection");
		manager = factory.createEntityManager();
		nrNivelJogo = 1;
		nrPergunta = 1;
	}

	public EntityManager getManager() {
		return manager;
	}

	public void setManager(EntityManager manager) {
		this.manager = manager;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public int getNrNivelJogo() {
		return nrNivelJogo;
	}

	public void setNrNivelJogo(int nrNivelJogo) {
		this.nrNivelJogo = nrNivelJogo;
	}

	public int getNrPergunta() {
		return nrPergunta;
	}

	public void setNrPergunta(int nrPergunta) {
		this.nrPergunta = nrPergunta;
	}
	
	

}
