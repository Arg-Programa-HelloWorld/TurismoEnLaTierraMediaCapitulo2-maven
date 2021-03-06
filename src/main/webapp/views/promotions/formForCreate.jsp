<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div class="modal-body">
	<div class="mb-3">
		<label for="name" class="col-form-label">Name:</label> <input
			type="text" class="form-control" id="name" name="name"
			required value="${promotion.name}">
		<div class="invalid-feedback">
			<c:out value='${promotion.errors.get("name")}'></c:out>
		</div>
	</div>
	<div class="mb-3">
		<label for="time"
			class='col-form-label'>Time:</label>
		<input class="form-control" type="number" id="time" name="time"
			required value="0" readonly></input>
		<div class="invalid-feedback">
			<!-- <c:out value='${promotion.errors.get("time")}'></c:out> -->
		</div>
	</div>
	<div class="mb-3">
		<label for="cost"
			class='col-form-label ${promotion.errors.get("cost") != null ? "is-invalid" : "" }'>Cost:</label>
		<input class="form-control" type="number" id="cost" name="cost"
			required value="0" readonly></input>
		<div class="invalid-feedback">
			<!-- <c:out value='${promotion.errors.get("cost")}'></c:out> -->
		</div>
	</div>
	<div class="mb-3">
		<label for="discount"
			class='col-form-label'>Discount:</label>
		<p>Forma de aplicar el valor a Discount, si elige el tipo de promocion:</p>
		<ul>
			<li>PERCENTAGE: El Discount aplica como 'N%' de descuento a la monto total de la promocion.-</li>
			<li>ASOLUTE: El Discount restara ese 'N' descuento al monto total.-</li>
			<li>A_AND_B: El Discount debe de quedar en '0' ya que no aplica, para esta Promocion, la segunda atraccion sera 'gratuita'.-</li>
		</ul>
		<input class="form-control" type="number" id="discount" name="discount"
			required value="0"></input>
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
	
	<!--  <div class="mb-3">
		<label for="promotionTypeID"
			class='col-form-label'>Promociones:</label>
			
		<select class="form-select" aria-label="Default select example" id="promotions" name="promotions"
			required value="${promotions}">
  			<c:forEach items="${promotions}" var="promotionTemp">
						
				<option value="${promotionTemp.id}" selected><c:out value="${promotionTemp.name }"></c:out></option>
						
						
		</c:forEach>
		</select>	
	</div> -->
	
	<div class="mb-3">
		<label for="attraction1"
			class='col-form-label'>Atracci?n N?1:</label>
			
		<select class="form-select" aria-label="Default select example" id="idAttraction1" name="idAttraction1"
			required value="${attractions}">
  			<c:forEach items="${attractions}" var="attraction">
				<option value="${attraction.id}" selected><c:out value="${attraction.name }"></c:out></option>
			</c:forEach>
		</select>	
	</div>
	
	<div class="mb-3">
		<label for="attraction2"
			class='col-form-label'>Atracci?n N?2:</label>
			
		<select class="form-select" aria-label="Default select example" id="idAttraction2" name="idAttraction2"
			required value="${attractions}">
  			<c:forEach items="${attractions}" var="attraction">
				<option value="${attraction.id}" selected><c:out value="${attraction.name }"></c:out></option>
			</c:forEach>
		</select>	
	</div>
		
</div>
<div>
	<button type="submit" class="btn btn-primary">Guardar</button>
	<a onclick="window.history.back();" class="btn btn-secondary"
		role="button">Cancelar</a>
</div>
