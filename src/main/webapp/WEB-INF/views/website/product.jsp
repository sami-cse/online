<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<spring:url var="css" value="/resources/css" />
<spring:url var="js" value="/resources/js" />
<spring:url var="images" value="/resources/images" />
<c:set var="contextPath" value="${pageContext.request.contextPath}" />

<div class="container">
	<div class="row">
		<div class="col-xs-12">
			<ol class="breadcrumb">
				<li><a href="${contextPath}/home">Home</a></li>
				<li><a href="${contextPath}/products">Products</a></li>
				<li class="active">${product.productName}</li>
			</ol>
		</div>
	</div>


	<div class="row">
		<!-- Display the product image -->
		<div class="col-xs-12 col-sm-4">
			<div class="thumbnail">
				<img src="${images}/${product.imageUrl}" class="img img-responsive" />
			</div>
		</div>

		<!-- Display the product description -->
		<div class="col-xs-12 col-sm-8">
			<h3>${product.productName}</h3>
			<hr />

			<p>${product.description}</p>
			<hr />

			<h4>
				Price: <strong> &#2547; ${product.productPrize} /-</strong>
			</h4>
			<hr />

			<c:choose>
				<c:when test="${product.quantity < 1}">
					<h6>
						Qty. Available: <span style="color: red">Out of Stock!</span>
					</h6>
				</c:when>
				<c:otherwise>
					<h6>Qty. Available: ${product.quantity}</h6>
				</c:otherwise>
			</c:choose>

			<c:choose>
				<c:when test="${product.quantity < 1}">
					<a href="javascript:void(0)" class="btn btn-success disabled">
							<span class="glyphicon glyphicon-shopping-cart"></span> Add to
							Cart
					</a>
				</c:when>
				<c:otherwise>
					<a href="${contextPath}/cart/${product.productId}/product"
						class="btn btn-success"> <span
						class="glyphicon glyphicon-shopping-cart"></span> Add to Cart
					</a>
				</c:otherwise>
			</c:choose>


			<a href="${contextPath}/products" class="btn btn-warning">
				Continue Shopping</a>
		</div>
	</div>
</div>


