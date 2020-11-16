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
	<h1>Cars</h1>
	
	<table>
		<thead>
			<tr>
				<th>Make</th>
				<th>Model</th>
				<th>Year</th>
				<th></th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="car" items="${ cars }">
			
				<tr>
					<td>${ car.getMake() }</td>
					<td>${ car.getModel() }</td>
					<td>${ car.getYear() }</td>
					<td><a href="/delete?id=${ car.getId() }">delete</a></td>
				</tr>
			
			</c:forEach>
		</tbody>
	</table>
	
	<a href="/add">Add a new car</a>
	
</body>
</html>






