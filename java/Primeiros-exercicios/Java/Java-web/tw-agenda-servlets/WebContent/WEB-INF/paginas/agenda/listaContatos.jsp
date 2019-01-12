<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="jstl" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Lista de contatos</title>
	</head>
	<body>
		<h3>Lista de contatos</h3>
		<p style="color: red;">${ mensagemErro }</p>
		<table border="1" cellpadding="5" cellspacing="1">
			<theade>
				<tr>
					<th>Nome</th>
					<th>Idade</th>
					<th>E-mail</th>
					<th>Telefone</th>
					<th>Ações</th>
				</tr>
			</theade>
			<tbody>
				<jstl:forEach items="${listaContatos}" var="contato">
					<tr>
						<td>${contato.nome}</td>
						<td>${contato.idade}</td>
						<td>${contato.email}</td>
						<td>${contato.telefone}</td>
						<td>
							<a href="agenda/editar?id=${contato.id}">Editar</a> | 
							<a href="agenda/excluir?id="${contato.id }>Excluir</a>
						</td>
					</tr>
				</jstl:forEach>
			</tbody>
		</table>
		<a href="agenda/incluir">Add Contato</a>
	</body>
</html>