<%@page import="br.com.fiap.entites.Produto"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Insert title here</title>
	</head>
	<body>
		<%
			Produto p = (Produto) session.getAttribute("produto");
			
			out.println("Nome do produto: "+ p.getNome() + "<br>");
			out.println("Valor do produto: "+ p.getValor());
		
		%>
	</body>
</html>