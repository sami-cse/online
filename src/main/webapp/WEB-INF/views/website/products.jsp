<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
						<ol class="breadcrumb">
							<li><a href="${contextPath}/home">Home</a></li>
							<li class="active">All Products</li>
						</ol>
					</c:if>

					<c:if test="${categoryUrl == true}">
						<ol class="breadcrumb">
							<li><a href="${contextPath}/home">Home</a></li>
							<li class="active">Category</li>
							<li class="active">${category.categoryName}</li>
						</ol>
					</c:if>
				</div>
			</div>
		</div>
	</div>
</div>


