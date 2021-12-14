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

		<c:if test="${promotion != null && !promotion.isValid()}">
			<div class="alert alert-danger">
				<p>Se encontraron errores al actualizar la Promoción.</p>
			</div>
		</c:if>

		<form action="/TurismoEnLaTierraMediaCapitulo2-maven/views/promotions/edit.do" method="post">
			<input type="hidden" name="id" value="${promotion.id}">
			<jsp:include page="/views/promotions/formForUpdate.jsp"></jsp:include>
		</form>
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