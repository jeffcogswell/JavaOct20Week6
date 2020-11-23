<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Tasks</h1>
	<div style="font-weight: bold; color: red">${ message }</div>
	
	<h2>Login</h2>
	<form method="post" action="/login">
		Email: <input type="text" name="email" /><br />
		Password: <input type="password" name="password" /><br />
		<input type="submit" />
	</form>
	
	<h2>Register</h2>
	<form method="post" action="/register">
		Email: <input type="text" name="email" /><br />
		Password: <input type="password" name="password" /><br />
		<input type="submit" />
	</form>
</body>
</html>