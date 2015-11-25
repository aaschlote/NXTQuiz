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
import br.com.furb.model.UsuarioJogo;
import br.com.furb.utils.SystemAction;
import br.com.lejos.LejosController;

@WebServlet("/nxtValidaProximaPergunta")
public class ValidaProximaPergunta extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		User user = SystemAction.getInstance().getSessionUser();
		UsuarioJogo usuarioJogo = user.getUsuarioJogo();

		String ieRespostaCerta = request.getParameter("resposta-certa");
		Long idPergunta = Long.parseLong(request.getParameter("id-pergunta"));

		if (ieRespostaCerta.equalsIgnoreCase("S")) {
			
			LejosController lejosController = new LejosController();

			GenericDao generic = new GenericDao();

			DesafioNivelPergunta pergunta = generic.searchDesafioNivelPergunta(idPergunta, user);
			lejosController.executarComando(pergunta.getId().intValue());
			
			float pontuacao = pergunta.getQtPontuacao();
			
			if	(user.getTentativas() > 1){
				pontuacao = 0;
			}else if (user.getTentativas() == 1){
				pontuacao = Math.round(pontuacao/2) ;
			}
			
			usuarioJogo.setQtPontuacao(usuarioJogo.getQtPontuacao()+ (int) pontuacao);
			
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
			user.setTentativas(0);
			user.setShowErrorSpan(false);
		} else {
			user.getManager().getTransaction().begin();
			usuarioJogo.setQtErros(usuarioJogo.getQtErros()+1);
			user.getManager().merge(usuarioJogo);
			user.getManager().getTransaction().commit();
			user.setShowErrorSpan(true);
			user.setTentativas(user.getTentativas()+1);
		}

	}

}
