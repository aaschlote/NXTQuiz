package br.com.furb.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.furb.model.Usuario;
import br.com.furb.model.UsuarioJogo;

public class User {
	
	private EntityManagerFactory factory; 
	private EntityManager manager;
	private Usuario usuario;
	private int nrNivelJogo;
	private int nrPergunta;
	private boolean showErrorSpan;
	private boolean gameOver;
	private UsuarioJogo usuarioJogo;
	
	public User(){
		factory = new Persistence().createEntityManagerFactory("connection");
		manager = factory.createEntityManager();
		nrNivelJogo = 1;
		nrPergunta = 1;
		showErrorSpan = false;
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

	public boolean isShowErrorSpan() {
		return showErrorSpan;
	}

	public void setShowErrorSpan(boolean showErrorSpan) {
		this.showErrorSpan = showErrorSpan;
	}

	public boolean isGameOver() {
		return gameOver;
	}

	public void setGameOver(boolean gameOver) {
		this.gameOver = gameOver;
	}

	public UsuarioJogo getUsuarioJogo() {
		return usuarioJogo;
	}

	public void setUsuarioJogo(UsuarioJogo usuarioJogo) {
		this.usuarioJogo = usuarioJogo;
	}

}
