<!DOCTYPE html>
<html lang="en">
<jsp:include page="main/counsellorNavigation.jsp"></jsp:include>
<%@ page import="java.sql.*"%>
<%@ page import="javax.sql.*"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>

<sql:setDataSource var="dataSource" driver="com.mysql.jdbc.Driver"
	url="jdbc:mysql://localhost:3306/mydb" scope="session" user="root"
	password="" />

<!-- program details -->
<sql:query var="studentprograms" dataSource="${dataSource}">
SELECT *
FROM `program_has_client`, `program`, `client`, user
WHERE `program`.`program_id` = `program_has_client`.`program_id`
AND `program_has_client`.`client_id` = `client`.`client_id`
AND client.client_id = user.client_id
AND `program_has_client`.`enrollment_status_id` = 1
AND user.user_id = <%=request.getParameter("userid")%>;
</sql:query>

<!-- item details -->
<sql:query var="studentcourse" dataSource="${dataSource}">
SELECT * 
FROM itemrun_has_client, itemrun, client, item, user
WHERE itemrun_has_client.enrollment_status_id = 1
AND item.item_id = itemrun.item_id
AND itemrun.itemrun_id = itemrun_has_client.itemrun_id
AND itemrun_has_client.client_id = client.client_id
AND client.client_id = user.client_id
AND user.user_id = <%=request.getParameter("userid")%>;
</sql:query>

<!-- child details -->
<sql:query var="userprofile" dataSource="${dataSource}">
SELECT * FROM user
WHERE user_id = <%=request.getParameter("userid")%>;
;</sql:query>

<%
	//allow access only if session exists
	String user = null;

	if (session.getAttribute("name") == null || session.getAttribute("role") == null
			|| session.getAttribute("role") != "coach") {
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

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<title>I'MPOSSIBLE - Manage Course</title>
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
	<div class="container">
		<div class="container-fluid">
		
			<ul class="nav nav-tabs">
				<li class="active"><a href="studentdetails.jsp?childid=${child.user_id}">Programs
						Registered</a></li>
				<li><a href="counsellorrecentjournals.jsp?userid=${child.user_id}">Recent Journals</a></li>
				<li><a href="studentaddress.jsp?userid=${child.user_id}">Address</a></li>
			</ul>

			<div class="panel panel-default">

				<div class="panel-heading">
					<c:forEach var="profile" items="${userprofile.rows}">
						<h3 class="panel-title">
							Student Details:
							<c:out value="${profile.surname} ${profile.given_name}" />
						</h3>
					</c:forEach>
				</div>

				<div class="panel-body">
					<p class="icons">
						<a href="coachnotes.jsp"><button type="button"
								class="btn btn-default btn-sm">
								<span class="glyphicon glyphicon-plus"></span> Write a new note
							</button></a> <a href="counsellorassignstudent.html"><button type="button"
								class="btn btn-default btn-sm">Add a timeslot</button></a>
					</p>

					<div class="row">
						<h4>Program / Courses Registered</h4>
						<c:forEach var="programsforstudents"
							items="${studentprograms.rows}">
							<p>
								<a href="ReflectionJournal.jsp"><c:out
										value="${programsforstudents.program_name}" /></a>
							</p>
						</c:forEach>

						<c:forEach var="coursesforstudents" items="${studentcourse.rows}">
							<p>
								<a href="ReflectionJournal.jsp"><c:out
										value="${coursesforstudents.item_name}" /></a>
							</p>
						</c:forEach>
					</div>

				</div>
			</div>
		</div>
	</div>

	<!-- <Fixed footer> -->
	<nav id="footerMenu"></nav>
	<!-- End <Fixed footer> -->

	<script src="js/footer.js"></script>

	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
	<!-- Include all compiled plugins (below), or include individual files as needed -->
	<script src="js/bootstrap.min.js"></script>
</body>
</html>