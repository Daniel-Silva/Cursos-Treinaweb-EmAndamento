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
			String produto = "";
			if(request.getParameter("produto") != null){
				produto = request.getParameter("produto");
			}
			
			float valor = 0;
			if(request.getParameter("valor") != null) {
				valor = Float.parseFloat(request.getParameter("valor"));
			}
			
			if((produto != "") && (valor != 0)){
				Produto prod = new Produto(produto, valor);
				session.setAttribute("produto", prod);
			}
		
		%>
		<jsp:forward page="showProduto.jsp"></jsp:forward>
	</body>
</html>