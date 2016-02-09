<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>

<sql:setDataSource var="dataSource" driver="com.mysql.jdbc.Driver"
	url="jdbc:mysql://localhost:3306/mydb" scope="session" user="root"
	password="" />


<sql:query var="cat" dataSource="${dataSource}">
         select category_id, category_name, category_desc from category WHERE category_id=<%=request.getParameter("catID")%>


</sql:query>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<title>I'MPOSSIBLE - Edit Category</title>

<!-- Bootstrap -->
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/bootstrap.css" rel="stylesheet" type="text/css" />
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">
<link href="css/home.css" rel="stylesheet">
<jsp:include page="main/adminNavigations.jsp"></jsp:include>
</head>
<body>
<%
		//allow access only if session exists
		String user = null;
		if (session.getAttribute("name") == null || session.getAttribute("role") != ("admin")) {
			response.sendRedirect("login.jsp");
		} else
			user = (String) session.getAttribute("name");
		String userName = null;
		String sessionID = null;
		String userrole = null;
		Cookie[] cookies = request.getCookies();
		if (cookies != null) {
			for (Cookie cookie : cookies) {
				if (cookie.getName().equals("name"))
					userName = cookie.getValue();
				if (cookie.getName().equals("JSESSIONID"))
					sessionID = cookie.getValue();
				if (cookie.getName().equals("role"))
					userrole = cookie.getValue();
			}
		} else {
			sessionID = session.getId();
		}

		/* no session validation logic in the above JSP. It contains link to another JSP page,  */
	%>


	<div class="container">


		<div id="content">
			<div class="page-header">
				<div class="container-fluid">
					<header>
						<hgroup>
							<h1>Category</h1>
						</hgroup>
					</header>

					<nav>
						<ul class="breadcrumb">
							<li><a href="adminIndex.html">Home</a></li>
							<li><a href="manageCategory.html">Categories</a></li>
						</ul>

					</nav>

				</div>
			</div>
			<div class="container-fluid">
				<article>
					<div class="panel panel-default">
						<div class="panel-heading">
							<h3 class="panel-title">

								<header>
									<i class="fa fa-pencil"></i> Edit Category
								</header>
							</h3>
						</div>
						<div class="panel-body">

							<c:forEach var="items" items="${cat.rows}">

								<form action="editCategory" method="post"
									class="form-horizontal" data-toggle="validator" role="form">

									<input type="hidden" name="catid"
										value="	<c:out value="${items.category_id}"/>" />

									<div class="form-group required">
										<label class="col-sm-2 control-label" for="editname">Category
											Name</label>
										<div class="col-sm-10">
											<input type="text" name="editname" id="inputname"
												class="form-control"  value="${items.category_name}" required />

										</div>
									</div>
									<div class="form-group">
										<label class="col-sm-2 control-label" for="editcategory">Description</label>
										<div class="col-sm-10">
											<input type="text" name="editcategory" id="inputdesc"
												class="form-control" value="${items.category_desc}" required />



										</div>
									</div>
									<script type="text/javascript">
									window.params = function() {
										var params = {};
										var param_array = window.location.href
												.split('?')[1].split('&');
										for ( var i in param_array) {
											x = param_array[i].split('=');
											params[x[0]] = x[1];
										}
										return params;
									}();

									document
											.write('<input type="hidden" value="'+window.params.catid +'" name="catid">');
								</script>



									<div class="form-actions">
										<button type="submit" class="btn btn-primary">Save
											changes</button>
										<a href="manageCategory.jsp"><button type="button"
												class="btn btn-danger">Cancel</button></a>

									</div>


								</form>

							</c:forEach>

						</div>
					</div>
				</article>

			</div>
		</div>
	</div>
	<!-- Start of <Fixed footer> -->
	<footer id="footerMenu"></footer>
	<!-- End of <Fixed footer> -->

	<script src="js/navlinks-admin.js"></script>
	<script src="js/footer.js"></script>

	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
	<script src="js/bootstrap.min.js"></script>


	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
	<!-- Include all compiled plugins (below), or include individual files as needed -->
	<script src="js/bootstrap.min.js"></script>

	<script src="js/jquery-1.10.2.js"></script>
	<script src="js/bootstrap.js"></script>

</body>
</html>