<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>User Profile</h1>
	
	Username: ${ user.username }<br />
	Password: ${ user.password }<br />
	First name: ${ user.firstname }<br />
	Email: ${ user.email }
	<br /><br />
	
	<a href="/logout">Logout</a>
	
</body>
</html>