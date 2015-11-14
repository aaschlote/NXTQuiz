<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
		<title>Cadastro NXT Quiz.</title>
		<link href="css/bootstrap.min.css" rel="stylesheet">
		<link href="css/form.css" rel="stylesheet">
	</head>
<body>

	<div class="navbar navbar-default navbar-fixed-top" role="navigation">	
		<div class="container">
			<div class="navbar-header">
			
			<a href="#" class="navbar-brand"><strong>NXT</strong> Quiz.</a>
			</div>
		
		</div>
	</div>
	
	<div class="container">
	
		<div class="content" id="cliente">
			<div class="row">
				<div class="col-md-6">
					<div class="well well-sm">
						<form class="form-horizontal" name="cadastroCliente" method="post" action="nxtCadastro">
							<fieldset>
							<legend class="text-center header">Cadastro de usuário</legend>
								<div class="form-group" id="field-usuario">
									<div class="col-md-10 col-md-offset-1">
										<input id="c-usuario" name="c-usuario" type="text" placeholder="Usuário" class="form-control" required>
									</div>
								</div>
								<div class="form-group" id="field-senha">
									<div class="col-md-10 col-md-offset-1">
										<input id="c-senha" name="c-senha" type="password" placeholder="Senha" class="form-control" required>
									</div>
								</div>
									
								<div class="form-group" id="field-nome">
									<div class="col-md-10 col-md-offset-1">
										<input id="c-nome" name="c-nome" type="text" placeholder="Nome do Aluno" class="form-control" required>
									</div>
								</div>
									
								<div class="form-group" id="field-email">
									<div class="col-md-10 col-md-offset-1">
										<input id="c-idade" name="c-idade" type="idade" placeholder="Idade aluno" class="form-control" required>
									</div>
								</div>
									
								<div class="form-group">
									<div class="col-md-12 text-center">
										<button type="submit" value="Cadastrar Cliente" name="classe" class="btn btn-primary "><span class="glyphicon glyphicon-pencil"></span> Efetuar Registro</button>
									</div>
								</div>
							</fieldset>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>

</body>
</html>