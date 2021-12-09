<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<nav class="navbar navbar-expand-md navbar-dark bg-dark mb-4">
	
	<div class="container">
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
					
		</div>
	</div>
</nav>
