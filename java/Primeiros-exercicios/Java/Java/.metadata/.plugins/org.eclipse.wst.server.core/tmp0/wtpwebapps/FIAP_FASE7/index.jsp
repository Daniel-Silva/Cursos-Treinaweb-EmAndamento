<%@ page import="java.util.*" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Insert title here</title>
	</head>
	<body>
		<%@ include file="menu.jsp" %>
		<%
			String x = "AL� MUNDO";
			out.println(x);
			
			String navegador = request.getHeader("user-agent");
			out.println(navegador);
			
		%>
	</body>
</html>