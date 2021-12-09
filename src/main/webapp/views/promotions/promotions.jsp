<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

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
</style>
</head>

<body>

	<div class="container-fluid">

		<header>
			<jsp:include page="/partials/nav.jsp"></jsp:include>
		</header>

		<div class="container-fluid">
			<h1>Our Promotions</h1>
		</div>

		<div id="carouselExampleCaptions" class="carousel slide"
			data-bs-ride="carousel">
			<div class="carousel-indicators">
				<button type="button" data-bs-target="#carouselExampleCaptions"
					data-bs-slide-to="0" class="active" aria-current="true"
					aria-label="Slide 1"></button>

				<button type="button" data-bs-target="#carouselExampleCaptions"
					data-bs-slide-to="1" aria-label="Slide 2"></button>

				<button type="button" data-bs-target="#carouselExampleCaptions"
					data-bs-slide-to="2" aria-label="Slide 3"></button>

			</div>

			<div class="carousel-inner">
				<div class="carousel-item active">
					<img src="../../images/promotions/adventure.jpg"
						class="d-block w-100" alt="...">
					<div class="carousel-caption d-none d-md-block">
						<h3>Adventure</h3>
					</div>
				</div>
				<div class="carousel-item">
					<img src="../../images/promotions/tasting.jpg"
						class="d-block w-100" alt="...">
					<div class="carousel-caption d-none d-md-block">
						<h3>Tasting</h3>
					</div>
				</div>
				<div class="carousel-item">
					<img src="../../images/promotions/scenery.jpg"
						class="d-block w-100" alt="...">
					<div class="carousel-caption d-none d-md-block">
						<h3>Scenery</h3>
					</div>
				</div>
			</div>

			<button class="carousel-control-prev" type="button"
				data-bs-target="#carouselExampleCaptions" data-bs-slide="prev">
				<span class="carousel-control-prev-icon" aria-hidden="true"></span>
				<span class="visually-hidden">Previous</span>
			</button>
			<button class="carousel-control-next" type="button"
				data-bs-target="#carouselExampleCaptions" data-bs-slide="next">
				<span class="carousel-control-next-icon" aria-hidden="true"></span>
				<span class="visually-hidden">Next</span>
			</button>
		</div>

		<br />

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
						los de tu preferencia y vive una experiencia encantadora.</p>
				</div>
				<div class="col-md-5">

					<img src="../../images/promotions/500x500/adventure.jpg"
						alt="Cinque Terre" width="500" height="500">

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
						como era de esperar para una gran comida en La Comarca..</p>
				</div>
				<div class="col-md-5 order-md-1">

					<img src="../../images/promotions/500x500/tasting.jpg"
						alt="Cinque Terre" width="500" height="500">

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
						lleno todos los paisajes que ofrece la Tierra Media .</p>
				</div>
				<div class="col-md-5">

					<img src="../../images/promotions/500x500/scenery.jpg"
						alt="Cinque Terre" width="500" height="500">

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