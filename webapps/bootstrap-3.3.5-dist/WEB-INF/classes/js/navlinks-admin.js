	document.getElementById("navMenu").innerHTML =
	'<div class="navbar navbar-default navbar-fixed-top">'+
		'<div class="container">'+
			'<div class="navbar-header">'+
				'<button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">'+
					'<span class="sr-only">Toggle navigation</span> '+
					'<span class="icon-bar"></span>'+
					'<!-- for the responsive icon bar when page shrink -->'+
					'<span class="icon-bar"></span>'+
					'<!-- for the responsive icon bar when page shrink -->'+
					'<span class="icon-bar"></span>'+
					'<!-- for the responsive icon bar when page shrink -->'+
				'</button>'+

				'<a class="navbar-brand" href="index.html"> <img id="brand-image" alt="Website logo" src="image/brandimage.PNG" /> '+
				'</a>'+
			'</div>'+

			'<div class="navbar-collapse collapse">'+
				'<ul class="nav navbar-nav navbar-right">'+
					'<li class="dropdown"><a href="index.html" class="dropdown-toggle" data-toggle="dropdown">Home'+
					'<b class=caret></b></a>'+
						'<ul class="dropdown-menu">'+
							'<li><a href="index.html">Public homepage</a></li>'+
							'<li class="active">'+
							'<li><a href="viewProgramsNcourses.html"> User Homepage</a></li>'+
							'<li><a href="adminIndex.html">Admin homepage</a></li>'+
						'</ul>'+
					'</li>'+

					'<li class="dropdown"><a href="adminIndex.html" class="dropdown-toggle" data-toggle="dropdown">Manage'+
					'<b class=caret></b></a>'+
						'<ul class="dropdown-menu">'+
							'<li><a href="manageIndex.html"> Manage Public Home Page</a></li>'+
							'<li><a href="manageAbout.html">Manage About</a></li>'+
							'<li><a href="manageContactUs.html">Manage ContactUs</a></li>'+
							'<li><a href="manageCategory.html"> Manage Category</a></li>'+
						'<li class="active">'+
							'<li><a href="courseAdmin.html"> Manage Course</a></li>'+
							'<li><a href="programAdmin.html"> Manage Program</a></li>'+
							'<li><a href="adminCourseSchedule.html"> Manage Course Schedule</a></li>'+
							'<li><a href="manageStatus.html"> Manage Status</a></li>'+
							'<li><a href="manageUser.html"> Manage Users</a></li>'+

						'</ul></li>'+





					'<!-- add search form -->'+
					'<li><form class="navbar-form navbar-right" role="search">'+
							'<div class="input-group">'+
								'<input type="text" class="form-control" placeholder="Search ">'+
								'<span class="input-group-btn">'+
									'<button type="submit" class="btn btn-default">'+
										'<span class="glyphicon glyphicon-search"></span>'+
									'</button>'+
								'</span>'+
							'</div>'+
						'</form></li>'+

					'<li class="dropdown"><a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="fa fa-user"></i> John Smith '+
					'<b class="caret"></b></a>'+
						'<ul class="dropdown-menu">'+
							'<li><a href="#"><i class="fa fa-fw fa-user"></i> Profile</a>'+
							'</li>'+
							'<li><a href="#"><i class="fa fa-fw fa-envelope"></i>'+
								'	Inbox</a></li>'+
							'<li><a href="#"><i class="fa fa-fw fa-gear"></i>'+
								'	Settings</a></li>'+
							'<li class="divider"></li>'+
							'<li><a href="#"><i class="fa fa-fw fa-power-off"></i>'+
								'	Log Out</a></li>'+
						'</ul></li>'+



				'</ul>'+
			'</div>'+

		'</div>'+
	'</div>';