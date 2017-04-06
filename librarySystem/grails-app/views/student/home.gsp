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

<h1><u><strong>Student Controller Menu</strong></u></h1>

	<h2><u><strong>Books and Reviews</strong></u></h2>


				<div class="first">

					<h3> Book Reviews</h3>

					<p> This is the section where you can create and list reviews for all the books in the libraries </p>

					<button class="button" type="button" class="btn btn-success">
	
					<g:link controller="bookReview" action="create">Write a Review</g:link>
					</button>


					<button class="button" type="button" class="btn btn-success">					
					<g:link controller="bookReview" action="index">List Reviews</g:link>

					</button>

				</div></br>

				
				<div class="second">

					<h3> Books </h3>

					<p> This section is where you can look at all the current books in the library</p>

					<button class="button" type="button" class="btn btn-success">

					<g:link controller="book" action="index">Look for a book!</g:link>

					</button>

					
				</div></br>

<h2><u><strong>Extended Options</strong></u></h2>


				<div class="first">

					<h3> Advanced Search Form</h3>

					<p> This is the results  </p>
	
					<button class="button" type="button" class="btn btn-success">

					<g:link controller="book" action="advSearch">Search for Books</g:link>
			
					</button>
				</div></br>

				<div class="first">

					<h3>Book Index</h3>

					<p> This is the index list for the books  </p>
	
					<button class="button" type="button" class="btn btn-success">

					<g:link controller="book" action="Bindex">Book Index (JSON)</g:link>
			
					</button>
				</div></br>

			

			</div>
		</div>
	</body>
</html>
