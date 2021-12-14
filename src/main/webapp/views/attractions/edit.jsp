<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="es">
<head>
<jsp:include page="/partials/head.jsp"></jsp:include>
<style>
main {
	padding-top: 50px;
}
</style>
</head>

<body>
	<jsp:include page="/partials/nav.jsp"></jsp:include>

	<main class="container">

		<c:if test="${attraction != null && !attraction.isValid()}">
			<div class="alert alert-danger">
				<p>Se encontraron errores al actualizar la atracción.</p>
			</div>
		</c:if>

		<form action="/TurismoEnLaTierraMediaCapitulo2-maven/views/attractions/edit.do" method="post">
			<input type="hidden" name="id" value="${attraction.id}">
			<jsp:include page="/views/attractions/form.jsp"></jsp:include>
		</form>
	</main>
</body>
</html>