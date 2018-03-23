<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>



<spring:url var="images" value="/resources/admin/images" />
<c:set var="contextPath" value="${pageContext.request.contextPath}" />

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">

<title>Gentallela Alela! |</title>


<jsp:include page="/WEB-INF/views/admin/includes/styles.jsp" />
</head>
<body class="nav-md">
	<div class="container body">
		<div class="main_container">
			<div class="col-md-3 left_col">
				<div class="left_col scroll-view">
					<div class="navbar nav_title" style="border: 0;">
						<a href="index.html" class="site_title"><i class="fa fa-paw"></i>
							<span>Gentellela Alela!</span></a>
					</div>
					<div class="clearfix"></div>

					<div class="profile">
						<div class="profile_pic">
							<img src="${images}/img.jpg" alt="..."
								class="img-circle profile_img">
						</div>
						<div class="profile_info">
							<span>Welcome,</span>
							<h2>John Doe</h2>
						</div>
					</div>

					<br />
					<!-- sidebar menu -->
					<jsp:include page="/WEB-INF/views/admin/includes/sidebar.jsp" />
					<!-- /sidebar menu -->
				</div>
			</div>

			<!-- top navigation -->
			<jsp:include page="/WEB-INF/views/admin/includes/top-navigation.jsp" />
			<!-- /top navigation -->

			<!-- page content Starts-->
			<div class="right_col" role="main">
				
				<jsp:include page="/WEB-INF/views/admin/${pages}.jsp" />
			</div>
			<!-- page content Ends -->

		</div>
	</div>

	<div id="custom_notifications" class="custom-notifications dsp_none">
		<ul class="list-unstyled notifications clearfix"
			data-tabbed_notifications="notif-group">
		</ul>
		<div class="clearfix"></div>
		<div id="notif-group" class="tabbed_notifications"></div>
	</div>
	<jsp:include page="/WEB-INF/views/admin/includes/scripts.jsp" />
	<script>
		NProgress.done();
	</script>
</body>
</html>




