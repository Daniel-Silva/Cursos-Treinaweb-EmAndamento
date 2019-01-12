<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Form MSG</title>
	</head>
	<body>
		<form method="post" action="/mensagem">
			<label>Digite seu nome:</label>
			<input type="text" name="nomeUsuario" />
			<div>
				<input type="submit" value="Enviar">
			</div>
		</form>
	</body>
</html>