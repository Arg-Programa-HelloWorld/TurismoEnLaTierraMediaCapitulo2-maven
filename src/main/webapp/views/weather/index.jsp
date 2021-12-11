<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="es">

<head>

<jsp:include page="/partials/head.jsp"></jsp:include>

<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

</head>

<body background="../images/mapa_tierra_media.jpg">

	<div class="container-fluid">

		<header>
			<jsp:include page="/partials/nav.jsp"></jsp:include>
		</header>

	</div>

	<main class="container-fluid">

		<table
			class="table table-stripped table-hover table-bordered vertical-align: middle">
			<thead>
				<tr>
					<th><h1>Temperatura y Cielo</h1></th>
					<th><h1>Lugar</h1></th>
					<th><h1>Viento</h1></th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>
						<h1 id="temperatura-valor"></h1>
					</td>
					<td>
						<h1 id="ubicacion"></h1>
					</td>
					<td>
						<h1>Veloc. del Viento</h1>
					</td>
				</tr>
				<tr>
					<td>
						<h1 id="temperatura-descripcion"></h1>
					</td>
					<td>
						<h1>
							<img id="icono-animado" src="" alt="" height="140" width="140">
						</h1>
					</td>
					<td>
						<h1 id="viento-velocidad"></h1>
					</td>
				</tr>
			</tbody>

		</table>
		
		<div>
		
			<img src="${user.image}" alt="mdo" width="100" height="100" class="rounded-circle">
			
			Que piensas <b><c:out value="${user.name}"></c:out></b> es buen clima para nuevas aventuras ?
	  	
	  	</div>
	  	
		<script src="app.js"></script>

	</main>

	<!-- Footer -->
	<footer class="page-footer font-small teal pt-4 bg-dark text-white"
		style="background-color: rgba(0, 0, 0, 0.2);">
		<jsp:include page="/partials/footer.jsp"></jsp:include>		
	</footer>
	

</body>

</html>