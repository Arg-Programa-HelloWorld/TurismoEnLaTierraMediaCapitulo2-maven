<h1>TurismoEnLaTierraMediaCapitulo2-maven</h1>


Esta aplicación web tiene como objetivo demostrar el uso de las herramientas vistas a lo largo del curso ArgentinaPrograma 2021, coordinadas e interactuando para brindar parte de la funcionalidad solicitada.

<h2>Cómo hacerlo funcionar</h2>

1. Editar el archivo /turismo/src/main/resources/env.properties y colocar la ruta correcta del archivo de la base de datos correspondiente a la ruta especifica en su computador.
2. Verificar la versión de JRE con la que se está compilando y construyendo.

<h3>De que se trata?</h3>

1. La aplicacion es un carrito de compras dirigidas al Turismo "paseos y servicios" existentes en La Tierra Media.-

<h3>Quienes pueden utilizarla</h3>

1. Existen dos tipos de usuarios: Con y sin permisos de Administrador

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

Por ultimo y no menos importante, nuestro agradecimiento para con <b>ArgentinaPrograma 2021</b> como así tambien, a cada uno de los <b>profesores</b>. Ya que ellos hicieron posible de forma humana y profecional, la correcta trasmicion de conocimientos, para que así este grupo, como los demas, pueda ponerlos en practica y poder cumplimentar con este trabajo practico.-

Nota: Un grande el <b>Profesor Enmascarado</b>

<div class="col-md-6 mt-md-0 mt-3">
<h5 class="text-uppercase font-weight-bold">Nuestros Profesores</h5>

<ul class="profes">
	<li>Blautzik, Leonardo José</li>
	<li>Cantore, Roberto</li>
	<li>Gasior, Federico</li>
	<li>Videla, Lucas</li>
</ul>

<h5 class="text-uppercase font-weight-bold">Nosotros</h5>
<ul class="alumnos">
	<li>Toledo, Florencia</li>
	<li>Orellana, Felix Andres</li>
	<li>Paczkowski, Eduardo Nahuel</li>
	<li>Graff, Héctor Pablo</li>
</ul>
