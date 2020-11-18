<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Employee Detail</h1>
	<h2>${ employee.firstname } ${ employee.lastname }</h2>
	Phone: ${ employee.phone }<br />
	Department: ${ employee.department.name }<br />
	Location: ${ employee.department.location }
</body>
</html>