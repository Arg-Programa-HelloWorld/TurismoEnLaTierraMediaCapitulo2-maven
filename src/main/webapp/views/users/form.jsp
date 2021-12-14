<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div class="modal-body">
	<div class="mb-3">
		<label for="name" class="col-form-label">Nombre:</label> <input
			type="text" class="form-control" id="name" name="name" required value="${userTemp.name}">
	</div>
	<div class="mb-3">
		<label for="password" class="col-form-label">Password:</label> <input
			type="password" class="form-control" id="password" name="password" required value="${userTemp.password}">
	</div>
	<div class="mb-3">
		<label for="budget"
			class='col-form-label ${userTemp.errors.get("budget") != null ? "is-invalid" : "" }'>Budget:</label>
		<input class="form-control" type="number" id="budget" name="budget" required value="${userTemp.budget}"></input>
		<div class="invalid-feedback">
			<c:out value='${userTemp.errors.get("budget")}'></c:out>
		</div>
	</div>
	<div class="mb-3">
		<label for="time"
			class='col-form-label ${userTemp.errors.get("time") != null ? "is-invalid" : "" }'>Tiempo:</label>
		<input class="form-control" type="number" id="time" name="time" required value="${userTemp.time}"></input>
		<div class="invalid-feedback">
			<c:out value='${userTemp.errors.get("time")}'></c:out>
		</div>
	</div>
	<div class="mb-3">
		<label for="preferencesID"
			class='col-form-label'>Preferencias:</label>
		<select class="form-select" aria-label="Default select example" id="preferencesID" name="preferencesID"">
  			<option value="1" selected>ADVENTURE</option>
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