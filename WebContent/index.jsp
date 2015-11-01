<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html lang="pt-br">
	<head>
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<link href="css/bootstrap.min.css" rel="stylesheet">
		<link href="css/signin.css" rel="stylesheet">
		<title>NXTQUIZ</title>
	</head>
	<body>
	<div class=top-bar></div>
	<div class="container">
		<form class="form-signin" role="form">
			<h2 class="form-signin-heading">
				<strong>NXTQuiz</strong>
			</h2>

			<input type="text" name="usuario" id="usuario" class="form-control" placeholder="Usuário" required autofocus> 
			<input type="password" name="senha" id="senha" class="form-control" placeholder="Senha" required> 
			<button class="btn btn-lg btn-primary btn-block" type="submit"
				name="classe" id="button" value="Autenticacao">Entrar</button>

			<br />
			
			<label class="form-question">Não possui uma conta?</label>
			<br />
			 
			<a href="cadastro.jsp" class="form-link">Crie uma conta</a>
		</form>
	</div>

</body>
</html>