<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<!DOCTYPE html>
<html lang="es">
<head>
<jsp:include page="/partials/head.jsp"></jsp:include>
</head>
<body>

	<div>

		<header>
			<jsp:include page="/partials/nav.jsp"></jsp:include>
		</header>

	</div>

	<main class="container">
	
		<button class="btn btn-secondary hidden-print" onclick="window.print()">
		<span class="glyphicon glyphicon-print" aria-hidden="true"></span> Imprimir itinerario</button>
		
		<br />
		<br />
		
		<div class="bg-light p-4 mb-3 rounded">
			<h1>Itinerario - Turismo en la Tierra Media</h1>
		</div>
		<hr>
		<p><h3>Usuario: <b><c:out value="${user.name}"></c:out></b></h3></p>
		<p><h3>Consumos: </h3></p>
		<p><h3><i title="tiempo" style="color: blue;" class="bi bi-clock-fill"></i> <b><c:out value="${user.totalTime}"></c:out></p></b></h3>
		<p><h3><i title="monedas" style="color: gold;" class="bi bi-coin"></i> <b><c:out value="${user.totalGold}"></c:out></p></b></h3>
		<hr>
		
		<div class="bg-light p-4 mb-3 rounded">
			<h1>Estas son sus Promociones</h1>
		</div>
		
		<table class="table table-stripped table-hover">
			<thead>
				<tr>
					<th>Imagen</th>
					<th>Promocion&oacute;n</th>
					<th>Costo</th>
					<th>Duraci&oacute;n</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${promotions}" var="promotion">
					<tr>
						<td><img src="${promotion.image}" class="rounded-circle"
							alt="Cinque Terre" width="80" height="80"></td>
						<td><strong><c:out value="${promotion.name}"></c:out></strong>
							<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.
								Cras pretium eros urna. Sed quis erat congue, bibendum tortor
								malesuada, iaculis diam. Ut ut imperdiet sapien.</p></td>
						<td><c:out value="${promotion.cost}"></c:out></td>
						<td><c:out value="${promotion.time}"></c:out></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		
		<div class="bg-light p-4 mb-3 rounded">
			<h1>Estas son sus Atracciones</h1>
		</div>


		<table class="table table-stripped table-hover">
			<thead>
				<tr>
					<th>Imagen</th>
					<th>Atracci&oacute;n</th>
					<th>Costo</th>
					<th>Duraci&oacute;n</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${attractions}" var="attraction">
					<tr>
						<td><img src="${attraction.image}" class="rounded-circle"
							alt="Cinque Terre" width="80" height="80"></td>
						<td><strong><c:out value="${attraction.name}"></c:out></strong>
							<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.
								Cras pretium eros urna. Sed quis erat congue, bibendum tortor
								malesuada, iaculis diam. Ut ut imperdiet sapien.</p></td>
						<td><c:out value="${attraction.cost}"></c:out></td>
						<td><c:out value="${attraction.time}"></c:out></td>
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