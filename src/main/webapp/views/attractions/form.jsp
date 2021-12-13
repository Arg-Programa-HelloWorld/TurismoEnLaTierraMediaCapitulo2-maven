<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div class="modal-body">
	<div class="mb-3">
		<label for="name" class="col-form-label">Name:</label> <input
			type="text" class="form-control" id="name" name="name"
			required value="${attraction.name}">
	</div>
	<div class="mb-3">
		<label for="cost"
			class='col-form-label ${attraction.errors.get("cost") != null ? "is-invalid" : "" }'>Cost:</label>
		<input class="form-control" type="number" id="cost" name="cost"
			required value="${attraction.cost}"></input>
		<div class="invalid-feedback">
			<c:out value='${attraction.errors.get("cost")}'></c:out>
		</div>
	</div>
	<div class="mb-3">
		<label for="time"
			class='col-form-label ${attraction.errors.get("time") != null ? "is-invalid" : "" }'>Duration:</label>
		<input class="form-control" type="number" id="time" name="time"
			required value="${attraction.time}"></input>
		<div class="invalid-feedback">
			<c:out value='${attraction.errors.get("time")}'></c:out>
		</div>
	</div>
	<div class="mb-3">
		<label for="quota"
			class='col-form-label ${attraction.errors.get("quota") != null ? "is-invalid" : "" }'>Capacidad:</label>
		<input class="form-control" type="number" id="quota" name="quota"
			required value="${attraction.quota}"></input>
		<div class="invalid-feedback">
			<c:out value='${attraction.errors.get("quota")}'></c:out>
		</div>
	</div>
	<div class="mb-3">
		<label for="attraction-type"
			class='col-form-label'>Tipo de Atraccion:</label>
		<select class="form-select" aria-label="Default select example" id="attraction-type" name="attraction-type"
			required value="${attraction.attractionTypeID}">
  			<option selected>Elija el tipo de Atraccion</option>
  			<option value="1">ADVENTURE</option>
			<option value="2">SCENERY</option>
  			<option value="3">TASTING</option>
		</select>
	</div>
</div>
<div>
	<button type="submit" class="btn btn-primary">Guardar</button>
	<a onclick="window.history.back();" class="btn btn-secondary"
		role="button">Cancelar</a>
</div>
