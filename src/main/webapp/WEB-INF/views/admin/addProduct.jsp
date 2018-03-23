<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />

<form:form method="post" role="form" modelAttribute="product"
	action="${contextPath}/admin/addProduct" novalidate="novalidate"
	class="form-horizontal form-label-left">
	<span class="section">Personal Info</span>

	<div class="item form-group">
		<label class="control-label col-md-3 col-sm-3 col-xs-12">Product
			Name <span class="required">*</span>
		</label>
		<div class="col-md-6 col-sm-6 col-xs-12">
			<form:input class="form-control col-md-7 col-xs-12"
				path="productName" placeholder="Product path" required="required"
				type="text" />
		</div>
	</div>
	<div class="item form-group">
		<label class="control-label col-md-3 col-sm-3 col-xs-12">Product
			Brand <span class="required">*</span>
		</label>
		<div class="col-md-6 col-sm-6 col-xs-12">
			<form:select class="form-control" path="brandId">
				<form:options items="${brandList}" itemLabel="brandName"
					itemValue="brandId"></form:options>
			</form:select>
		</div>
	</div>
	<div class="item form-group">
		<label class="control-label col-md-3 col-sm-3 col-xs-12" for="path">Product
			Category <span class="required">*</span>
		</label>
		<div class="col-md-6 col-sm-6 col-xs-12">
			<form:select class="form-control" path="categoryId">
				<form:options items="${categoryList}" itemLabel="categoryName"
					itemValue="categoryId"></form:options>
			</form:select>
		</div>
	</div>
	<div class="item form-group">
		<label class="control-label col-md-3 col-sm-3 col-xs-12">Product
			Code <span class="required">*</span>
		</label>
		<div class="col-md-6 col-sm-6 col-xs-12">
			<form:input type="tel" path="productCode" required="required"
				placeholder="Product Code" class="form-control col-md-7 col-xs-12" />
		</div>
	</div>
	<div class="item form-group">
		<label class="control-label col-md-3 col-sm-3 col-xs-12">Product
			Quantity <span class="required">*</span>
		</label>
		<div class="col-md-6 col-sm-6 col-xs-12">
			<form:input type="number" path="quantity" required="required"
				class="form-control col-md-7 col-xs-12" />
		</div>
	</div>
	<div class="item form-group">
		<label class="control-label col-md-3 col-sm-3 col-xs-12">Product
			Prize <span class="required">*</span>
		</label>
		<div class="col-md-6 col-sm-6 col-xs-12">
			<form:input type="number" path="productPrize" required="required"
				class="form-control col-md-7 col-xs-12" />
		</div>
	</div>
	<div class="item form-group">
		<label class="control-label col-md-3 col-sm-3 col-xs-12">Product
			Image <span class="required">*</span>
		</label>
		<div class="col-md-6 col-sm-6 col-xs-12">
			<form:input class="form-control col-md-7 col-xs-12" path="imageUrl"
				type="file" />
		</div>
	</div>
	<div class="item form-group">
		<label class="control-label col-md-3 col-sm-3 col-xs-12">Product
			Description <span class="required">*</span>
		</label>
		<div class="col-md-6 col-sm-6 col-xs-12">
			<form:textarea required="required" path="description"
				class="form-control col-md-7 col-xs-12" />
		</div>
	</div>
	<div class="ln_solid"></div>
	<div class="form-group">
		<div class="col-sm-offset-4 col-sm-5">
			<button type="submit" class="btn btn-primary">&nbsp; Save
				&nbsp;</button>
			&nbsp; &nbsp; <a href="#ContractAward/index" role="button"
				class="btn btn-warning">Cancel</a>
		</div>
	</div>
</form:form>

