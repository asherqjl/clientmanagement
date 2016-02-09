<!DOCTYPE html>
<html lang="en">

<meta charset="utf-8">
<jsp:include page="main/parentNavigation.jsp"></jsp:include>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<title>I'MPOSSIBLE - Parent Page</title>

<!-- Bootstrap -->
<link href="css/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">
<link href="css/home.css" rel="stylesheet">

<%
		//allow access only if session exists
		String user = null;

		String role=(String) session.getAttribute("role");
		String uid = null;
		 if(session.getAttribute("name") == null || session.getAttribute("role") == null || !role.equalsIgnoreCase("parent")){
		response.sendRedirect("login.html");
		}else user = (String) session.getAttribute("name");
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
	
<body>
	<div style="padding-top: 100px; text-align: center">
		<div class="container marketing">
			<div class="row">
				<div class="col-lg-4">
					<img class="img-circle" src="image/Diary-icon.png"
						alt="Generic placeholder image" width="160" height="160">
					<h2>Recent Journals</h2>
					<p>View journals that your child have recently written and
						counsellor's commentss</p>

				</div>
				<div class="col-lg-4">
					<img class="img-circle" src="image/Courses-icon.png"
						alt="Generic placeholder image" width="160" height="160">
					<h2>My Courses</h2>
					<p>View all Courses and Programs that I have registered.</p>

				</div>
				<div class="col-lg-4">
					<img class="img-circle" src="image/profile-icon.png"
						alt="Generic placeholder image" width="160" height="160">
					<h2>My Information</h2>
					<p>View my Information and edit my profile</p>

				</div>
			</div>

			<div class="row">
				<div class="col-lg-4">
					<p>
						<a class="btn btn-default" href="ParentViewJournals.jsp"
							role="button">View Journals &raquo;</a>
					</p>
				</div>
				<div class="col-lg-4">
					<p>
						<a class="btn btn-default" href="ParentCoursesNPrograms.jsp"
							role="button">View details &raquo;</a>
					</p>
				</div>
				<div class="col-lg-4">
					<p>
						<a class="btn btn-default" href="ParentProfile.jsp" role="button">View My
							Information &raquo;</a>
					</p>
				</div>
			</div>
		</div>
		</div>

		<!-- <Fixed footer> -->
		<footer id="footerMenu"></footer>
		<!-- End <Fixed footer> -->

		<script src="js/footer.js"></script>

		<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
		<script
			src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
		<!-- Include all compiled plugins (below), or include individual files as needed -->
		<script src="js/bootstrap.min.js"></script>
</body>
</html>