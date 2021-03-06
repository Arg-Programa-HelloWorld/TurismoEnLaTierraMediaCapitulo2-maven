<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
	<head>
		<jsp:include page="partials/head.jsp"></jsp:include>
	</head>
	
	<body background="images/mapa_tierra_media.jpg">
	
		<div class="col-lg-5 mx-auto p-3 py-md-5"
			style="background-color: $blue-100;">
	
			<main>
				<h1>Turismo en la Tierra Media</h1>
	
	
				<c:if test="${flash != null}">
					<div class="alert alert-danger">
						<p>
							<c:out value="${flash}" />
						</p>
					</div>
				</c:if>
				<c:if test="${byebye != null}">
					<div class="alert alert-info">
						<p>
							<c:out value="${byebye}" />
						</p>
					</div>
				</c:if>
	
				<form action="/TurismoEnLaTierraMediaCapitulo2-maven/login" method="post">
	
					<div class="mb-3">
						<label for="username" class="form-label">Usuario</label> <input
							class="form-control" name="username">
					</div>
	
					<div class="mb-3">
						<label for="password" class="form-label">Contraseña</label> <input
							type="password" class="form-control" name="password">
					</div>
	
					<div class="d-grid gap-2">
						<button type="submit" class="btn btn-lg btn-primary">Ingresar</button>
					</div>
				</form>
					
			</main>
		</div>
	
	</body>
</html>