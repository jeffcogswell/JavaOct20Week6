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
	<h1>Blogs</h1>
	
	<c:forEach var="blog" items="${ blogs }">
	
		<a href="/detail/${ blog.getId() }">${ blog.getTitle() }</a><br />
	
	</c:forEach>
	<br /><br />
	<a href="/add">Add New Blog</a>
</body>
</html>