<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div class="modal-body">
	<div class="mb-3">
		<label for="name" class="col-form-label">Name:</label> <input
			type="text" class="form-control" id="name" name="name"
			required value="${promotion.name}">
		<div class="invalid-feedback">
			<c:out value='${attraction.errors.get("name")}'></c:out>
		</div>
	</div>
	<div class="mb-3">
		<label for="time"
			class='col-form-label'>Time:</label>
		<input class="form-control" type="number" id="time" name="time"
			required value="${promotion.time}"></input>
		<div class="invalid-feedback">
			<!-- <c:out value='${promotion.errors.get("time")}'></c:out> -->
		</div>
	</div>
	<div class="mb-3">
		<label for="cost"
			class='col-form-label ${promotion.errors.get("cost") != null ? "is-invalid" : "" }'>Cost:</label>
		<input class="form-control" type="number" id="cost" name="cost"
			required value="${promotion.cost}"></input>
		<div class="invalid-feedback">
			<!-- <c:out value='${promotion.errors.get("cost")}'></c:out> -->
		</div>
	</div>
	<div class="mb-3">
		<label for="discount"
			class='col-form-label'>Discount:</label>
		<input class="form-control" type="number" id="discount" name="discount"
			required value="${promotion.discount}"></input>
		<div class="invalid-feedback">
			<!-- <c:out value='${promotion.errors.get("discount")}'></c:out> -->
		</div>
	</div>
	<div class="mb-3">
		<label for="promotionTypeID"
			class='col-form-label'>Tipo de Promocion:</label>
		<select class="form-select" aria-label="Default select example" id="promotionTypeID" name="promotionTypeID"
			required value="${promotion.promotionTypeID}">
  			<!-- <option selected>Elija el tipo de Promocion</option> -->
  			<option value="1" selected>PERCENTAGE</option>
			<option value="2">ABSOLUTE</option>
  			<option value="3">A_AND_B</option>
		</select>
		<div class="invalid-feedback">
			<c:out value='${promotion.errors.get("promotionTypeID")}'></c:out>
		</div>
	</div>
</div>
<div>
	<button type="submit" class="btn btn-primary">Guardar</button>
	<a onclick="window.history.back();" class="btn btn-secondary"
		role="button">Cancelar</a>
</div>
