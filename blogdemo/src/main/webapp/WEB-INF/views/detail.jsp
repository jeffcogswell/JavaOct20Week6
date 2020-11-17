<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Detail</h1>
	<a href="/edit/${ blog.getId() }">Edit</a>
	<h2>${ blog.getTitle() }</h2>
	<h3>by ${ blog.getAuthor() }</h3>
	<h3>Posted on ${ blog.getEntrydate() }</h3>
	<div class="blogtext">
		${ blog.getText() }
	</div>
</body>
</html>