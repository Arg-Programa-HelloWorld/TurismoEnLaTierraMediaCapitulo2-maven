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

		<c:if test="${flash != null}">
			<div class="alert alert-danger">
				<p>
					<c:out value="${flash}" />
					<c:if test="${errors != null}">
						<ul>
							<c:forEach items="${errors}" var="entry">
								<li><c:out value="${entry.getValue()}"></c:out></li>
							</c:forEach>
						</ul>
					</c:if>
				</p>
			</div>
		</c:if>
		<c:if test="${success != null}">
			<div class="alert alert-success">
				<p>
					<c:out value="${success}"></c:out>
				</p>
			</div>
		</c:if>

		<div class="bg-light p-4 mb-3 rounded">
			<h1>Estas son las Promociones de la Tierra Media</h1>
		</div>

		<div class="bd-example">

			<div id="carouselExampleCaptions" class="carousel slide"
				data-bs-ride="carousel">
				<div class="carousel-inner">
					<c:forEach items="${promotions}" var="promotion">
						<c:if test="${ promotion.id eq 1}">
							<div class="carousel-item active">
						</c:if>
						<c:if test="${promotion.id ne 1}">
							<div class="carousel-item">
						</c:if>
						<img src=<c:out value="${promotion.image}"></c:out>
							class="bd-placeholder-img bd-placeholder-img-lg d-block w-100"
							width="800" height="400" alt="${promotion.name }">
						<div class="carousel-caption d-none d-md-block">
							<h2>
								<b><c:out value="${promotion.name }"></c:out></b>
							</h2>
							<p>
								<h5>$ ${promotion.cost }</h5>
							</p>
						</div>
				</div>
				</c:forEach>
				<a class="carousel-control-prev" href="#carouselExampleCaptions"
					role="button" data-bs-slide="prev"> <span
					class="carousel-control-prev-icon" aria-hidden="true"></span> <span
					class="sr-only">Anterior</span>
				</a> <a class="carousel-control-next" href="#carouselExampleCaptions"
					role="button" data-bs-slide="next"> <span
					class="carousel-control-next-icon" aria-hidden="true"></span> <span
					class="sr-only">Siguiente</span>
				</a>
				
			</div>
			
		</div>

		<br />
		
		<c:if test="${user.isAdmin()}">
			<div class="mb-3">
				<a href="/TurismoEnLaTierraMediaCapitulo2-maven/views/promotions/create.do" class="btn btn-primary"
					role="button"> <i class="bi bi-plus-lg"></i> Nueva Promoci??n
				</a>
			</div>
		</c:if>

		<table class="table table-stripped table-hover">
			<thead>
				<tr>
					<th>Imagen</th>
					<th>Promocion&oacute;n</th>
					<th>Costo</th>
					<th>Duraci&oacute;n</th>
					<th>Cupo</th>
					<th>Acciones</th>
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
						<td><c:out value="${promotion.quota}"></c:out></td>
						
						<td><c:if test="${user.isAdmin()}">
								<a
									href="/TurismoEnLaTierraMediaCapitulo2-maven/views/promotions/edit.do?id=${promotion.id}"
									class="btn btn-light rounded-0" role="button"><i
									class="bi bi-pencil-fill"></i></a>
								<a
									href="/TurismoEnLaTierraMediaCapitulo2-maven/views/promotions/delete.do?id=${promotion.id}"
									class="btn btn-danger rounded" role="button"><i
									class="bi bi-x-circle-fill"></i></a>
							</c:if> <c:choose>

								<c:when
									test="${user.canAfford(promotion) && user.canAttend(promotion)}">
									<a
										href="/TurismoEnLaTierraMediaCapitulo2-maven/views/promotions/buy.do?id=${promotion.id}"
										class="btn btn-success rounded" role="button">Comprar</a>
								</c:when>
								<c:otherwise>
									<a href="#" class="btn btn-secondary rounded disabled"
										role="button">No se puede comprar</a>
								</c:otherwise>
							</c:choose></td>
						
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
						<li>Blautzik, Leonardo Jos??</li>
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
						<li>Toledo, Florencia <a href="https://www.linkedin.com/in/florencia-toledo-77386b211/"><i title="Forencia" style="color: blue;" class="bi bi-linkedin"></i></a></li>
						<li>Orellana, Felix Andres <a href="https://www.linkedin.com/in/f%C3%A9lix-andr%C3%A9s-orellana-69a28955/"><i title="Andres" style="color: blue;" class="bi bi-linkedin"></i></a></li>
						<li>Paczkowski, Eduardo Nahuel <a href="https://www.linkedin.com/in/eduardo-nahuel-paczkowski/"><i title="Nahuel" style="color: blue;" class="bi bi-linkedin"></i></a></li>
						<li>Graff, H??ctor Pablo <a href="https://www.linkedin.com/in/hector-pablo-graff/"><i title="Pablo" style="color: blue;" class="bi bi-linkedin"></i></a></li>
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
				<li class="seccion-final__parrafo">Hecho con ??????</li>
				<li class="seccion-final__parrafo">Por Hello World!!</li>
				<li class="seccion-final__parrafo">Para ArgentinaPrograma</li>
				<li class="seccion-final__parrafo">?? 2021 Copyright</li>
			</ul>
		</div>
		<!-- Copyright -->

	</footer>
	<!-- Footer -->

</body>
</html>