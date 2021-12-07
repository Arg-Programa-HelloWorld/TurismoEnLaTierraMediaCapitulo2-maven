<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
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
							<p>«Pozo Oscuro» El Reino de Moria eran las más grandes minas
								construidas por los enanos, también conocidas como Khazad-dûm, la
								Mina del Enano, de la Tierra Media.</p>
						</div>
					</div>
					<div class="carousel-item">
						<img src="../../images/attractions/minas_tirith.jpg"
							class="d-block w-100" alt="...">
						<div class="carousel-caption d-none d-md-block">
							<h5>Minas Tirith</h5>
							<p>Minas Tirith era la Torre construida por Finrod Felagund en
								Tol Sirion para vigilar los pasos norteños del Río Sirion. Es la
								capital de Gondor en la tercera y Cuarta Edad del Sol de la
								Tierra Media.</p>
						</div>
					</div>
					<div class="carousel-item">
						<img src="../../images/attractions/la_comarca.jpg" class="d-block w-100"
							alt="...">
						<div class="carousel-caption d-none d-md-block">
							<h5>La Comarca</h5>
							<p>Es una región situada en el noroeste de la Tierra Media,
								uno de los continentes del mundo ficticio de Arda donde trascurre
								la mayor parte del legendarium de J. R. R. Tolkien.</p>
						</div>
					</div>
					<div class="carousel-item">
						<img src="../../images/attractions/mordor.jpg" class="d-block w-100"
							alt="...">
						<div class="carousel-caption d-none d-md-block">
							<h5>Mordor</h5>
							<p>Es un país situado al sureste de la Tierra Media, que tuvo
								gran importancia durante la Guerra del Anillo. En esta región
								principalmente volcánica, situada al este de Gondor, Sauron forjó
								el Anillo Único en las fraguas del Monte del Destino, hacia el
								año 1600 SE, con el objetivo de dominar por completo a los
								pueblos de la Tierra Media.</p>
						</div>
					</div>
					<div class="carousel-item">
						<img src="../../images/attractions/abismo_de_helm.jpg"
							class="d-block w-100" alt="...">
						<div class="carousel-caption d-none d-md-block">
							<h5>Abismo de Helm</h5>
							<p>Es un país situado al sureste de la Tierra Media, que tuvo
								gran importancia durante la Guerra del Anillo. En la batalla del
								abismo de Helm se enfrentaron las fuerzas de Rohan y las de
								Isengard. Participaron también varios miembros de la Comunidad
								del Anillo y los ucornos..</p>
						</div>
					</div>
					<div class="carousel-item">
						<img src="../../images/attractions/lothlorien.jpg" class="d-block w-100"
							alt="...">
						<div class="carousel-caption d-none d-md-block">
							<h5>Lothlorien</h5>
							<p>Es un reino élfico de la Tierra Media, ubicado al este de
								las Montañas Nubladas y más allá de las puertas de Moria. En Aman
								existen unos jardines llamados Lórien, destinados al reposo y la
								curación de las almas.</p>
						</div>
					</div>
					<div class="carousel-item">
						<img src="../../images/attractions/erebor.jpg" class="d-block w-100"
							alt="...">
						<div class="carousel-caption d-none d-md-block">
							<h5>Erebor</h5>
							<p>Erebor, también llamada la Montaña Solitaria. Se trata de
								una elevación aislada situada al noreste de Rhovanion, que fue
								arrebatada por un dragón, llamado Smaug, al rey Thrór de los
								enanos.</p>
						</div>
					</div>
					<div class="carousel-item">
						<img src="../../images/attractions/bosque_negro.jpg"
							class="d-block w-100" alt="...">
						<div class="carousel-caption d-none d-md-block">
							<h5>Bosque Negro</h5>
							<p>El Bosque Negro, es el nombre que toma el Gran Bosque Verde
								después de la llegada del Nigromante en el año 1050 de la Tercera
								Edad del Sol. Está ubicado al este del río Anduin, en la región
								de la Tierra Media llamada Rhovanion..</p>
						</div>
					</div>
					<div class="carousel-item">
						<img src="../../images/attractions/paso_de_caradhras.jpg"
							class="d-block w-100" alt="...">
						<div class="carousel-caption d-none d-md-block">
							<h5>Paso de Caradhras</h5>
							<p>el pico Caradhras (también llamado el Cruel o "el Cuerno
								Rojo"), es un gran pico en el macizo de las Montañas Nubladas, el
								más occidental y más cercano a Eregion (Acebeda) de los tres que,
								junto al Celebdil y el Fanuidhol, constituían las cimas
								principales bajo las cuales se hallaba Khazad-dûm. Está cubierto
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
							<img src="../../images/attractions/moria.jpg" class="rounded-circle"
								alt="Cinque Terre" width="140" height="140">
	
							<h2>Moria</h2>
							<p>Some representative placeholder content for the three
								columns of text below the carousel. This is the first column.</p>
							<p>
								<a class="btn btn-secondary" href="#">View details »</a>
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
								<a class="btn btn-secondary" href="#">View details »</a>
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
								<a class="btn btn-secondary" href="#">View details »</a>
							</p>
						</div>
						<!-- /.col-lg-4 -->
	
						<div class="col-lg-4">
							<img src="../../images/attractions/mordor.jpg" class="rounded-circle"
								alt="Cinque Terre" width="140" height="140">
	
							<h2>Mordor</h2>
							<p>And lastly this, the third column of representative
								placeholder content.</p>
							<p>
								<a class="btn btn-secondary" href="#">View details »</a>
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
								<a class="btn btn-secondary" href="#">View details »</a>
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
								<a class="btn btn-secondary" href="#">View details »</a>
							</p>
						</div>
						<!-- /.col-lg-4 -->
	
						<div class="col-lg-4">
							<img src="../../images/attractions/erebor.jpg" class="rounded-circle"
								alt="Cinque Terre" width="140" height="140">
	
							<h2>Erebor</h2>
							<p>And lastly this, the third column of representative
								placeholder content.</p>
							<p>
								<a class="btn btn-secondary" href="#">View details »</a>
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
								<a class="btn btn-secondary" href="#">View details »</a>
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
								<a class="btn btn-secondary" href="#">View details »</a>
							</p>
						</div>
						<!-- /.col-lg-4 -->
	
	
					</div>
					<!-- /.row -->
				</div>
	
				<!-- START THE FEATURETTES -->
	
				<hr class="featurette-divider">
	
				<div class="row featurette">
					<div class="col-md-7">
						<h2 class="featurette-heading">
							First featurette heading. <span class="text-muted">It’ll
								blow your mind.</span>
						</h2>
						<p class="lead">Some great placeholder content for the first
							featurette here. Imagine some exciting prose here.</p>
					</div>
					<div class="col-md-5">
						<svg
							class="bd-placeholder-img bd-placeholder-img-lg featurette-image img-fluid mx-auto"
							width="500" height="500" xmlns="http://www.w3.org/2000/svg"
							role="img" aria-label="Placeholder: 500x500"
							preserveAspectRatio="xMidYMid slice" focusable="false">
								<title>Placeholder</title><rect width="100%" height="100%"
								fill="#eee"></rect>
								<text x="50%" y="50%" fill="#aaa" dy=".3em">500x500</text></svg>
	
					</div>
				</div>
	
				<hr class="featurette-divider">
	
				<div class="row featurette">
					<div class="col-md-7 order-md-2">
						<h2 class="featurette-heading">
							Oh yeah, it’s that good. <span class="text-muted">See for
								yourself.</span>
						</h2>
						<p class="lead">Another featurette? Of course. More placeholder
							content here to give you an idea of how this layout would work
							with some actual real-world content in place.</p>
					</div>
					<div class="col-md-5 order-md-1">
						<svg
							class="bd-placeholder-img bd-placeholder-img-lg featurette-image img-fluid mx-auto"
							width="500" height="500" xmlns="http://www.w3.org/2000/svg"
							role="img" aria-label="Placeholder: 500x500"
							preserveAspectRatio="xMidYMid slice" focusable="false">
								<title>Placeholder</title><rect width="100%" height="100%"
								fill="#eee"></rect>
								<text x="50%" y="50%" fill="#aaa" dy=".3em">500x500</text></svg>
	
					</div>
				</div>
	
				<hr class="featurette-divider">
	
				<div class="row featurette">
					<div class="col-md-7">
						<h2 class="featurette-heading">
							And lastly, this one. <span class="text-muted">Checkmate.</span>
						</h2>
						<p class="lead">And yes, this is the last block of
							representative placeholder content. Again, not really intended to
							be actually read, simply here to give you a better view of what
							this would look like with some actual content. Your content.</p>
					</div>
					<div class="col-md-5">
						<svg
							class="bd-placeholder-img bd-placeholder-img-lg featurette-image img-fluid mx-auto"
							width="500" height="500" xmlns="http://www.w3.org/2000/svg"
							role="img" aria-label="Placeholder: 500x500"
							preserveAspectRatio="xMidYMid slice" focusable="false">
								<title>Placeholder</title><rect width="100%" height="100%"
								fill="#eee"></rect>
								<text x="50%" y="50%" fill="#aaa" dy=".3em">500x500</text></svg>
	
					</div>
				</div>
	
				<hr class="featurette-divider">
	
				<!-- /END THE FEATURETTES -->
	
			</div>
	
			<footer>
				<ul class="seccion-final">
					<li class="seccion-final__parrafo">Hecho con ❤️</li>
					<li class="seccion-final__parrafo">By Hello World!!</li>
					<li class="seccion-final__parrafo">Para ArgentinaPrograma 2021</li>
				</ul>
			</footer>
	
		</div>
	
	</body>

</html>