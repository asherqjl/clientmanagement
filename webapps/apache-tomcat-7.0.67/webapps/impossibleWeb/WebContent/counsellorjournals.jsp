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

<%
	//allow access only if session exists
	String user = null;

	String role = (String) session.getAttribute("role");
	String uid = null;
	if (session.getAttribute("name") == null || session.getAttribute("role") == null
			|| !role.equalsIgnoreCase("coach")) {
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

<!-- //var - get the coach_id -->
<sql:query var="coachid" dataSource="${dataSource}">
SELECT *
FROM coach, user
WHERE coach.coach_id = user.coach_id
AND user.user_id = <%=uid%>;
</sql:query>

<!-- //var - ownself name -->
<c:forEach var="counsellor" items="${coachid.rows}">
	<sql:query var="counsellorjournals" dataSource="${dataSource}">
SELECT *
FROM client_journal, client, coach
WHERE client_journal.client_id = client.client_id
AND client_journal.coach_id = coach.coach_id
AND client_journal.coach_id = <c:out value="${counsellor.coach_id}" />;
</sql:query>
</c:forEach>


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
    <![endif
		<!-- tablesorter theme file-->
<link rel="stylesheet" href="css/theme.default.css">
<style>
th {
	text-align: center;
}
</style>
</head>

<body>
	<div class="container">
		<div class="container-fluid">
			<div class="panel panel-default">
				<div class="panel-heading">
					<h3 class="panel-title">All Journals</h3>
				</div>

				<div class="panel-body">
					<form action="#" method="post" enctype="multipart/form-data"
						id="form-course">
						<div class="table-responsive">
							<table id="myTable" class="table table-bordered table-hover">
								<thead>
									<tr>
										<th class="text-left">Date Of Submission</th>
										<th class="text-left">Time Of Submission</th>
										<th class="text-left">Comments Given</th>
										<th class="text-left">Written By</th>
										<th class="text-left">Emotion Rating</th>
										<th class="text-left">Privacy</th>
									</tr>
								</thead>

								<tbody>
									<c:forEach var="journals" items="${counsellorjournals.rows}">
										<tr>
											<td class="text-left"><input type="checkbox"
												name="checkbox" value="${journals.counsellorjournals}"></td>
											<td class="text-left"><c:out
													value="${journals.create_update_datetime}" /></td>

											<td class="text-left"><c:out
													value="${journals.coach_comment}" /></td>

											<td class="text-left"><c:out
													value="${journals.client_id}" /></td>

											<td class="text-left"><c:out
													value="${journals.emotion_rating}" /></td>

											<td class="text-left"><c:out
													value="${journals.privacy_indicator}" /></td>
											<td class="text-center">
												<button type="button" class="btn btn-default btn-sm"
													onclick="location.href='editJournals.jsp?journalID=${journals.client_journal_id}'">
													<span class="glyphicon glyphicon-edit"></span> Edit
												</button>
											</td>
										</tr>
									</c:forEach>
								</tbody>
							</table>
						</div>
					</form>


				</div>
			</div>
		</div>
	</div>

	<!-- <Fixed footer> -->
	<nav id="footerMenu"></nav>
	<!-- End <Fixed footer> -->


	<script type="text/javascript">
		function checkbox_test() {

			var counter = 0, i = 0, url = '',

			input_obj = document.getElementsByTagName('input');

			for (i = 0; i < input_obj.length; i++) {

				if (input_obj[i].type === 'checkbox'
						&& input_obj[i].checked === true) {

					url = url + '&journalID=' + input_obj[i].value;
					counter++;

				}

			}

			if (counter > 0) {

				url = url.substr(1);

				alert("confirm('Delete/Uninstall cannot be undone! Are you sure you want to do this?') ");

				window.location.href = 'DeleteCounsellorComment?' + url;
			} else {
				alert('There is no checked checkbox');
			}
			var table = document.getElementById('myTable');
			var rowCount = table.rows.length;
			for (var i = 0; i < rowCount; i++) {
				var row = table.rows[i];
				var chkbox = row.cells[0].childNodes[0];
				if (null != chkbox && true == chkbox.checked) {
					table.deleteRow(i);
					rowCount--;
					i--;
				}

			}
		}
	</script>



	<script src="js/footer.js"></script>
	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
	<!-- Include all compiled plugins (below), or include individual files as needed -->
	<script src="js/bootstrap.min.js"></script>

	<!-- load jQuery and tablesorter scripts -->
	<script type="text/javascript" src="js/jquery-latest.js"></script>
	<script type="text/javascript" src="js/jquery.tablesorter.js"></script>

	<script>
		$(function() {
			$("#myTable").tablesorter();
		});
	</script>
</body>
</html>