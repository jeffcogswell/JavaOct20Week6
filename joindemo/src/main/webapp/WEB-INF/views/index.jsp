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
	<h1>Departments</h1>
	
	<c:forEach var="department" items="${ departments }">
		<h2>${ department.name }</h2>
		<c:forEach var="employee" items="${ department.employees }">
			<a href="/employee?id=${ employee.id }">${ employee.firstname } ${ employee.lastname }</a><br />
		</c:forEach>
	</c:forEach>
	
	<h1>Search by Last Name</h1>
	<form method="post" action="/employee/search">
		Last Name contains: <input type="text" name="lastname" /><br />
		<input type="submit" />
	</form>
	
</body>
</html>