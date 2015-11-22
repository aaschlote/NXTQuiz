package br.com.furb.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.furb.dao.GenericDao;
import br.com.furb.dao.User;
import br.com.furb.model.UsuarioJogo;
import br.com.furb.utils.SystemAction;

@WebServlet("/nxtAceitaDesafio")
public class AceitarDesafio extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		
		GenericDao generic = new  GenericDao();
		User user = SystemAction.getInstance().getSessionUser();
		
		user.getManager().getTransaction().begin();
		
		UsuarioJogo usuarioJogo = new UsuarioJogo();
		
		Long idDesafio = Long.parseLong(request.getParameter("id-desafio"));
		
		usuarioJogo.setDesafio(generic.searchDesafio(idDesafio, user));
		usuarioJogo.setQtErros(0);
		usuarioJogo.setUsuario(user.getUsuario());
		usuarioJogo.setQtPontuacao(0);
		user.getManager().persist(usuarioJogo);
		user.getManager().getTransaction().commit();
		
		user.setUsuarioJogo(usuarioJogo);
		
	}

}
