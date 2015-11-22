<%@page import="br.com.furb.model.OpcaoPergunta"%>
<%@page import="br.com.furb.model.DesafioNivelPergunta"%>
<%@page import="br.com.furb.model.DesafioNivel"%>
<%@page import="br.com.furb.model.Desafio"%>
<%@page import="java.util.List"%>
<%@page import="br.com.furb.dao.GenericDao"%>
<%@page import="br.com.furb.dao.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%
	User user = (User)session.getAttribute("usuario");
	GenericDao generic = new GenericDao();
	String idDesafio = request.getParameter("idDesafio");
%>    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<link href="css/bootstrap.min.css" rel="stylesheet">
		<link href="css/form.css" rel="stylesheet">
		<link href="css/list.css" rel="stylesheet">
		<title>NXTQUIZ</title>
	</head>
	
	<body>
	
	<div class="container">
	
		<div class="content" id="desafios">
		
			<%
				DesafioNivelPergunta desafioNivelPergunta = generic.getPerguntaJogo(Long.parseLong(idDesafio));
				out.print("<div  class='page-header'><h3>Desafio " + desafioNivelPergunta.getDesafioNivel().getNrNivel() + " - " + desafioNivelPergunta.getDsPergunta() + "</h3></div>");
			
				out.print("<ul class='list' id='lista-desafios'>");
				
			
				List<OpcaoPergunta> listaOpcaoesPerguntas = generic.listaOpcaoPergunta(desafioNivelPergunta.getId());
				for (OpcaoPergunta opcaoPergunta : listaOpcaoesPerguntas){
					out.print("<li>");
					out.print("<a href='#'");
					out.print(" data-id='" + opcaoPergunta.getId() + "'");
					out.print(" data-id-desafio='" + idDesafio + "'");
					out.print(" data-id-pergunta='" + desafioNivelPergunta.getId() + "'");
					out.print(" data-resposta-certa='" + opcaoPergunta.getIeRespostaCerta() + "'");
					out.print(" class='opcao-pergunta'>");
						out.print("<span id='teste' name='teste' class='teste mail-sender'> Opção " + opcaoPergunta.getId() + " - " + opcaoPergunta.getDsPergunta() + "</span>");
        			out.print("</a>");
        			out.print("</li>");
				}
				
				out.print("</ul>");
				out.print("<div id='errormsg' style='display: " + generic.getShowErrorSpan() + "; font-family:Arial, Helvetica, sans-serif; font-size:13px;border: 1px solid;margin: 10px 0px;padding:15px 10px 15px 50px;background-repeat: no-repeat;background-position: 10px center;color: #D8000C; background-color: #FFBABA; background-image: url('../img/error.png')'>Opção incorreta - tente novamente</div>");
				out.print("<input type='hidden' id='gameover' value='" + generic.isGameOver() + "' />");
			%>
		</div>
		<div id='loading' style='font-family:Arial, Helvetica, sans-serif; font-size:13px;border: 1px solid;margin: 10px 0px;padding:15px 10px 15px 50px;background-repeat: no-repeat;background-position: 10px center;color: #00529B; background-color: #BDE5F8; background-image: url('../img/error.png')'>Por favor, aguarde</div>
	</div>
	
	<button type="button" style="display: none;" id="showModal" class="btn btn-info btn-lg" data-toggle="modal" data-target="#myModal">Open Modal</button>
	<div id="myModal" class="modal fade" role="dialog">
	  <div class="modal-dialog">
	
	    <!-- Modal content-->
	    <div class="modal-content">
	      <div class="modal-header">
	        <button type="button" class="close" data-dismiss="modal">&times;</button>
	        <h4 class="modal-title">Parabéns <%out.print(generic.getUserName()); %>!</h4>
	      </div>
	      <div class="modal-body" style="text-align: center">
	      	<p style="font-weight: bold">Desafio: <%out.print(desafioNivelPergunta.getDesafioNivel().getDesafio().getNmDesafio()); %></p>
	        <p style="font-weight: bold">Quantidade de erros: <%out.print(user.getUsuarioJogo().getQtErros()); %></p>
	        <p style="font-weight: bold">Pontuação: <%out.print(user.getUsuarioJogo().getQtPontuacao()); %></p>
	        <button type="button" class="btn btn-info btn-lg">Encerrar sessão</button>
	      </div>
	    </div>
	
	  </div>
	</div>
	
	<script src="js/jquery.min.js"></script>
   	<script src="js/bootstrap.min.js"></script>
   	<script src="js/navbar.js"></script>
   	<script src="js/form.js"></script>
   	<script src="js/desafio.js"></script>
   	<script>app.initialize();</script>

	</body>
</html>