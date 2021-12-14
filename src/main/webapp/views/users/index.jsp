<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<!DOCTYPE html>
<html lang="es">
<head>
<jsp:include page="/partials/head.jsp"></jsp:include>

<style>
body {
	padding-top: 40px;
}
</style>
</head>

<body>

	<div>

		<header>
			<jsp:include page="/partials/nav.jsp"></jsp:include>
		</header>

	</div>

	<main class="container">

		<div class="bg-light p-4 mb-3 rounded">
			<h1>Usuarios</h1>
		</div>

		<br />

		<div class="container">
			<a class="btn btn-lg btn-primary" href="/TurismoEnLaTierraMediaCapitulo2-maven/views/users/create.jsp">Añadir usuario</a>
		</div>
		<table class="table table-stripped table-hover">
			<thead>
				<tr>
				    <th>Avatar</th>
					<th>Nombre</th>
					<th>Password</th>
					<th>Presupuesto</th>
					<th>tiempo</th>
					<th>Preferencia</th>
					<th>Estado</th>
					<th>Acciones</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${users}" var="client">
					<tr>
						<c:if test="${!client.isAdmin()}">
						<td><img src="${client.image}" class="rounded-circle"
							alt="attracction" width="80" height="80"></td>
						<td><strong><c:out value="${client.name}"></c:out></strong></td>
						<td><c:out value="${client.password}"></c:out></td>
						<td><c:out value="${client.budget}"></c:out></td>
						<td><c:out value="${client.time}"></c:out></td>
						<td><c:out value="${client.preferences}"></c:out></td>
						<td><c:choose>
						<c:when test="${client.isActive()}">
						<p>ACTIVO</p></c:when>
						<c:otherwise><p>INACTIVO</p></c:otherwise>
						</c:choose>
						<td><a
									href="/TurismoEnLaTierraMediaCapitulo2-maven/views/users/edit.do?id=${client.id}"
									class="btn btn-light rounded-0" role="button"><i
									class="bi bi-pencil-fill"></i></a>
						<c:choose>
						<c:when test="${client.isActive()}">
								<a href="/TurismoEnLaTierraMediaCapitulo2-maven/views/users/delete.do?id=${client.id}"
									class="btn btn-danger rounded" role="button"><i
									class="bi bi-x-circle-fill"></i></a>
						</c:when>
						<c:otherwise>
								<a	href="/TurismoEnLaTierraMediaCapitulo2-maven/views/users/add.do?id=${client.id}"
									class="btn btn-success rounded" role="button"><i
									class="bi bi-check-circle-fill"></i></a>
							
							</c:otherwise>
						</c:choose>	
						</td>
						</c:if>

					</tr>
				</c:forEach>
			</tbody>
		</table>
	</main>

	<br />

	<!-- Footer -->
	<footer class="page-footer font-small teal pt-4 bg-dark text-white"
		style="background-color: rgba(0, 0, 0, 0.2);">

		<!-- Footer Text -->
		<div class="container-fluid text-center text-md-left">

			<!-- Grid row -->
			<div class="row">

				<!-- Grid column -->
				<div class="col-md-6 mt-md-0 mt-3">

					<!-- Content -->
					<h5 class="text-uppercase font-weight-bold">Nuestros
						Profesores</h5>
					<ul class="profes">
						<li>Blautzik, Leonardo José</li>
						<li>Cantore, Roberto</li>
						<li>Gasior, Federico</li>
						<li>Videla, Lucas</li>
					</ul>


				</div>
				<!-- Grid column -->

				<hr class="clearfix w-100 d-md-none pb-3">

				<!-- Grid column -->
				<div class="col-md-6 mb-md-0 mb-3">

					<!-- Content -->
					<h5 class="text-uppercase font-weight-bold">Nosotros</h5>
					<ul class="alumnos">
						<li>Toledo, Florencia <a
							href="https://www.linkedin.com/in/florencia-toledo-77386b211/"><i
								title="Forencia" style="color: blue;" class="bi bi-linkedin"></i></a></li>
						<li>Orellana, Felix Andres <a
							href="https://www.linkedin.com/in/f%C3%A9lix-andr%C3%A9s-orellana-69a28955/"><i
								title="Andres" style="color: blue;" class="bi bi-linkedin"></i></a></li>
						<li>Paczkowski, Eduardo Nahuel <a
							href="https://www.linkedin.com/in/eduardo-nahuel-paczkowski/"><i
								title="Nahuel" style="color: blue;" class="bi bi-linkedin"></i></a></li>
						<li>Graff, Héctor Pablo <a
							href="https://www.linkedin.com/in/hector-pablo-graff/"><i
								title="Pablo" style="color: blue;" class="bi bi-linkedin"></i></a></li>
					</ul>

				</div>
				<!-- Grid column -->

			</div>
			<!-- Grid row -->

		</div>
		<!-- Footer Text -->

		<!-- Copyright -->
		<div class="footer-copyright text-center py-3">
			<ul class="seccion-final">
				<li class="seccion-final__parrafo">Hecho con ❤️</li>
				<li class="seccion-final__parrafo">Por Hello World!!</li>
				<li class="seccion-final__parrafo">Para ArgentinaPrograma</li>
				<li class="seccion-final__parrafo">© 2021 Copyright</li>
			</ul>
		</div>
		<!-- Copyright -->

	</footer>
	<!-- Footer -->

</body>
</html>