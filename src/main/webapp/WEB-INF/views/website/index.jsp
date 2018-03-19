<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<spring:url var="css" value="/resources/css" />
<spring:url var="js" value="/resources/js" />
<spring:url var="images" value="/resources/images" />
<c:set var="contextRoot" value="${pageContext.request.contextPath}" />

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<title>${title}</title>
<script type="text/javascript">
	window.menu = '${title}';
	window.contextRoot = '${contextRoot}';
</script>

<link href="${css}/bootstrap.min.css" rel="stylesheet">
<link href="${css}/readable.css" rel="stylesheet">

<!-- DataTable Starts -->
<link href="${css}/dataTables.bootstrap.css" rel="stylesheet">
<!-- DataTable Ends -->

<link href="${css}/shop-homepage.css" rel="stylesheet">
<body>

	<div class="wrapper">

		<jsp:include page="/WEB-INF/views/website/includes/navigation.jsp" />

		<div class="content">
			<jsp:include page="/WEB-INF/views/website/${pages}.jsp" />
		</div>
		<jsp:include page="/WEB-INF/views/website/includes/footer.jsp" />
		<script src="${js}/jquery.js"></script>
		<script src="${js}/bootstrap.min.js"></script>

		<!-- DataTable Starts -->
		<script src="${js}/jquery.dataTables.js"></script>
		<script src="${js}/dataTables.bootstrap.js"></script>
		<!-- DataTable Ends -->

		<script src="${js}/myapp.js"></script>
	</div>
</body>

</html>
