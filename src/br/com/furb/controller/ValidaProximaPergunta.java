package br.com.furb.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.furb.dao.GenericDao;
import br.com.furb.dao.User;
import br.com.furb.model.DesafioNivelPergunta;
import br.com.furb.utils.SystemAction;

@WebServlet("/nxtValidaProximaPergunta")
public class ValidaProximaPergunta extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		User user = SystemAction.getInstance().getSessionUser();

		String ieRespostaCerta = request.getParameter("resposta-certa");
		Long idPergunta = Long.parseLong(request.getParameter("id-pergunta"));

		if (ieRespostaCerta.equalsIgnoreCase("S")) {

			GenericDao generic = new GenericDao();

			DesafioNivelPergunta pergunta = generic.searchDesafioNivelPergunta(idPergunta, user);

			if (pergunta.getDesafioNivel().getNrNivel() == 3) { // Game is over
				user.setGameOver(true);
			} else {

				if (user.getNrPergunta() >= pergunta.getDesafioNivel().getQtPerguntas()) {
					user.setNrNivelJogo(user.getNrNivelJogo() + 1);
					user.setNrPergunta(1);
				} else {
					user.setNrPergunta(user.getNrPergunta() + 1);
				}

			}

			user.setShowErrorSpan(false);
		} else {
			 
			user.setShowErrorSpan(true);
		}

	}

}
