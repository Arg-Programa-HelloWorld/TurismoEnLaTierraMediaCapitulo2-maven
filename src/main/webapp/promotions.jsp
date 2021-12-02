<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<link rel="stylesheet" type="text/css" href="css/style.css">

<!-- Bootstrap CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">

<title>Turismo en la Tierra Media</title>
</head>

<body>

	<div class="container-fluid">

		<header>
			<jsp:include page="inc/head.jsp"></jsp:include>
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
					<img src="images/promotions/adventure.jpg" class="d-block w-100"
						alt="...">
					<div class="carousel-caption d-none d-md-block">
						<h3>Adventure</h3>
					</div>
				</div>
				<div class="carousel-item">
					<img src="images/promotions/tasting.jpg" class="d-block w-100"
						alt="...">
					<div class="carousel-caption d-none d-md-block">
						<h3>Tasting</h3>
					</div>
				</div>
				<div class="carousel-item">
					<img src="images/promotions/scenery.jpg" class="d-block w-100"
						alt="...">
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
			<div class="container marketing">

				<!-- Three columns of text below the carousel -->
				<div class="row">
					<div class="col-lg-4">
						<img src="images/attractions/moria.jpg" class="rounded-circle"
							alt="Cinque Terre" width="140" height="140">

						<h2>Moria</h2>
						<p>Some representative placeholder content for the three
							columns of text below the carousel. This is the first column.</p>
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
						Pack Aventura. <span class="text-muted">Tu proxima gran aventura!!</span>
					</h2>
					<p class="lead">¿A quién no le gustaría pasar unos días en la Tierra Media para sentirse todo un hobbit? Recorre 
					los lugares más increibles, pero eso si, sentimos decirte que hay veces que te quedaras un poco corto de tiempo para 
					conocerlos a todos, elige los de tu preferencia y vive una experiencia encantadora.</p>
				</div>
				<div class="col-md-5">
					
					<img src="images/promotions/500x500/adventure.jpg" alt="Cinque Terre" width="500" height="500">
					
				</div>
			</div>

			<hr class="featurette-divider">

			<div class="row featurette">
				<div class="col-md-7 order-md-2">
					<h2 class="featurette-heading">
						Pack Degustacion. <span class="text-muted">Te dejará boquiabierto.</span>
					</h2>
					<p class="lead">A todas las horas del dia viajeros errantes, grupos de amigos y familias eligen el 
					menú degustación. En el lugar se sirve comida casera en un ambiente familiar y agradable, como era de esperar
					para una gran comida en La Comarca..</p>
				</div>
				<div class="col-md-5 order-md-1">
					
					<img src="images/promotions/500x500/tasting.jpg" alt="Cinque Terre" width="500" height="500">

				</div>
			</div>

			<hr class="featurette-divider">

			<div class="row featurette">
				<div class="col-md-7">
					<h2 class="featurette-heading">
						Pack Paisajes. <span class="text-muted">Ver por ti mismo.</span>
					</h2>
					<p class="lead">Turismo cinematografico, ya que es lo minimo que podemos decir en lo que respecta a las zonas
						repletas de lugares magicos que haran una experiencia inmersiva viviendo de lleno todos los paisajes que ofrece
						 la Tierra Media 
					.</p>
				</div>
				<div class="col-md-5">
					
					<img src="images/promotions/500x500/scenery.jpg" alt="Cinque Terre" width="500" height="500">						

				</div>
			</div>

			<hr class="featurette-divider">

			<!-- /END THE FEATURETTES -->

		</div>


		<footer>Hecho con ❤️ By Hello World!!</footer>

	</div>
	<!-- Optional JavaScript; choose one of the two! -->

	<!-- Option 1: Bootstrap Bundle with Popper -->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
		crossorigin="anonymous"></script>

	<!-- Option 2: Separate Popper and Bootstrap JS -->
	<!--
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js" integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js" integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13" crossorigin="anonymous"></script>
    -->
</body>

</html>