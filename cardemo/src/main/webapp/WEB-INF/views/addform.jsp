<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Add Car</h1>
	<form method="post" action="/add">
	
		Make:
			<select name="make">
				<option>Chevy</option>
				<option>Ford</option>
				<option>Honda</option>
				<option>Hyundai</option>
				<option>Toyota</option>
			</select><br />
		
		Model: <input type="text" name="model" /><br />
		
		Year: <input type="number" min="2000" max="2021" name="year" /><br />
		
		<input type="submit" />
	
	</form>
</body>
</html>