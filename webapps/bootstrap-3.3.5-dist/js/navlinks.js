<link href="css/home.css" rel="stylesheet">
<script>
document.getElementById("nav01").innerHTML =

	"<ul class="nav navbar-nav navbar-right">"+
					
"<li><a href='index.html'>Home</a></li>" + 
					"<li><a href='about.html'>About</a></li>" +
					"<li><a href='viewProgramsNcourses.html'>Courses & Programs</a></li>" +
					"<li><a href='ContactUs.html'>Contact Us</a></li>" +
					"<li><a href='#login' data-toggle='modal'>Log In</a></li>" +

					<!--  l#login is for reference for jquery, #data-toggle to triggle function -->

					<!-- add search form -->
					"<li id='search'>" +
						"<form class='navbar-form navbar-right' role='search'>" +
							"<div class='input-group'>" +
								"<input type='text' class='form-control' placeholder='Search '>" +
								"<span class='input-group-btn'>" +
									"<button type='submit' class='btn btn-default'>" +
										"<span class='glyphicon glyphicon-search'></span>" +
									"</button>" +
							"</span>" +
							"</div>" +
						"</form>" +
					"</li>" +
					<!-- end of add search form -->

					<!-- shopping cart -->
				"<li class='dropdown'>" +
					"<a href='shoppingcart.html' class='dropdown-toggle' data-toggle='dropdown'>" +
						"<span class='glyphicon glyphicon-shopping-cart'>" +</span>" +
						"<b class='caret'>" +
							"</b>" +
					"</a>" +

					"<ul class='dropdown-menu'>" +
							"<li><a href='shoppingcart.html'>Bag</a></li>" +
							"<li><a href='#'>Checkout</a></li>" +
						"</ul></li>" +
					<!-- end of shopping cart -->
		"</ul>"			
	</script>