<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<nav class="navbar navbar-expand-md navbar-dark bg-dark mb-4">
	
	<div class="container">
<<<<<<< HEAD
		<a class="navbar-brand" href="/TurismoEnLaTierraMediaCapitulo2-maven/views/index.jsp">Turismo en la Tierra Media</a>
	
		<button class="navbar-toggler" type="button" data-bs-toggle="collapse"
			data-bs-target="#navbarCollapse" aria-controls="navbarCollapse"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
	
		<div class="collapse navbar-collapse" id="navbarCollapse">
		
			<ul class="navbar-nav me-auto mb-2 mb-md-0">
				<li><a href="/TurismoEnLaTierraMediaCapitulo2-maven/views/index.jsp" class="nav-link px-2 text-white">Home</a></li>
				<li><a href="/TurismoEnLaTierraMediaCapitulo2-maven/views/attractions/attractions.jsp" class="nav-link px-2 text-white">Attractions</a></li>
				<li><a href="/TurismoEnLaTierraMediaCapitulo2-maven/views/promotions/promotions.jsp" class="nav-link px-2 text-white">Promotions</a></li>
				<li><a href="/TurismoEnLaTierraMediaCapitulo2-maven/views/attractions/index.do" class="nav-link px-2 text-white">FAQs</a></li>
				<li><a href="/TurismoEnLaTierraMediaCapitulo2-maven/views/promotions/index.do" class="nav-link px-2 text-white">About</a></li>
				<li><a href="" class="nav-link px-2 text-white">Itineraries</a></li>
			</ul>
		
			<div class="dropdown text-end">
	          <a href="#" class="d-block link-dark text-decoration-none dropdown-toggle" id="dropdownUser1" data-bs-toggle="dropdown" aria-expanded="false">
	            <img src="https://github.com/mdo.png" alt="mdo" width="32" height="32" class="rounded-circle">
	          </a>
	          
	          <ul class="dropdown-menu text-small" aria-labelledby="dropdownUser1" style="">
	            <li><a class="dropdown-item" href="#"><c:out value="${user.name}"></c:out></a></li>
	            <li><a class="dropdown-item" href="#"><i title="monedas" style="color: gold;" class="bi bi-coin"></i> <c:out value="${user.budget}"></c:out></a></li>
	            <li><a class="dropdown-item" href="#"><i title="tiempo" style="color: blue;" class="bi bi-clock-fill"></i> <c:out value="${user.time}h"></c:out></a></li>
	            <li><hr class="dropdown-divider"></li>
	            <li><a class="dropdown-item" href="/TurismoEnLaTierraMediaCapitulo2-maven/logout">Salir</a></li>
	          </ul>
	        </div>
					
=======
		<div
			class="d-flex flex-wrap align-items-center justify-content-center justify-content-lg-start">
			<a href="/"
				class="d-flex align-items-center mb-2 mb-lg-0 text-white text-decoration-none">
				<svg class="bi me-2" width="40" height="32" role="img"
					aria-label="Bootstrap">
							<use xlink:href="#bootstrap"></use></svg>
			</a>
			<div class="collapse navbar-collapse" id="navbarCollapse">
				<ul
					class="nav col-12 col-lg-auto me-lg-auto mb-2 justify-content-center mb-md-0">
					<li><a href="/TurismoEnLaTierraMediaCapitulo2-maven/views/index.jsp" class="nav-link px-2 text-white">Home</a></li>
					<li><a href="/TurismoEnLaTierraMediaCapitulo2-maven/views/attractions/attractions.jsp" class="nav-link px-2 text-white">Attractions</a></li>
					<li><a href="/TurismoEnLaTierraMediaCapitulo2-maven/views/promotions/promotions.jsp" class="nav-link px-2 text-white">Promotions</a></li>
					<li><a href="itineraries.jsp" class="nav-link px-2 text-white">Itineraries</a></li>
					<li><a href="/TurismoEnLaTierraMediaCapitulo2-maven/views/attractions/index.do" class="nav-link px-2 text-white">FAQs</a></li>
					<li><a href="/TurismoEnLaTierraMediaCapitulo2-maven/views/promotions/index.do" class="nav-link px-2 text-white">About</a></li>
				</ul>

				<ul class="navbar-nav">
					<li class="nav-item dropdown">
						<a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
							<c:out value="${user.name}"></c:out>
						</a>
						<ul class="dropdown-menu dropdown-menu-end" aria-labelledby="navbarDropdown">
							<li>
								<a class="dropdown-item disabled" style="color: black;">
									<i title="monedas" style="color: gold;" class="bi bi-coin"></i>
									<c:out value="${user.getBudget()}"></c:out>
								</a>
							</li>
							<li>
								<a class="dropdown-item disabled" style="color: black;">
									<i title="tiempo" style="color: blue;" class="bi bi-clock-fill"></i>
									<c:out value="${user.getTime()}h"></c:out>

								</a>
							</li>
							<li>
								<hr class="dropdown-divider">
							</li>
							<li>
								<a href="/TurismoEnLaTierraMediaCapitulo2-maven/logout" class="dropdown-item">Salir</a>
							</li>
						</ul>
					</li>
				</ul>
			</div>

>>>>>>> 085cfa391d28367b24ae69b4ee4bb56f1f63f303
		</div>
	</div>
</nav>
