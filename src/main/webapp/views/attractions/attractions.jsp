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
</style>
</head>

<body>

	<div>

		<header>
			<jsp:include page="/partials/nav.jsp"></jsp:include>
		</header>

		<div class="bg-light p-4 mb-3 rounded">
			<h1>Estas son las Atracciones de la Tierra Media</h1>
		</div>
		
		<hr>
			
		<br />

		<div class="container-fluid">
			<div class="container marketing">

				<!-- Three columns of text below the carousel -->
				<div class="row">
					<div class="col-lg-4">
						<img src="../../images/attractions/moria.jpg"
							class="rounded-circle" alt="Cinque Terre" width="140"
							height="140">

						<h2>Moria</h2>
						<p>«Pozo Oscuro» El Reino de Moria eran las más grandes minas
							construidas por los enanos, también conocidas como Khazad-dûm, la
							Mina del Enano, de la Tierra Media.</p>
						<p>
							<a class="btn btn-secondary"
								href="/TurismoEnLaTierraMediaCapitulo2-maven/views/attractions/index.do">Ir a comprar»</a>
						</p>
					</div>
					<!-- /.col-lg-4 -->

					<div class="col-lg-4">
						<img src="../../images/attractions/minas_tirith.jpg"
							class="rounded-circle" alt="Cinque Terre" width="140"
							height="140">

						<h2>Minas Tirith</h2>
						<p>Minas Tirith era la Torre construida por Finrod Felagund en
							Tol Sirion para vigilar los pasos norteños del Río Sirion. Es la
							capital de Gondor en la tercera y Cuarta Edad del Sol de la
							Tierra Media.</p>
						<p>
							<a class="btn btn-secondary"
								href="/TurismoEnLaTierraMediaCapitulo2-maven/views/attractions/index.do">Ir a comprar»</a>
						</p>
					</div>
					<!-- /.col-lg-4 -->

					<div class="col-lg-4">
						<img src="../../images/attractions/la_comarca.jpg"
							class="rounded-circle" alt="Cinque Terre" width="140"
							height="140">

						<h2>La Comarca</h2>
						<p>Es una región situada en el noroeste de la Tierra Media,
							uno de los continentes del mundo ficticio de Arda donde trascurre
							la mayor parte del legendarium de J. R. R. Tolkien.</p>
						<p>
							<a class="btn btn-secondary"
								href="/TurismoEnLaTierraMediaCapitulo2-maven/views/attractions/index.do">Ir a comprar»</a>
						</p>
					</div>
					<!-- /.col-lg-4 -->

					<hr>

					<div class="col-lg-4">
						<img src="../../images/attractions/mordor.jpg"
							class="rounded-circle" alt="Cinque Terre" width="140"
							height="140">

						<h2>Mordor</h2>
						<p>Es un país situado al sureste de la Tierra Media, que tuvo
							gran importancia durante la Guerra del Anillo. En esta región
							principalmente volcánica, situada al este de Gondor, Sauron forjó
							el Anillo Único en las fraguas del Monte del Destino, hacia el
							año 1600 SE, con el objetivo de dominar por completo a los
							pueblos de la Tierra Media.</p>
						<p>
							<a class="btn btn-secondary"
								href="/TurismoEnLaTierraMediaCapitulo2-maven/views/attractions/index.do">Ir a comprar»</a>
						</p>
					</div>
					<!-- /.col-lg-4 -->

					<div class="col-lg-4">
						<img src="../../images/attractions/abismo_de_helm.jpg"
							class="rounded-circle" alt="Cinque Terre" width="140"
							height="140">

						<h2>Abismo de Helm</h2>
						<p>Es un país situado al sureste de la Tierra Media, que tuvo
							gran importancia durante la Guerra del Anillo. En la batalla del
							abismo de Helm se enfrentaron las fuerzas de Rohan y las de
							Isengard. Participaron también varios miembros de la Comunidad
							del Anillo y los ucornos..</p>
						<p>
							<a class="btn btn-secondary"
								href="/TurismoEnLaTierraMediaCapitulo2-maven/views/attractions/index.do">Ir a comprar»</a>
						</p>
					</div>
					<!-- /.col-lg-4 -->

					<div class="col-lg-4">
						<img src="../../images/attractions/lothlorien.jpg"
							class="rounded-circle" alt="Cinque Terre" width="140"
							height="140">

						<h2>Lothlorien</h2>
						<p>Es un reino élfico de la Tierra Media, ubicado al este de
							las Montañas Nubladas y más allá de las puertas de Moria. En Aman
							existen unos jardines llamados Lórien, destinados al reposo y la
							curación de las almas.</p>
						<p>
							<a class="btn btn-secondary"
								href="/TurismoEnLaTierraMediaCapitulo2-maven/views/attractions/index.do">Ir a comprar»</a>
						</p>
					</div>
					<!-- /.col-lg-4 -->

					<hr>
					
					<div class="col-lg-4">
						<img src="../../images/attractions/erebor.jpg"
							class="rounded-circle" alt="Cinque Terre" width="140"
							height="140">

						<h2>Erebor</h2>
						<p>Erebor, también llamada la Montaña Solitaria. Se trata de
							una elevación aislada situada al noreste de Rhovanion, que fue
							arrebatada por un dragón, llamado Smaug, al rey Thrór de los
							enanos.</p>
						<p>
							<a class="btn btn-secondary"
								href="/TurismoEnLaTierraMediaCapitulo2-maven/views/attractions/index.do">Ir a comprar»</a>
						</p>
					</div>
					<!-- /.col-lg-4 -->

					<div class="col-lg-4">
						<img src="../../images/attractions/bosque_negro.jpg"
							class="rounded-circle" alt="Cinque Terre" width="140"
							height="140">

						<h2>Bosque Negro</h2>
						<p>El Bosque Negro, es el nombre que toma el Gran Bosque Verde
							después de la llegada del Nigromante en el año 1050 de la Tercera
							Edad del Sol. Está ubicado al este del río Anduin, en la región
							de la Tierra Media llamada Rhovanion..</p>
						<p>
							<a class="btn btn-secondary"
								href="/TurismoEnLaTierraMediaCapitulo2-maven/views/attractions/index.do">Ir a comprar»</a>
						</p>
					</div>
					<!-- /.col-lg-4 -->

					<div class="col-lg-4">
						<img src="../../images/attractions/paso_de_caradhras.jpg"
							class="rounded-circle" alt="Cinque Terre" width="140"
							height="140">

						<h2>Paso de Caradhras</h2>
						<p>el pico Caradhras (también llamado el Cruel o "el Cuerno
							Rojo"), es un gran pico en el macizo de las Montañas Nubladas, el
							más occidental y más cercano a Eregion (Acebeda) de los tres que,
							junto al Celebdil y el Fanuidhol, constituían las cimas
							principales bajo las cuales se hallaba Khazad-dûm. Está cubierto
							de nieves perpetuas.</p>
						<p>
							<a class="btn btn-secondary"
								href="/TurismoEnLaTierraMediaCapitulo2-maven/views/attractions/index.do">Ir a comprar»</a>
						</p>
					</div>
					<!-- /.col-lg-4 -->

				</div>
				<!-- /.row -->
			</div>

		</div>

	</div>

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