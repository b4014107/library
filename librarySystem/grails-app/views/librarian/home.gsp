<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Sheffield Hallam Library Management Appliication</title>
    <asset:stylesheet src="home.css"/>

    <asset:link rel="icon" href="favicon.ico" type="image/x-ico" />
</head>
<body>

<div id="content" role="main">

<div class="row">

<h1><u><strong>Librarian Controller Menu</strong></u></h1>

	<h2><u><strong>Management Section</strong></u></h2>

				<div class="first">

					<h3> Student Management </h3>

					<p> Here is the management section to add a new students onto the system </p>

					<button class="button" type="button" class="btn btn-success">
	
					<g:link controller="student" action="create">Add Student</g:link>

					</button>

				</div></br>

				
				<div class="second">

					<h3> Book Management </h3>

					<p> Here is the management section to add a new books to different libararies </p>

					<button class="button" type="button" class="btn btn-success">

					<g:link controller="book" action="create">Add Book</g:link>

					
				</div></br>

				
				<div class="first">

					<h3> Course Management </h3>

					<p> Add new courses for students to log down on in this section</p>

					<button class="button" type="button" class="btn btn-success">
	
					<g:link controller="course" action="create">Add Course</g:link>

					</button>

				</div></br>

				<div class="second">

					<h3> Librarian  Management </h3>

					<p> This section is where new libarians can be added onto the system</p>

					<button class="button" type="button" class="btn btn-success">
	
					<g:link controller="librarian" action="create">Add Librarian</g:link>

					</button>

				</div></br>

<h2><u><strong>Search Section</strong></u></h2>
				
				<div class="first">

					<h3> Student Advanced Search Form</h3>

					<p>Search for students on the application</p>
	
					<button class="button" type="button" class="btn btn-success">

					<g:link controller="librarian" action="advSearch">Advanced Search</g:link>
			
					</button>
				</div>



			</div>
		</div>
	</body>
</html>
