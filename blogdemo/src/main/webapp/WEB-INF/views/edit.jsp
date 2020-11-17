<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Edit Blog</h1>
	
	<form method="post" action="/edit">
		<input type="hidden" name="id" value="${ blog.id }" />
		<input type="hidden" name="entrydate" value="${ blog.entrydate }" />
		Title: <input type="text" name="title" value="${ blog.title }" /><br />
		Author: <input type="text" name="author" value="${ blog.author }" /><br />
		Category: <input type="text" name="category" value="${ blog.category }"/><br />
		Text: <textarea name="text">${ blog.text }</textarea><br />
		<input type="submit" />
	</form>
	
</body>
</html>