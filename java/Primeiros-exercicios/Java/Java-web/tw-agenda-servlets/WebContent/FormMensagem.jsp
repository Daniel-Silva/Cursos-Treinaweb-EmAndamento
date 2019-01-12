<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Form Mensagem</title>
	</head>
	<body>
		<form method="post" action="/tw-agenda-servlets/mensagem" enctype="application/x-www-form-urlencoded">
			<p>Digite seu nome:</p>
			<p><input type="text" name="nomeUsuario" /></p>
			<button type="submit">Enviar</button>
		</form>
	</body>
</html>