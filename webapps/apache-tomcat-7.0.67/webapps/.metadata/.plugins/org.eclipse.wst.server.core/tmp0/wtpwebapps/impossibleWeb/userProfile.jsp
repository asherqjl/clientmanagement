<!DOCTYPE html>
<html lang="en">

<jsp:include page="main/userNavigation.jsp"></jsp:include>

<%@ page import="java.sql.*"%>
<%@ page import="javax.sql.*"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>

<sql:setDataSource var="dataSource" driver="com.mysql.jdbc.Driver"
	url="jdbc:mysql://localhost:3306/mydb" scope="session" user="root"
	password="" />


<%
	//allow access only if session exists
	String user = null;

	String role = (String) session.getAttribute("role");
	String uid = null;
	if (session.getAttribute("name") == null || session.getAttribute("role") == null
			|| !role.equalsIgnoreCase("child")) {
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



<!-- child details -->
<sql:query var="userprofile" dataSource="${dataSource}">
SELECT * FROM user, client
WHERE user.client_id = client.client_id
AND user.user_id = <%=uid%>;</sql:query>


<!-- parent details -->
<sql:query var="banner" dataSource="${dataSource}">
SELECT * FROM user, client, parent
WHERE client.parent_id = parent.parent_id
AND client.client_id = user.client_id
AND user.user_id = <%=uid%>;
</sql:query>


<c:forEach var="profile" items="${banner.rows}">
	<!-- parent details -->
	<sql:query var="parentid" dataSource="${dataSource}">
SELECT * FROM user, client
WHERE client.parent_id = user.parent_id
AND client.parent_id=<c:out value="${profile.parent_id}" />
	</sql:query>
</c:forEach>

<!-- program details -->
<sql:query var="studentprograms" dataSource="${dataSource}">
SELECT * FROM `program_has_client`, `program`, `client`,`user`
WHERE `program`.`program_id` = `program_has_client`.`program_id`
AND `program_has_client`.`client_id` = `client`.`client_id`
AND client.client_id = user.client_id
AND user.user_id = <%=uid%> ;
</sql:query>

<!-- item details -->
<sql:query var="studentcourse" dataSource="${dataSource}">
SELECT * FROM itemrun_has_client, itemrun, client, item, user
WHERE item.item_id = itemrun.item_id
AND itemrun.itemrun_id = itemrun_has_client.itemrun_id
AND itemrun_has_client.client_id = client.client_id
AND client.client_id = user.client_id
AND user.user_id = <%=uid%>;
</sql:query>


<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<title>I'MPOSSIBLE - View User Profile</title>

<!-- Bootstrap -->
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/bootstrap.css" rel="stylesheet" type="text/css" />
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">
<link href="css/home.css" rel="stylesheet">

<body>
	<div class="container">
		<div class="row">
			<h4>
				<b>User Information</b>
			</h4>
			<hr />

			<div class="col-sm-4">
				<c:forEach var="profile" items="${userprofile.rows}">
					<b>User Role:</b> Child
				<p>
						<b>Name:</b>
						<c:out value="${profile.surname} ${profile.given_name}" />
					</p>
					<p>
						<b>Date of Birth: </b>
						<c:out value="${profile.client_dob}" />
					</p>
					<p>
						<b>E-Mail: </b>
						<c:out value="${profile.email}" />
					</p>

					<p>
						<b>Mobile: </b>
						<c:out value="${profile.mobile}" />
					</p>
					<p>
						<b>Address: </b>
						<c:out value="${profile.address}" />
					</p>
					<p>
						<b>School: </b>
						<c:out value="${profile.client_school}" />
						RP
					</p>
				</c:forEach>
			</div>

			<div class="col-sm-4">

				<c:forEach var="parentname" items="${parentid.rows}">
					<b>User Role:</b> Parent
				<p>
						<b>Parent:</b>
						<c:out value="${parentname.surname} ${parentname.given_name}" />
					</p>
					<p>
						<b>E-Mail: </b>
						<c:out value="${parentname.email}" />
					</p>
					<p>
						<b>Mobile: </b>
						<c:out value="${parentname.mobile}" />
					</p>
					<p>
						<b>Address: </b>
						<c:out value="${parentname.address}" />
					</p>
				</c:forEach>
			</div>
		</div>
		<hr />
		<div class="row">
			<div class="col-sm-8">
				<h4>
					<b>Item Structure</b>
				</h4>
				<hr>
				<p>The Student have the following Item Structure:</p>
				<div class="panel-group">

					<div class="panel panel-default">
						<div class="panel-heading">
							<h5>Item Names</h5>
						</div>
						<div class="panel-body">


							<c:forEach var="programsforstudents"
								items="${studentprograms.rows}">
								<p>
									<a href="viewCourseDetails.html"> <c:out
											value="${programsforstudents.program_name}" /></a>
								</p>

							</c:forEach>

							<c:forEach var="coursesforstudents" items="${studentcourse.rows}">
								<p>
									<a href="viewCourseDetails.html"> <c:out
											value="${coursesforstudents.item_name}" /></a>
								</p>
							</c:forEach>

						</div>
					</div>
				</div>


			</div>
		</div>
		<p style="text-align: right">
			<a class="btn btn-default" href="user.jsp" role="button">Back</a>
		</p>
	</div>

	<!-- Start of <Fixed footer> -->
	<footer id="footerMenu"></footer>
	<!-- End of <Fixed footer> -->

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