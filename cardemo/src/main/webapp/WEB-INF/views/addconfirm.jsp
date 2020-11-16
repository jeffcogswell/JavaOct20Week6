<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Car Added</h1>
	id: ${ car.getId() }<br />
	Make: ${ car.getMake() }<br />
	Model: ${ car.getModel() }<br />
	Year: ${ car.getYear() }<br />
	<br />
	<a href="/">Return to List</a>
</body>
</html>