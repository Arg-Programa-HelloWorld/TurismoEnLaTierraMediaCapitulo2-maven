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
				<h1>Tourism in Middle Earth</h1>
			</div>
	
			<div>
				<img src="../images/mapa_tierra_media.jpg" width="100%;">
			</div>
			
			<br>
	
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