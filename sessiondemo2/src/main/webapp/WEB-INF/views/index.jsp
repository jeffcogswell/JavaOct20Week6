<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Index Session Demo 2</h1>
	
	Please log in:
	<form method="post" action="/login">
	
		Username: <input type="text" name="username" /><br />
		Password: <input type="password" name="password" /><br />
		<input type="submit" />
	
	</form>	
	
	OR Register:
	
	<form method="post" action="/register">
		Username: <input type="text" name="username" /><br />
		Password: <input type="password" name="password" /><br />
		First name: <input type="text" name="firstname" /><br />
		Email: <input type="email" name="email" /><br />
		<input type="submit" />
	</form>
	
</body>
</html>
