<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />

<div id="sidebar-menu" class="main_menu_side hidden-print main_menu">
	<div class="menu_section">
		<h3>General</h3>
		<ul class="nav side-menu">
			<li><a><i class="fa fa-edit"></i> Forms <span
					class="fa fa-chevron-down"></span></a>
				<ul class="nav child_menu" style="display: none">
					<li><a href="${contextPath}/admin/addProduct">Add Product</a></li>
				</ul></li>
		</ul>
	</div>
</div>