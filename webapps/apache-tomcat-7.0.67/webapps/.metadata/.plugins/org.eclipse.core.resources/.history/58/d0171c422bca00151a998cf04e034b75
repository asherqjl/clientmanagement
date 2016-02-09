<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<jsp:include page="main/adminNavigations.jsp"></jsp:include>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<sql:setDataSource var="dataSource" driver="com.mysql.jdbc.Driver"
	url="jdbc:mysql://localhost:3306/mydb" scope="session" user="root"
	password="" />


<sql:query var="cus" dataSource="${dataSource}">
         SELECT  `control_id` ,  `office_address` ,  `office_tel_number` ,  `country_code` ,  `office_email` ,  `office_directions` 
FROM  `control` 
WHERE  `control_id` =1
				
				       
</sql:query>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">

<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<title>I'MPOSSIBLE - Manage Contact Us</title>

<!-- Bootstrap -->
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/bootstrap.css" rel="stylesheet" type="text/css" />
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">

<link href="css/home.css" rel="stylesheet">

<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>

<script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
<script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>



<![endif]-->
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

		<div id="content">
			<div class="page-header">
				<div class="container-fluid">

					<h1>Manage Contact Us</h1>

					<ul class="breadcrumb">
						<li><a href="adminIndex.jsp">Home</a></li>
						<li><a href="manageIndex.jsp">Manage Index</a></li>
						<li><a href="manageAbout.jsp">Manage About</a></li>
						<li><a href="manageContactUs.jsp">Manage Contact Us</a></li>
					</ul>
				</div>
			</div>
			<div class="container-fluid">

				<div class="panel panel-default">

					<div class="panel-heading">
						<h3 class="panel-title">
							<i class="fa fa-pencil"></i> Edit Contact Us
						</h3>
					</div>
					<div class="panel-body">



						<c:forEach var="info" items="${cus.rows}">
							<form class="form-horizontal" action="editContactUs"
								method="post" data-toggle="validator" role="form">
								<input type="hidden" name="cu"
									value="	<c:out value="${info.control_id}"/>" />


								<div class="form-group required">
									<label class="col-sm-2 control-label" for="input-address">Address:</label>
									<div class="col-sm-10">
										<input type="text" name="address"
											value="${info.office_address}" id="cAddress"
											class="form-control" required />
									</div>
								</div>

								<div class="form-group required">
									<label class="col-sm-2 control-label" for="input-pn">Country
										Code:</label>
									<div class="col-sm-10">
										<input type="text" value="${info.country_code}"
											name="country_code" id="cCC" class="form-control" required />


									</div>
								</div>

								<div class="form-group required">
									<label class="col-sm-2 control-label" for="input-pn">Phone
										Number:</label>
									<div class="col-sm-10">
										<input type="text" name="pn" id="cPN"
											value="${info.office_tel_number}" class="form-control"
											required />


									</div>
								</div>
								<div class="form-group required">
									<label class="col-sm-2 control-label" for="input-email">Email:</label>
									<div class="col-sm-10">
										<input type="text" name="email" id="cEmail"
											value="${info.office_email}" class="form-control" required />


									</div>
								</div>


								<div class="form-group required">
									<label class="col-sm-2 control-label" for="input-email">Office
										Direction:</label>
									<div class="col-sm-10">
										<input type="text" name="direction" id="cDirection"
											class="form-control" value="${info.office_directions}"
											required />


									</div>
								</div>


								<div class="form-actions">
									<button type="submit" class="btn btn-primary"
										id="UpdateAddress">Save changes</button>
									<a href="manageContactUs.jsp"><button type="button"
											class="btn btn-danger">Cancel</button></a>

								</div>


							</form>
						</c:forEach>
					</div>

				</div>

			</div>
		</div>
	</div>









	<!-- End of Body  -->

	<!-- Start of <Fixed footer> -->
	<footer id="footerMenu"></footer>
	<!-- End of <Fixed footer> -->


	<script src="js/footer.js"></script>

	<script src="js/bootstrap.min.js"></script>
	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
	<!-- Include all compiled plugins (below), or include individual files as needed -->


	<script src="js/jquery-1.10.2.js"></script>
	<script src="js/bootstrap.js"></script>
	<script
		src="http://ajax.googleapis.com/ajax/libs/jquery/2.0.0/jquery.min.js"></script>
</body>
</html>
</html>