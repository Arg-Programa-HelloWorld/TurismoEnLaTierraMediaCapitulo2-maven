<meta charset="UTF-8">

<nav class="navbar navbar-expand-md navbar-dark bg-dark mb-4">
	<div class="container">
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
					<li><a href="index.jsp" class="nav-link px-2 text-white">Home</a></li>
					<li><a href="attractions.jsp" class="nav-link px-2 text-white">Attractions</a></li>
					<li><a href="promotions.jsp" class="nav-link px-2 text-white">Promotions</a></li>
					<li><a href="itineraries.jsp" class="nav-link px-2 text-white">Itineraries</a></li>
					<li><a href="#" class="nav-link px-2 text-white">FAQs</a></li>
					<li><a href="#" class="nav-link px-2 text-white">About</a></li>
				</ul>

				<ul class="navbar-nav">
					<li class="nav-item dropdown"><a
						class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
						role="button" data-bs-toggle="dropdown" aria-expanded="false">
							<c:out value="${user.username}"></c:out>
					</a>
						<ul class="dropdown-menu dropdown-menu-end"
							aria-labelledby="navbarDropdown">
							<li><a class="dropdown-item disabled" style="color: black;">
									<i title="monedas" style="color: gold;" class="bi bi-coin"></i>
									<c:out value="${user.coins}"></c:out>
							</a></li>
							<li><a class="dropdown-item disabled" style="color: black;">
									<i title="tiempo" style="color: blue;" class="bi bi-clock-fill"></i>
									<c:out value="${user.time}h"></c:out>
							</a></li>
							<li><hr class="dropdown-divider"></li>
							<li><a href="/turismo/logout" class="dropdown-item">Salir</a></li>
						</ul></li>
				</ul>
			</div>

		</div>
	</div>
</nav>
