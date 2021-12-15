<link rel="shortcut icon" href="/turismo/assets/favicon.ico">

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.7.1/font/bootstrap-icons.css">

<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
	crossorigin="anonymous" defer></script>

<h1>TurismoEnLaTierraMediaCapitulo2-maven</h1>


Esta aplicación web tiene como objetivo demostrar el uso de las herramientas vistas a lo largo del curso ArgentinaPrograma 2021, coordinadas e interactuando para brindar parte de la funcionalidad solicitada.

<h2>Cómo hacerlo funcionar</h2>

1. Editar el archivo /turismo/src/main/resources/env.properties y colocar la ruta correcta del archivo de la base de datos correspondiente a la ruta especifica en su computador.
2. Verificar la versión de JRE con la que se está compilando y construyendo.

<h3>De que se trata?</h3>

1. La aplicacion es un carrito de compras dirigidas al Turismo "paseos y servicios" existentes en La Tierra Media.-

<h3>Quienes pueden utilizarla</h3>

1. Existen dos tipos de usuarios: Con y sin de Administrador

<h3><b>User Normal</b> puede:</h3>

1. Ver: Atraciones - Promociones.-
2. Comprar: Atraciones y Promociones.-
4. Ver: en su Itinerario las compras realizadas.-
5. Imprimir su Itinerario.-
6. En su panel de administracion: ver su dinero y tiempo disponible, como asi tambien el <b>Clima</b>.-
7. Nota: <b>Clima:</b> Posee una API integrada para obtener información sobre el clima, y el mismo corresponde al lugar desde donde se ejecuta la aplicacion.
8. Salir: cerrar su sesion.-

<h3><b>User Admin</b> puede:</h3>

1. Realizar todo lo que puede hacer un usuario normal.-
2. Crear, Modificar y Eliminar de forma logica: Usuarios, Atracciones y Promociones.-
3. En los usuarios, tambien puede consultar el itinerario de cada usuario desde el nombre del mismo como asi tambien darle de alta o baja.-

<h2>Cómo hacerlo funcionar parte 2</h2>

1. Luego de ejecutar el servidor, la pagina corre en la siguiente direccion:
2. http://localhost:8080/TurismoEnLaTierraMediaCapitulo2-maven/
3. Donde encontrara un login:
4. Para el cual necesitara los siguientes usuarios para realizar la prueba.-
  
13. 
<table width="100%" border="1" cellpadding="0" cellspacing="0" bordercolor="#000000">

  <tr>
    <th colspan="3" valign="middle" align="center">Usuarios de alta</th>
  </tr>
  
  <tr>
    <th>User</th>
    <th>Password</th>
    <th>Es Administrador?</th>
  </tr>

  <tr>
    <td>admin</td>
    <td>admin</td>
    <td>Si!!</td>
  </tr>
  
  <tr>
    <td>Roberto</td>
    <td>Roberto</td>
    <td>No</td>
  </tr>
  
  <tr>
    <td>Florencia</td>
    <td>Florencia</td>
    <td>No</td>
  </tr>
  
  
  <tr>
    <td>Andres</td>
    <td>Andres</td>
    <td>No</td>
  </tr>
  
  <tr>
    <td>Nahuel</td>
    <td>Nahuel</td>
    <td>No</td>
  </tr>
  
  <tr>
    <td>Pablo</td>
    <td>Pablo</td>
    <td>No</td>
  </tr>
    
</table>

<h2>Agradecimientos</h2>

Por ultimo y no menos importante, nuestro agradecimiento para con el programa <b>ARGENTINA-PROGRAMA 2021</b> como a cada uno de los <b>profesores</b> que hicieron posible de forma tanto humana como profecional, para que nos hagamos con la adquisicion del conocimiento para asi ponerlos en practica y poder cumplimentar con este trabajo practico.-

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
						<li>Toledo, Florencia <a
							href="https://www.linkedin.com/in/florencia-toledo-77386b211/"><i
								title="Forencia" style="color: blue;" class="bi bi-linkedin"></i></a></li>
						<li>Orellana, Felix Andres <a
							href="https://www.linkedin.com/in/f%C3%A9lix-andr%C3%A9s-orellana-69a28955/"><i
								title="Andres" style="color: blue;" class="bi bi-linkedin"></i></a></li>
						<li>Paczkowski, Eduardo Nahuel <a
							href="https://www.linkedin.com/in/eduardo-nahuel-paczkowski/"><i
								title="Nahuel" style="color: blue;" class="bi bi-linkedin"></i></a></li>
						<li>Graff, Héctor Pablo <a
							href="https://www.linkedin.com/in/hector-pablo-graff/"><i
								title="Pablo" style="color: blue;" class="bi bi-linkedin"></i></a></li>
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
