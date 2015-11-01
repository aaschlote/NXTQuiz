package br.com.furb.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.furb.model.Usuario;

public class User {
	
	private EntityManagerFactory factory; 
	private EntityManager manager;
	private Usuario usuario;
	
	public User(){
		factory = new Persistence().createEntityManagerFactory("connection");
		manager = factory.createEntityManager();
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

}
