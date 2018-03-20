<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<spring:url var="css" value="/resources/css" />
<spring:url var="js" value="/resources/js" />
<spring:url var="images" value="/resources/images" />
<c:set var="contextPath" value="${pageContext.request.contextPath}" />

<div class="container">
	<div class="row">
		<div class="col-md-3">
			<jsp:include page="/WEB-INF/views/website/includes/sidebar.jsp" />
		</div>
		<div class="col-md-9">
			<div class="row">
				<div class="col-lg-12">
					<c:if test="${productUrl == true}">
						<script>
							window.categoryId = '';
						</script>
						<ol class="breadcrumb">
							<li><a href="${contextPath}/home">Home</a></li>
							<li class="active">All Products</li>
						</ol>
					</c:if>

					<c:if test="${categoryUrl == true}">
						<script>
							window.categoryId = '${category.categoryId}';
						</script>
						<ol class="breadcrumb">
							<li><a href="${contextPath}/home">Home</a></li>
							<li class="active">Category</li>
							<li class="active">${category.categoryName}</li>
						</ol>
					</c:if>
				</div>
			</div>

			<div class="row">
				<div class="col-lg-12">
					<table class="table table-striped table-bordered"
						id="productListTable">
						<thead>
							<tr>
								<th></th>
								<th>Name</th>
								<th>Prize</th>
								<th>Quantity</th>
								<th>Brand</th>
								<th></th>
							</tr>
						</thead>
					</table>
				</div>
			</div>
		</div>
	</div>
</div>


