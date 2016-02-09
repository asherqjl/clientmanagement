<!DOCTYPE html>
<html lang="en">
<jsp:include page="main/publicNavigations.jsp"></jsp:include>
<%@ page import="java.sql.*"%>
<%@ page import="javax.sql.*"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>

<sql:setDataSource var="dataSource" driver="com.mysql.jdbc.Driver"
	url="jdbc:mysql://localhost:3306/mydb" scope="session" user="root"
	password="" />

<!-- //var - ownself name -->
<sql:query var="programs" dataSource="${dataSource}">
SELECT * FROM program, program_has_item, item
WHERE program_has_item.program_id = program.program_id
AND program_has_item.item_id = item.item_id
AND program.program_id=<%=request.getParameter("program_id")%>
LIMIT 1;
</sql:query>

<sql:query var="item" dataSource="${dataSource}">
SELECT * FROM program, program_has_item, item
WHERE program_has_item.program_id = program.program_id
AND program_has_item.item_id = item.item_id
AND program.program_id=<%=request.getParameter("program_id")%>;
</sql:query>


<%
	//allow access only if session exists
	String user = null;

	String role = (String) session.getAttribute("role");
	String uid = null;
	if (session.getAttribute("name") == null || session.getAttribute("role") == null
			|| !role.equalsIgnoreCase("parent")) {
		response.sendRedirect("login.html");
	} else
		user = (String) session.getAttribute("name");
	uid = (String) session.getAttribute("uid");
	String userName = null;
	String sessionID = null;
	String userrole = null;
	String userID = null;
	Cookie[] cookies = request.getCookies();
	if (cookies != null) {
		for (Cookie cookie : cookies) {
			if (cookie.getName().equals("name"))
				userName = cookie.getValue();
			if (cookie.getName().equals("JSESSIONID"))
				sessionID = cookie.getValue();
			if (cookie.getName().equals("role"))
				userrole = cookie.getValue();
			if (cookie.getName().equals("id"))
				userID = cookie.getValue();
		}
	} else {
		sessionID = session.getId();
	}

	/* no session validation logic in the above JSP. It contains link to another JSP page,  */
%>
<h3>
	Hi
	<%=userName%>, Login successful. Your Session ID=<%=sessionID%>
	role=<%=userrole%></h3>
<br> User=<%=user%>

<br> UserIDSession=<%=uid%>
<br> UserIDCookie=<%=userID%>
<br>role=<%=role%>


<!-- need to encode all the URLs where we want session information to be passed -->
<a href="CheckoutPage.jsp">Checkout Page</a>
<form action="LogoutServlet" method="get">
	<input type="submit" value="Logout">
</form>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<title>I'MPOSSIBLE - Shopping Cart</title>

<!-- Bootstrap -->
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/bootstrap.css" rel="stylesheet" type="text/css" />
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">

<link href="css/home.css" rel="stylesheet">
</head>

<body id="index">

	<!-- start of navigation bar  -->
	<nav id="parentMenu"></nav>
	<!-- End of navigation bar  -->
	<br>
	<br>

	<div class="container">
		<div class="page-header">
			<h1>My Bag</h1>
		</div>

		<div class="row">

			<c:forEach var="program" items="${programs.rows}">
				<div class="col-md-3">
					<img src="<c:out value="${program.images}" />"
						style="width: 200px; height: 150px">
				</div>

				<div class="col-md-5">

					<p>
						<b>Program Name: </b>
						<c:out value="${program.program_name}" />
					</p>

					<p>
						<b>Cost:</b>$
						<c:out value="${program.program_price}" />
						(including GST)
					</p>
				</div>
			</c:forEach>

			<div class="col-md-5">
				<p>
					<b> Item Names: </b>
					<c:forEach var="items" items="${item.rows}">
						<li><c:out value="${items.item_name}" /></li>
					</c:forEach>
				</p>
			</div>
		</div>


		<div class="col-md-12" style='text-align: right'>
			<a class="btn btn-primary" href="login.html">Proceed to checkout</a>
			<!-- <a class="btn btn-danger" href="viewProgramsNcourses.html">Back</a> -->


			<!-- Button -->
			<a href="#myModal" class="btn btn-primary" data-toggle="modal">PC</a>
		</div>
		<!-- Modal HTML -->
		<div id="myModal" class="modal fade">
			<div class="modal-dialog">
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal"
							aria-hidden="true">&times;</button>
						<h4 class="modal-title">Confirmation</h4>
					</div>
					<div class="modal-body">
						<p>Do you want to save changes you made to document before
							closing?</p>
						<p class="text-warning">
							<small>If you don't save, your changes will be lost.</small>
						</p>
					</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
						<button type="button" class="btn btn-primary">Check out</button>
					</div>
				</div>
			</div>
		</div>
	</div>

	<!-- Start of <Fixed footer> -->
	<footer id="footerMenu"></footer>
	<!-- End of <Fixed footer> -->

	<!-- start of login popup modal -->
	<!-- 	Place bootstrap core javascript below so pages load faster -->
	<div class="modal fade" id="login">
		<div class="modal-dialog">
			<div class="modal-content">

				<form class="form-horizontal" role="form">
					<div class="modal-header">
						<img src="image/impossiblelogo.png" alt="image logo"
							align="middle" style="width: 204px; height: 48px;">
					</div>

					<div class="modal-body">
						<div class="form-group">
							<label for="login-email" class="col-sm-2 control-label">Email:</label>
							<div class="col-sm-5">
								<input type="text" class="form-control" id="Login-email"
									placeholder="tomcat@domain.com">
							</div>
						</div>

						<div class="form-group">
							<label for="login-pwd" class="col-sm-2 control-label">Password*</label>
							<div class="col-sm-5">
								<input type="password" class="form-control" id="Login-name"
									placeholder="Password">
							</div>
						</div>
					</div>

					<div class="modal-footer">
						<a class="btn btn-danger" data-dismiss="modal">Close</a>
						<button type="submit" class="btn btn-warning">
							<i class="fa fa-key"></i>Log In
						</button>
					</div>
				</form>
			</div>
		</div>
	</div>
	<!-- end of the popout modal -->

	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
	<script src="js/bootstrap.min.js"></script>

	<!-- start of /the rotating banner javascript -->
	<script>
		$('.carousel').carousel({
			interval : 3000
		})
	</script>
	<!-- end of /the rotating banner javascript -->
	<script src="js/navlink-parent.js"></script>
	<script src="js/footer.js"></script>

	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
	<!-- Include all compiled plugins (below), or include individual files as needed -->
	<script src="js/bootstrap.min.js"></script>
	<script src="js/jquery-1.10.2.js"></script>
	<script src="js/bootstrap.js"></script>
</body>
</html>