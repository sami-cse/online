<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<p class="lead">Shop Name</p>
<div class="list-group">
	<c:forEach items="${categories}" var="category">
		<a href="${contextPath}/categories/${category.categoryId}/products"
			class="list-group-item" id="a_${category.categoryName}">${category.categoryName}</a>
	</c:forEach>
</div>