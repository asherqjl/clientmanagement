<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<jsp:include page="main/adminNavigations.jsp"></jsp:include>

<sql:setDataSource var="dataSource" driver="com.mysql.jdbc.Driver"
	url="jdbc:mysql://localhost:3306/mydb" scope="session" user="root"
	password="" />


<sql:query var="userc" dataSource="${dataSource}">
SELECT * 
FROM  user where user_id=<%=request.getParameter("userID")%>

</sql:query>


<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<title>I'MPOSSIBLE - Admin Edit User</title>
<link rel="stylesheet" type="text/css" href="css/flaticon.css">
<meta
	content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no"
	name="viewport">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">
<!-- Ionicons -->
<link rel="stylesheet"
	href="https://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css">
<link href="css/bootstrap.min.css" rel="stylesheet">


<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>


<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/jquery-ui.min.css" rel="stylesheet">
<script src="http://cdn.alloyui.com/3.0.1/aui/aui-min.js"></script>
<link href="http://cdn.alloyui.com/3.0.1/aui-css/css/bootstrap.min.css"
	rel="stylesheet"></link>
<link rel="stylesheet" type="text/css" href="css/home.css" />
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

					<h1>Client User</h1>

					<ul class="breadcrumb">
						<li><a href="adminIndex.jsp">Home</a></li>
						<li><a href="manageUser.jsp">Client User</a></li>
					</ul>
				</div>
			</div>
			<div class="container-fluid">
				<div class="panel panel-default">
					<div class="panel-heading">
						<h3 class="panel-title">
							<i class="fa fa-pencil"></i> Edit Client User
						</h3>
					</div>
					<div class="panel-body">

						<c:forEach var="userm" items="${userc.rows}">
							<form action="editUser" method="post" class="form-horizontal">


								<input type="hidden" name="id" value="${userm.user_id}" /> <input
									type="hidden" name="role" value="${userm.role}" /> <input
									type="hidden" name="rdate" value="${userm.create_update_datetime}" />
									 <input
									type="hidden" name="userStatus" value="${userm.userStatus_id}" />
								<div class="form-group">
									<label class="col-sm-2 control-label" for="coach">Salutation:</label>
									<div class="col-sm-9">

										<select class="form-control" id="salutation_input"
											name="salutation">
											<option value="${userm.salutation}">${userm.salutation}</option>
											<option value="Mr">Mr</option>
											<option value="Mrs">Mrs</option>
											<option value="Ms">Ms</option>
											<option value="Mdm">Mdm</option>

										</select>
									</div>
								</div>

								<div class="form-group">
									<label class="control-label col-sm-2" for="uName">User
										Surname:</label>
									<div class="col-sm-9">
										<input class="form-control" type="text" name="uName"
											value="${userm.surname}">
									</div>
								</div>
								<div class="form-group">
									<label class="control-label col-sm-2" for="ugName">
										Given name:</label>
									<div class="col-sm-9">
										<input class="form-control" type="text" name="ugName"
											value="${userm.given_name}">
									</div>
								</div>



								<div class="form-group">
									<label class="control-label col-sm-2" for="uEmail">
										Email:</label>
									<div class="col-sm-9">
										<input class="form-control" type="text" name="uEmail"
											value="${userm.email}">
									</div>
								</div>
								<div class="form-group">
									<label class="control-label col-sm-2" for="uPassword">Password:</label>
									<div class="col-sm-9">
										<input class="form-control" type="password" name="uPassword"
											value="${userm.password}">
									</div>
								</div>



								<div class="form-group">
									<label class="control-label col-sm-2" for="uMobile">Mobile:</label>
									<div class="col-sm-9">
										<input class="form-control" type="tel" name="uMobile"
											value="${userm.mobile}">
									</div>
								</div>

								<div class="form-group">
									<label class="control-label col-sm-2" for="uAddress">Address</label>
									<div class="col-sm-9">
										<input class="form-control" type="text" name="uAddress"
											value="${userm.address}">
									</div>
								</div>



					

									<div class="form-actions">
										<button type="submit" class="btn btn-primary">Save
											changes</button>
										<a href="manageUser.jsp"><button type="button"
												class="btn btn-danger">Cancel</button></a>

									</div>
				



							</form>


						</c:forEach>

					</div>

				</div>
			</div>
		</div>
	</div>

	<!-- Start of <Fixed footer> -->
	<footer id="footerMenu"></footer>
	<!-- End of <Fixed footer> -->

	<script src="js/footer.js"></script>


	<script src="js/jquery.min.js"></script>
	<script src="js/jquery-ui.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script>
		$("#dp1").datepicker({
			dateFormat : 'yy/mm/dd'
		});
	</script>

</body>
</html>