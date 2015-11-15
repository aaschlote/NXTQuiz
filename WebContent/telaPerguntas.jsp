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
		<link href="css/bootstrap.min.css" rel="stylesheet">
		<link href="css/form.css" rel="stylesheet">
		<link href="css/list.css" rel="stylesheet">
		<title>NXTQUIZ</title>
	</head>
	
	<body>
	
	<div class="container">
	
		<div class="content" id="desafios">
		
			<%
				out.print("<div class='page-header'>");
					DesafioNivelPergunta desafioNivelPergunta = generic.getPerguntaJogo(Long.parseLong(idDesafio));
					out.print("<h3> Desafio( " + desafioNivelPergunta.getDesafioNivel().getNrNivel() + " ) - " + desafioNivelPergunta.getDsPergunta() + "</h3>");
				out.print("</div");
				
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
						out.print("<span id='teste' name='teste' class='teste mail-sender'>" + opcaoPergunta.getId() + " - </span>");
        				out.print("<span class='mail-subject'>" + opcaoPergunta.getDsPergunta() + "</span>");
        			out.print("</a>");
        			out.print("</li>");
				}
				out.print("</ul>");
			%>
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