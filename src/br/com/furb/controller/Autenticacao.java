package br.com.furb.controller;

import java.io.IOException;

import javax.persistence.Query;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.furb.dao.User;
import br.com.furb.model.Usuario;
import br.com.furb.utils.SystemAction;

@WebServlet("/nxtAutenticacao")
public class Autenticacao extends HttpServlet {
	
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		User user = new User();
		Usuario usuario = new Usuario();
		Query query = user.getManager().createQuery(
				"from Usuario as u "
						+ "where UPPER(u.dsUsuario) = upper(:dsUsuario) "
						+ "and upper(u.dsSenha) = upper(:dsSenha)");
		query.setParameter("dsUsuario", request.getParameter("usuario"));
		query.setParameter("dsSenha", request.getParameter("senha"));
		
		if	(!query.getResultList().isEmpty()){
			user.setUsuario((Usuario)query.getResultList().get(0));
			SystemAction.getInstance().setSession(request, user);
			request.getRequestDispatcher("principal.jsp").forward(request, response);
		}else{
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}
		
	}

}
