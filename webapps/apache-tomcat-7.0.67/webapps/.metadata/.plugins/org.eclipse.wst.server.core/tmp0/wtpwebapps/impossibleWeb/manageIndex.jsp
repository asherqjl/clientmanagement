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
<title>I'MPOSSIBLE - Manage Home Page Index</title>
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

<link href="css/fileinput.min.css" media="all" rel="stylesheet"
	type="text/css" />

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


	<!-- <Start> -->

	<div class="container">

		<div id="content">
			<div class="page-header">
				<div class="container-fluid">

					<h1>Manage Home Page</h1>

					<ul class="breadcrumb">
						<li><a href="adminIndex.jsp">Home</a></li>
						<li><a href="manageAbout.jsp">Manage About</a></li>
						<li><a href="manageContactUs.jsp">Manage Contact Us</a></li>
						<li><a href="manageIndex.jsp">Manage Index</a></li>

					</ul>
				</div>
			</div>
			<div class="container-fluid">
				<div class="panel panel-default">
					<div class="panel-heading">
						<h3 class="panel-title">
							<i class="fa fa-pencil"></i> Add New Image Banner
						</h3>
					</div>
					<div class="panel-body">
						<form action="FileUploadDBServlet" method="post"
							enctype="multipart/form-data" class="form-horizontal">




							<!-- IMAGE  -->
							<div class="form-group required">
								<label class="col-sm-2 control-label" for="input-name1">Image
									Banner 1:</label>
								<div class="col-sm-10">
									<input id="input-image-1" name="photo" type="file"
										class="file-loading" accept="image/*">

									<!-- an example modal dialog to display confirmation of the resized image -->
									<div id="kv-success-modal" class="modal fade">
										<div class="modal-dialog">
											<div class="modal-content">
												<div class="modal-header">
													<button type="button" class="close" data-dismiss="modal"
														aria-label="Close">
														<span aria-hidden="true">&times;</span>
													</button>
													<h4 class="modal-title">Yippee!</h4>
												</div>
												<div id="kv-success-box" class="modal-body"></div>
											</div>
										</div>
									</div>
								</div>
							</div>



							<div class="form-group">
								<div class="form-actions">
									<button type="submit" class="btn btn-primary">Save
										changes</button>
									<a href="adminIndex.jsp"><button type="button"
											class="btn btn-danger">Cancel</button></a>

								</div>

							</div>




						</form>


					</div>

				</div>
			</div>
		</div>

	</div>
	<!-- <End> -->

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


	<script src="js/jquery-1.10.2.js"></script>
	<script src="js/bootstrap.js"></script>
	<script
		src="http://ajax.googleapis.com/ajax/libs/jquery/2.0.0/jquery.min.js"></script>
	<!-- canvas-to-blob.min.js is only needed if you wish to resize images before upload.
This must be loaded before fileinput.min.js -->
	<script src="js/canvas-to-blob.min.js" type="text/javascript"></script>
	<script src="js/fileinput.min.js" type="text/javascript"></script>
	<!-- bootstrap.js below is only needed if you wish to use the feature of viewing details 
of text file preview via modal dialog -->
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"
		type="text/javascript"></script>
	<!-- optionally if you need translation for your language then include 
locale file as mentioned below -->
	<script src="js/fileinput_locale_<lang>.js"></script>
	<script src="js/fileinput.js"></script>
	<script>
		$("#input-image-1").fileinput({
			uploadUrl : "/site/image-upload",
			allowedFileExtensions : [ "jpg", "png", "gif" ],
			maxImageWidth : 200,
			maxFileCount : 1,
			resizeImage : true
		}).on('filepreupload', function() {
			$('#kv-success-box').html('');
		}).on('fileuploaded', function(event, data) {
			$('#kv-success-box').append(data.response.link);
			$('#kv-success-modal').modal('show');
		});
	</script>
</body>
</html>

