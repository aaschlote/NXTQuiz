<%@page import="br.com.furb.model.Desafio"%>
<%@page import="java.util.List"%>
<%@page import="br.com.furb.dao.GenericDao"%>
<%@page import="br.com.furb.dao.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%
	User user = (User)session.getAttribute("usuario");
	GenericDao generic = new GenericDao();
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
		
			<div class="page-header">
					<h3>Desafios</h3>
			</div>
		
			<%
				out.print("<ul class='list' id='lista-desafios'>");
				List<Desafio> listaDesafios = generic.listaDesafios();
				for (Desafio desafio : listaDesafios){
					out.print("<li>");
					out.print("<a href='#'");
						out.print("<span id='teste' name='teste' class='teste mail-sender'>" + desafio.getId() + "</span>");
        				out.print("<span class='mail-subject'>" + desafio.getNmDesafio() + "</span>");
        				out.print("<span class='mail-message-preview'>" + desafio.getDsinfoDesafio() + "</span>");
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
   	<script>app.initialize();</script>

</body>
</html>