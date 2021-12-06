<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
	<head>
	 	<jsp:include page="partials/head.jsp"></jsp:include>
	</head>
	
	<body background="images/mapa_tierra_media.jpg">
		
		<% String flash = (String) request.getAttribute("flash"); %>
		
		<% if (flash != null) {%>
		
			<%= flash %>
		
		<% } %>
		
		<form action="login" method="post">
			
			<p>
				Username: 
				<input name="username">
			</p>
			<p>
				Password:
				<input type="password" name="password">
			</p>
			<p>
				<input type="submit" value="Ingresar" />		
			</p>
		</form>
		
		
	</body>
</html>