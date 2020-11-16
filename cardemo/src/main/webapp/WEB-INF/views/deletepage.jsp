<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Delete ${ car.getYear() } ${ car.getMake() } ${ car.getModel() }</h1>
	Are you sure?<br />
	<a href="/reallydelete?id=${ car.getId() }">Yes, delete!</a><br />
	<a href="/">No! Go back to list</a>
</body>
</html>