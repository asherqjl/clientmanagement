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
<title>I'MPOSSIBLE - Administrator Add New Coach User</title>

<!-- Bootstrap -->
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/bootstrap.css" rel="stylesheet" type="text/css" />
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">

<link href="css/home.css" rel="stylesheet">
<script src="ckeditor/ckeditor.js"></script>

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


</head>
<body>
	<div class="container">


		<div id="content">
			<div class="page-header">
				<div class="container-fluid">

					<h1>Administrator</h1>

					<ul class="breadcrumb">
						<li><a href="adminIndex.jsp">Home</a></li>
						<li><a href="manageCoachUser.jsp">Manage Coach User</a></li>
					</ul>
				</div>
			</div>
			<div class="container-fluid">
				<div class="panel panel-default">
					<div class="panel-heading">
						<h3 class="panel-title">
							<i class="fa fa-pencil"></i> Add New Coach
						</h3>
					</div>
					<div class="panel-body">
						<form method="post" action="addCoachUser" class="form-horizontal"
							data-toggle="validator" role="form">



							<div class="form-group">
								<label class="control-label col-sm-2" for="category">Salutation:</label>
								<div class="col-sm-9">

									<select class="form-control" id="salutation_input"
										name="salutation">
										<option value="Mr">Mr</option>
										<option value="Mrs">Mrs</option>
										<option value="Ms">Ms</option>
										<option value="Mdm">Mdm</option>

									</select>
								</div>

							</div>
							<div class="form-group">
								<label class="control-label col-sm-2" for="sName">Surname</label>
								<div class="col-sm-9">
									<input class="form-control" type="text" name="sName"
										placeholder="Name" required>
								</div>
							</div>

							<div class="form-group">
								<label class="control-label col-sm-2" for="gName">Given
									Name:</label>
								<div class="col-sm-9">
									<input class="form-control" type="text" name="gName"
										placeholder="Name" required>
								</div>
							</div>


							<div class="form-group">
								<label class="control-label col-sm-2" for="cEmail">Coach
									Email:</label>
								<div class="col-sm-9">
									<input class="form-control" type="email" name="cEmail"
										placeholder="Email" required>
								</div>
							</div>
							<div class="form-group">
								<label class="control-label col-sm-2" for="cPassword">Password:</label>
								<div class="col-sm-9">
									<input class="form-control" type="password" name="cPassword"
										placeholder="Password" required>
								</div>
							</div>




							<div class="form-group">
								<label class="control-label col-sm-2" for="cMobile">Mobile:</label>
								<div class="col-sm-9">
									<input class="form-control" type="tel" pattern='^[89]\d{7}$'
										name="cMobile" placeholder="Mobile number" required>
								</div>
							</div>

							<div class="form-group">
								<label class="control-label col-sm-2" for="cAddress">Address</label>
								<div class="col-sm-9">
									<input class="form-control" type="text" name="cAddress"
										placeholder="Address" required>
								</div>
							</div>

							<div class="form-group">
								<label class="control-label col-sm-2" for="cHourlyRate">Coach
									Hourly Rate:</label>
								<div class="col-sm-9">
									<input class="form-control" type="text" name="cHourlyRate"
										placeholder="Coach Hourly Rate" required>
								</div>
							</div>

							<div class="form-group">
								<label class="control-label col-sm-2" for="cDesc">Coach
									Description:</label>
								<div class="col-sm-9">
									<input class="form-control" type="text" name="cDesc"
										placeholder="Coach Description" required>
								</div>
							</div>

							<div class="form-group">
								<label class="control-label col-sm-2" for="status">User
									Status:</label>
								<div class="col-sm-4">
									<select class="form-control" name="status">
										<option value="1">Pending</option>
										<option value="2">Registered</option>
									</select>
								</div>

							</div>





							<div class="form-actions">

								<button type="submit" class="btn btn-primary">Save
									changes</button>
								<a href="manageCoachUser.jsp"><button type="button"
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


	<script src="js/footer.js"></script>


	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>



	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
	<!-- Include all compiled plugins (below), or include individual files as needed -->
	<script src="js/bootstrap.min.js"></script>

	<script src="js/jquery-1.10.2.js"></script>
	<script src="js/bootstrap.js"></script>

</body>
</html>