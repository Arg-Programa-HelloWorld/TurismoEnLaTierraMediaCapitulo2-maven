<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<!DOCTYPE html>
<html lang="es">
<head>
<jsp:include page="/partials/head.jsp"></jsp:include>

<style>
.seccion-final {
	display: flex;
	justify-content: space-around;
}

.seccion-final__parrafo {
	display: inline;
	padding-left: 3px;
	padding-right: 3px;
}

img {
	border-radius: 3%;
}

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

		<div class="bg-light p-4 mb-3 rounded">
			<h1>Estas son las Promociones de la Tierra Media</h1>
		</div>

		<div class="container-fluid">

			<!-- START THE FEATURETTES -->

			<hr class="featurette-divider">

			<div class="row featurette">
				<div class="col-md-7">
					<h2 class="featurette-heading">
						Pack Aventura. <span class="text-muted">Tu proxima gran
							aventura!!</span>
					</h2>
					<p class="lead">¿A quién no le gustaría pasar unos días en la
						Tierra Media para sentirse todo un hobbit? Recorre los lugares más
						increibles, pero eso si, sentimos decirte que hay veces que te
						quedaras un poco corto de tiempo para conocerlos a todos, elige
						los de tu preferencia y vive una experiencia encantadora.
					</p>
					<p>
						<a class="btn btn-secondary" href="/TurismoEnLaTierraMediaCapitulo2-maven/views/promotions/index.do" role="button">Ir a comprar»</a>
					</p>
				</div>
				<div class="col-md-5">

					<img src="../../images/promotions/500x500/adventure.jpg"
						alt="Cinque Terre" width="400" height="400">

				</div>
			</div>

			<hr class="featurette-divider">

			<div class="row featurette">
				<div class="col-md-7 order-md-2">
					<h2 class="featurette-heading">
						Pack Degustacion. <span class="text-muted">Te dejará
							boquiabierto.</span>
					</h2>
					<p class="lead">A todas las horas del dia viajeros errantes,
						grupos de amigos y familias eligen el menú degustación. En el
						lugar se sirve comida casera en un ambiente familiar y agradable,
						como era de esperar para una gran comida en La Comarca..
					</p>
					<p>
						<a class="btn btn-secondary" href="/TurismoEnLaTierraMediaCapitulo2-maven/views/promotions/index.do" role="button">Ir a comprar»</a>
					</p>
				</div>
				<div class="col-md-5 order-md-1">

					<img src="../../images/promotions/500x500/tasting.jpg"
						alt="Cinque Terre" width="400" height="400">

				</div>
			</div>

			<hr class="featurette-divider">

			<div class="row featurette">
				<div class="col-md-7">
					<h2 class="featurette-heading">
						Pack Paisajes. <span class="text-muted">Ver por ti mismo.</span>
					</h2>
					<p class="lead">Turismo cinematografico, ya que es lo minimo
						que podemos decir en lo que respecta a las zonas repletas de
						lugares magicos que haran una experiencia inmersiva viviendo de
						lleno todos los paisajes que ofrece la Tierra Media .
					</p>
					<p>
						<a class="btn btn-secondary" href="/TurismoEnLaTierraMediaCapitulo2-maven/views/promotions/index.do" role="button">Ir a comprar»</a>
					</p>
				</div>
				<div class="col-md-5">

					<img src="../../images/promotions/500x500/scenery.jpg"
						alt="Cinque Terre" width="400" height="400">

				</div>
			</div>

			<hr class="featurette-divider">

			<!-- /END THE FEATURETTES -->

		</div>

	</div>

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
						<li>Toledo, Florencia</li>
						<li>Orellana, Felix Andres</li>
						<li>Paczkowski, Eduardo Nahuel</li>
						<li>Graff, Héctor Pablo</li>
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