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

	<div class="container-fluid">

		<header>
			<jsp:include page="/partials/nav.jsp"></jsp:include>
		</header>

		<div class="container-fluid">
			<h1>Our Attractions</h1>
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

				<button type="button" data-bs-target="#carouselExampleCaptions"
					data-bs-slide-to="3" aria-label="Slide 4"></button>

				<button type="button" data-bs-target="#carouselExampleCaptions"
					data-bs-slide-to="4" aria-label="Slide 5"></button>

				<button type="button" data-bs-target="#carouselExampleCaptions"
					data-bs-slide-to="5" aria-label="Slide 6"></button>

				<button type="button" data-bs-target="#carouselExampleCaptions"
					data-bs-slide-to="6" aria-label="Slide 7"></button>

				<button type="button" data-bs-target="#carouselExampleCaptions"
					data-bs-slide-to="7" aria-label="Slide 8"></button>

				<button type="button" data-bs-target="#carouselExampleCaptions"
					data-bs-slide-to="8" aria-label="Slide 9"></button>

			</div>
			<div class="carousel-inner">
				<div class="carousel-item active">
					<img src="../../images/attractions/moria.jpg" class="d-block w-100"
						alt="...">
					<div class="carousel-caption d-none d-md-block">
						<h5>Moria</h5>
						<p>??Pozo Oscuro?? El Reino de Moria eran las m??s grandes minas
							construidas por los enanos, tambi??n conocidas como Khazad-d??m, la
							Mina del Enano, de la Tierra Media.</p>
					</div>
				</div>
				<div class="carousel-item">
					<img src="../../images/attractions/minas_tirith.jpg"
						class="d-block w-100" alt="...">
					<div class="carousel-caption d-none d-md-block">
						<h5>Minas Tirith</h5>
						<p>Minas Tirith era la Torre construida por Finrod Felagund en
							Tol Sirion para vigilar los pasos norte??os del R??o Sirion. Es la
							capital de Gondor en la tercera y Cuarta Edad del Sol de la
							Tierra Media.</p>
					</div>
				</div>
				<div class="carousel-item">
					<img src="../../images/attractions/la_comarca.jpg"
						class="d-block w-100" alt="...">
					<div class="carousel-caption d-none d-md-block">
						<h5>La Comarca</h5>
						<p>Es una regi??n situada en el noroeste de la Tierra Media,
							uno de los continentes del mundo ficticio de Arda donde trascurre
							la mayor parte del legendarium de J. R. R. Tolkien.</p>
					</div>
				</div>
				<div class="carousel-item">
					<img src="../../images/attractions/mordor.jpg"
						class="d-block w-100" alt="...">
					<div class="carousel-caption d-none d-md-block">
						<h5>Mordor</h5>
						<p>Es un pa??s situado al sureste de la Tierra Media, que tuvo
							gran importancia durante la Guerra del Anillo. En esta regi??n
							principalmente volc??nica, situada al este de Gondor, Sauron forj??
							el Anillo ??nico en las fraguas del Monte del Destino, hacia el
							a??o 1600 SE, con el objetivo de dominar por completo a los
							pueblos de la Tierra Media.</p>
					</div>
				</div>
				<div class="carousel-item">
					<img src="../../images/attractions/abismo_de_helm.jpg"
						class="d-block w-100" alt="...">
					<div class="carousel-caption d-none d-md-block">
						<h5>Abismo de Helm</h5>
						<p>Es un pa??s situado al sureste de la Tierra Media, que tuvo
							gran importancia durante la Guerra del Anillo. En la batalla del
							abismo de Helm se enfrentaron las fuerzas de Rohan y las de
							Isengard. Participaron tambi??n varios miembros de la Comunidad
							del Anillo y los ucornos..</p>
					</div>
				</div>
				<div class="carousel-item">
					<img src="../../images/attractions/lothlorien.jpg"
						class="d-block w-100" alt="...">
					<div class="carousel-caption d-none d-md-block">
						<h5>Lothlorien</h5>
						<p>Es un reino ??lfico de la Tierra Media, ubicado al este de
							las Monta??as Nubladas y m??s all?? de las puertas de Moria. En Aman
							existen unos jardines llamados L??rien, destinados al reposo y la
							curaci??n de las almas.</p>
					</div>
				</div>
				<div class="carousel-item">
					<img src="../../images/attractions/erebor.jpg"
						class="d-block w-100" alt="...">
					<div class="carousel-caption d-none d-md-block">
						<h5>Erebor</h5>
						<p>Erebor, tambi??n llamada la Monta??a Solitaria. Se trata de
							una elevaci??n aislada situada al noreste de Rhovanion, que fue
							arrebatada por un drag??n, llamado Smaug, al rey Thr??r de los
							enanos.</p>
					</div>
				</div>
				<div class="carousel-item">
					<img src="../../images/attractions/bosque_negro.jpg"
						class="d-block w-100" alt="...">
					<div class="carousel-caption d-none d-md-block">
						<h5>Bosque Negro</h5>
						<p>El Bosque Negro, es el nombre que toma el Gran Bosque Verde
							despu??s de la llegada del Nigromante en el a??o 1050 de la Tercera
							Edad del Sol. Est?? ubicado al este del r??o Anduin, en la regi??n
							de la Tierra Media llamada Rhovanion..</p>
					</div>
				</div>
				<div class="carousel-item">
					<img src="../../images/attractions/paso_de_caradhras.jpg"
						class="d-block w-100" alt="...">
					<div class="carousel-caption d-none d-md-block">
						<h5>Paso de Caradhras</h5>
						<p>el pico Caradhras (tambi??n llamado el Cruel o "el Cuerno
							Rojo"), es un gran pico en el macizo de las Monta??as Nubladas, el
							m??s occidental y m??s cercano a Eregion (Acebeda) de los tres que,
							junto al Celebdil y el Fanuidhol, constitu??an las cimas
							principales bajo las cuales se hallaba Khazad-d??m. Est?? cubierto
							de nieves perpetuas.</p>
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
			<div class="container marketing">

				<!-- Three columns of text below the carousel -->
				<div class="row">
					<div class="col-lg-4">
						<img src="../../images/attractions/moria.jpg"
							class="rounded-circle" alt="Cinque Terre" width="140"
							height="140">

						<h2>Moria</h2>
						<p>Some representative placeholder content for the three
							columns of text below the carousel. This is the first column.</p>
						<p>
							<a class="btn btn-secondary"
								href="/TurismoEnLaTierraMediaCapitulo2-maven/views/attractions/index.do">Ver
								detalles??</a>
						</p>
					</div>
					<!-- /.col-lg-4 -->

					<div class="col-lg-4">
						<img src="../../images/attractions/minas_tirith.jpg"
							class="rounded-circle" alt="Cinque Terre" width="140"
							height="140">

						<h2>Minas Tirith</h2>
						<p>Another exciting bit of representative placeholder content.
							This time, we've moved on to the second column.</p>
						<p>
							<a class="btn btn-secondary" href="#">View details ??</a>
						</p>
					</div>
					<!-- /.col-lg-4 -->

					<div class="col-lg-4">
						<img src="../../images/attractions/la_comarca.jpg"
							class="rounded-circle" alt="Cinque Terre" width="140"
							height="140">

						<h2>La Comarca</h2>
						<p>And lastly this, the third column of representative
							placeholder content.</p>
						<p>
							<a class="btn btn-secondary" href="#">View details ??</a>
						</p>
					</div>
					<!-- /.col-lg-4 -->

					<div class="col-lg-4">
						<img src="../../images/attractions/mordor.jpg"
							class="rounded-circle" alt="Cinque Terre" width="140"
							height="140">

						<h2>Mordor</h2>
						<p>And lastly this, the third column of representative
							placeholder content.</p>
						<p>
							<a class="btn btn-secondary" href="#">View details ??</a>
						</p>
					</div>
					<!-- /.col-lg-4 -->

					<div class="col-lg-4">
						<img src="../../images/attractions/abismo_de_helm.jpg"
							class="rounded-circle" alt="Cinque Terre" width="140"
							height="140">

						<h2>Abismo de Helm</h2>
						<p>Some representative placeholder content for the three
							columns of text below the carousel. This is the first column.</p>
						<p>
							<a class="btn btn-secondary" href="#">View details ??</a>
						</p>
					</div>
					<!-- /.col-lg-4 -->

					<div class="col-lg-4">
						<img src="../../images/attractions/lothlorien.jpg"
							class="rounded-circle" alt="Cinque Terre" width="140"
							height="140">

						<h2>Lothlorien</h2>
						<p>Another exciting bit of representative placeholder content.
							This time, we've moved on to the second column.</p>
						<p>
							<a class="btn btn-secondary" href="#">View details ??</a>
						</p>
					</div>
					<!-- /.col-lg-4 -->

					<div class="col-lg-4">
						<img src="../../images/attractions/erebor.jpg"
							class="rounded-circle" alt="Cinque Terre" width="140"
							height="140">

						<h2>Erebor</h2>
						<p>And lastly this, the third column of representative
							placeholder content.</p>
						<p>
							<a class="btn btn-secondary" href="#">View details ??</a>
						</p>
					</div>
					<!-- /.col-lg-4 -->

					<div class="col-lg-4">
						<img src="../../images/attractions/bosque_negro.jpg"
							class="rounded-circle" alt="Cinque Terre" width="140"
							height="140">

						<h2>Bosque Negro</h2>
						<p>And lastly this, the third column of representative
							placeholder content.</p>
						<p>
							<a class="btn btn-secondary" href="#">View details ??</a>
						</p>
					</div>
					<!-- /.col-lg-4 -->

					<div class="col-lg-4">
						<img src="../../images/attractions/paso_de_caradhras.jpg"
							class="rounded-circle" alt="Cinque Terre" width="140"
							height="140">

						<h2>Paso de Caradhras</h2>
						<p>And lastly this, the third column of representative
							placeholder content.</p>
						<p>
							<a class="btn btn-secondary" href="#">View details ??</a>
						</p>
					</div>
					<!-- /.col-lg-4 -->


				</div>
				<!-- /.row -->
			</div>

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
						<li>Toledo, Florencia</li>
						<li>Orellana, Felix Andres</li>
						<li>Paczkowski, Eduardo Nahuel</li>
						<li>Graff, H??ctor Pablo</li>
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