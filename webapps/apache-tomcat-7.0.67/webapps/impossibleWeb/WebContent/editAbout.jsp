<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<jsp:include page="main/adminNavigations.jsp"></jsp:include>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<sql:setDataSource var="dataSource" driver="com.mysql.jdbc.Driver"
	url="jdbc:mysql://localhost:3306/mydb" scope="session" user="root"
	password="" />


<sql:query var="about" dataSource="${dataSource}">
SELECT  `control_id` ,  `about_description` 
FROM  `control` 
WHERE  `control_id` =2
				
				       
</sql:query>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">

<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<title>I'MPOSSIBLE - Manage About</title>

<!-- Bootstrap -->
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/bootstrap.css" rel="stylesheet" type="text/css" />
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">

<link href="css/home.css" rel="stylesheet">
<script src="ckeditor/ckeditor.js"></script>

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



	<!-- Start of Body  -->

	<div class="container">
		<div id="bodycontent">
			<div class="page-header">
				<div class="container-fluid">

					<h1>Manage About</h1>

					<ul class="breadcrumb">
						<li><a href="adminIndex.jsp">Home Page</a></li>
						<li><a href="manageAbout.jsp">Manage About</a></li>
					</ul>
				</div>
			</div>
			<div class="container-fluid">
				<div class="panel panel-default">
					<div class="panel-heading">
						<h3 class="panel-title">
							<i class="fa fa-pencil"></i> Edit About
						</h3>
					</div>
					<div class="panel-body">


						<c:forEach var="a" items="${about.rows}">
							<form action="editAbout" class="form-horizontal" method="post"
								data-toggle="validator" role="form">
								<div class="form-group">

									<input type="hidden" name="cu"
										value="	<c:out value="${a.control_id}"/>" />

									<div id='content'></div>

									<label class="col-sm-2 control-label" for="input-description1">Description</label>
									<div class="col-sm-10">
										<textarea name="about_message" class="form-control" required>${a.about_description}</textarea>


										<script>
											// Replace the <textarea id="editor1"> with a CKEditor
											// instance, using default configuration.
											CKEDITOR.replace('about_message');
										</script>
									</div>
								</div>
								<div class="form-actions">

									<button type="submit" class="btn btn-primary">Save
										changes</button>
									<a href="adminIndex.jsp"><button type="button"
											class="btn btn-danger">Cancel</button></a>

								</div>
							</form>
						</c:forEach>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- End of Body Content -->


	<!-- Start of <Fixed footer> -->
	<footer id="footerMenu"></footer>
	<!-- End of <Fixed footer> -->


	<script src="js/footer.js"></script>

	<script src="js/bootstrap.min.js"></script>
	<script type="text/javascript" src='js/jquery.min.js'></script>



	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->



	<script src="js/jquery-1.10.2.js"></script>
	<script src="js/bootstrap.js"></script>
	<script
		src="http://ajax.googleapis.com/ajax/libs/jquery/2.0.0/jquery.min.js"></script>
</body>
</html>