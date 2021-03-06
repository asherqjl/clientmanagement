<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<jsp:include page="main/adminNavigations.jsp"></jsp:include>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<title>I'MPOSSIBLE - Add Status</title>

<!-- Bootstrap -->
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/bootstrap.css" rel="stylesheet" type="text/css" />
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">

<link href="css/home.css" rel="stylesheet">

</head>
<body>
	
<%
	//allow access only if session exists
	String user = null;

	if (session.getAttribute("name") == null || session.getAttribute("role") == null
			|| session.getAttribute("role") != "admin") {
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

					<h1>Status</h1>

					<ul class="breadcrumb">
						<li><a href="adminIndex.jsp">Home</a></li>
						<li><a href="manageItemStatus.jsp">Status</a></li>
						<li><a href="addItemStatus.jsp">Add Item Status</a></li>
					</ul>
				</div>
			</div>
			<div class="container-fluid">
				<div class="panel panel-default">
					<div class="panel-heading">
						<h3 class="panel-title">
							<i class="fa fa-pencil"></i> Add Item Status
						</h3>
					</div>
					<div class="panel-body">
						<form method="post" class="form-horizontal" name="myForm"
							action="addStatusServlet">



							<div class="form-group required">
								<label class="col-sm-2 control-label" for="input-name1">Item
									Status Name</label>
								<div class="col-sm-10">
									<input type="text" name="status_name" value=""
										placeholder="Status Name" id="input-name1"
										class="form-control" required />
								</div>
							</div>
							<div class="form-group">
								<label class="col-sm-2 control-label" for="input-description1">Description</label>
								<div class="col-sm-10">
									<textarea name="status_description" placeholder="Description"
										id="input-description1" class="form-control" required></textarea>

								</div>
							</div>


							<div class="form-actions">

								<button type="submit" class="btn btn-primary">Save
									changes</button>
								<a href="manageItemStatus.jsp"><button type="button"
										class="btn btn-danger">Cancel</button></a>

							</div>

						</form>

					</div>
				</div>

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