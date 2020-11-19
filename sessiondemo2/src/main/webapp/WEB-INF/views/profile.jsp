<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Test Page</h1>
	
	Username: ${ user.username }<br />
	Password: ${ user.password }<br />
	First name: ${ user.firstname }<br />
	Email: ${ user.email }
	
	<h2>Favorite Restaurants</h2>
	<c:forEach var="fav" items="${ favs }">
		${ fav.restaurant }<br />
	</c:forEach>
	
	<br />
	<br />
	<a href="/logout">Logout</a>
	
</body>
</html>