<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Add</h1>
	
	<form method="post" action="/add">
		Title: <input type="text" name="title" /><br />
		Author: <input type="text" name="author" /><br />
		Category: <input type="text" name="category" /><br />
		Text: <textarea name="text"></textarea><br />
		<input type="submit" />
	</form>
	
</body>
</html>