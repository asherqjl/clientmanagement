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

<!-- //var - ownself name, data source is take from line 9 -->


<%
		//allow access only if session exists
		String user = null;

		String role=(String) session.getAttribute("role");
		String uid = null;
		 if(session.getAttribute("name") == null || session.getAttribute("role") == null || !role.equalsIgnoreCase("child")){
		response.sendRedirect("login.jsp");
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

<sql:query var="clientjournal" dataSource="${dataSource}">
SELECT `client_journal_id`, `client_id`, `coach_id`, `journal_reflection`, `emotion_rating`, `create_update_datetime`, `privacy_indicator`, `coach_comment`, `coach_comment_datetime` FROM `client_journal`
WHERE client_journal_id=<%=request.getParameter("journalid")%>;


</sql:query>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<title>I'MPOSSIBLE - Passed Journals</title>

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
      <scricpt src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->

<script src="ckeditor/ckeditor.js"></script>

<body>

	<!-- start of body container -->

	<!-- Wrapper for slides -->

		<div class="item active">
			<div class="container">
				<div class="container-fluid">
					<div class="panel panel-default">
						<div class="panel-heading">
							<h3 class="panel-title">Passed Journals & Comments</h3>

							<c:forEach var="client" items="${clientjournal.rows}">

								<td><c:out value="${client.create_update_datetime}" /></td>

								<div class="panel-body">
									<div class="row">
										<label>Reflection Journal:</label>
										<textarea name="editor1" id="editor1" rows="10" cols="80">
					<c:out value="${client.journal_reflection}" />     	
						</textarea>
										<script>
												// Replace the <textarea id="editor1"> with a CKEditor
												// instance, using default configuration.
												CKEDITOR.replace('editor1');
											</script>
									</div>
									<br />
									<div class="row">
										<label>Counsellor's Comment:</label> <br />
										<h5>
											<c:out value="${client.coach_comment}" />
										</h5>
										<i>Commented on <c:out
												value="${client.coach_comment_datetime}" />
									</div>
									<!-- <ul class="pager">
											<li class="previous"><a href="#">&larr; Previous</a></li>
											<li class="next"><a href="#">Next &rarr;</a></li>
										</ul> -->
								</div>
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