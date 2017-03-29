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

					<h3> Book Reviews</h3>

					<p> This is the section where you can create and list reviews for all the books in the libraries </p>

					<button type="button" class="btn btn-success">
	
					<g:link controller="bookReview" action="create">Write a Review</g:link>
					</button>


					<button type="button" class="btn btn-success">					
					<g:link controller="bookReview" action="index">List Reviews</g:link>

					</button>

				</div>

				
				<div class="second">

					<h3> Books </h3>

					<p> This section is where you can look at all the current books in the library</p>

					<button type="button" class="btn btn-success">

					<g:link controller="book" action="index">Look for a book!</g:link>

					</button>

					
				</div>


				<div class="first">

					<h3> Advanced Search Form</h3>

					<p> This is the results  </p>
	
					<button type="button" class="btn btn-success">

					<g:link controller="student" action="advSearch">Books</g:link>
			
					</button>
				</div>
				
				

				

			</div>
		</div>
	</body>
</html>
