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

<!-- child details -->
<sql:query var="userprofile" dataSource="${dataSource}">
SELECT * FROM user, client, program_has_client
WHERE program_has_client.client_id = client.client_id
AND client.client_id = user.client_id;
AND user.user_id = <%=request.getParameter("userid")%>; </sql:query>


<!-- //var - student journals -->
<sql:query var="studentrecentjournals" dataSource="${dataSource}">
SELECT `client_journal_id`, `client_id`, `coach_id`, `journal_reflection`, `emotion_rating`, `create_update_datetime`, `privacy_indicator`, `coach_comment`, `coach_comment_datetime` FROM `client_journal` WHERE client_id = 1 ORDER BY `create_update_datetime` ASC;
</sql:query>


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
				<li><a href="studentdetails.jsp">Programs Registered</a></li>
				<li class="active"><a href="counsellorrecentjournals.jsp">Recent
						Journals</a></li>
				<li><a href="studentaddress.jsp">Address</a></li>
			</ul>

			<div class="panel panel-default">
				<c:forEach var="profile" items="${userprofile.rows}">
					<div class="panel-heading">

						<h3 class="panel-title">
							Student Details:
							<c:out value="${profile.surname} ${profile.given_name}" />
						</h3>
					</div>
				</c:forEach>

				<div class="panel-body">
					<p class="icons">
						<a href="doCounsellor.html"><button type="button"
								class="btn btn-default btn-sm">Add a comment</button></a>
					</p>

					<h4>Recent Journals</h4>
					<c:forEach var="recentjournals"
						items="${studentrecentjournals.rows}">

						<h4>
							<c:out value="${recentjournals.create_update_datetime}" />
						</h4>
						<input type="checkbox" name="checkbox" value="checkbox">


						<textarea class="form-control" id="message" name="message"
							placeholder="<c:out value="${recentjournals.journal_reflection}" />"
							rows="7"></textarea>
					</c:forEach>

					<!-- <ul class="pagination pagination-sm" style="float: right;">
						<li class="disabled"><a href="#">&laquo;</a></li>
						<li class="active"><a href="#">1</a></li>
						<li><a href="#">2</a></li>
						<li><a href="#">3</a></li>
						<li><a href="#">4</a></li>
						<li><a href="#">5</a></li>
						<li><a href="#">&raquo;</a></li>
					</ul> -->
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