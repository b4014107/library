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

				<div class="first">

					<h3> Student Management </h3>

					<p> This is the Student Management Section </p>

					<button type="button" class="btn btn-success">
	
					<g:link controller="student" action="create">Add Student</g:link>

					</button>

				</div>

				
				<div class="second">

					<h3> Book Management </h3>

					<p> This is the Book Management Section </p>

					<button type="button" class="btn btn-success">

					<g:link controller="book" action="create">Add Book</g:link>

					
				</div>

				
				<div class="first">

					<h3> Course Management </h3>

					<p> This is the Course Management Section </p>

					<button type="button" class="btn btn-success">
	
					<g:link controller="course" action="create">Add Course</g:link>

					</button>

				</div>

				<div class="second">

					<h3> Librarian  Management </h3>

					<p> This is the Librarian Management Section </p>

					<button type="button" class="btn btn-success">
	
					<g:link controller="librarian" action="create">Add Librarian</g:link>

					</button>

				</div>

				
				<div class="first">

					<h3> Advanced Search Form</h3>

					<p> This is the results  </p>
	
					<button type="button" class="btn btn-success">

					<g:link controller="librarian" action="advSearch">Librarians</g:link>
			
					</button>
				</div>


			</div>
		</div>
	</body>
</html>
