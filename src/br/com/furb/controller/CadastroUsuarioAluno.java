package br.com.furb.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.furb.dao.User;
import br.com.furb.model.Usuario;
import br.com.furb.utils.SystemAction;

@WebServlet("/nxtCadastro")
public class CadastroUsuarioAluno extends HttpServlet {
	
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		User user = new User();
		user.getManager().getTransaction().begin();
		
		Usuario usuario = new Usuario();
		usuario.setDsUsuario(request.getParameter("c-usuario"));
		usuario.setDsSenha(request.getParameter("c-senha"));
		usuario.setNmAluno(request.getParameter("c-nome"));
		usuario.setQtIdade(Integer.parseInt(request.getParameter("c-idade")));
		user.getManager().persist(usuario);
		
		
		user.getManager().getTransaction().commit();
		
		user.setUsuario(usuario);
		SystemAction.getInstance().setSession(request, user);
		
		request.getRequestDispatcher("principal.jsp").forward(request, response);
	}
	
	

}
