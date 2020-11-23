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
	<h1>Welcome ${ user.email }</h1>
	<a href="/logout">Log out</a><br />
	
	<h2>Tasks</h2>
	<table>
		<thead>
			<th>Description</th>
			<th>Due</th>
			<th>Complete</th>
			<th>Mark Complete</th>
			<th>Delete</th>
		</thead>
		<tbody>
			<c:forEach var="task" items="${ user.tasks }">
				<tr>
					<td>${ task.description }</td>
					<td>${ task.duedate}</td>
					<td>${ task.complete }</td>
					<td><a href="/markcomplete?id=${task.id}">Mark Complete</a></td>
					<td><a href="/deletetask?id=${task.id}">Delete</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	
	<h2>New Task</h2>
	<form method="post" action="/save">
		Description: <input type="text" name="description" /><br />
		Due Date: <input type="date" name="duedate" /><br />
		<input type="submit" />
	</form>
	
</body>
</html>