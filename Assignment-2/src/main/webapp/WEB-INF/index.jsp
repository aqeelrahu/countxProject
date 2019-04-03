<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body>
	<h1>Welcome in Sign Up page</h1>
	<form action="/signin" >
	<table>
		<tr><td>First Name:</td><td><input type="text" name="firstname"></td></tr>
		<tr><td>Last Name:</td><td><input type="text" name="lastname"></td></tr>
		<tr><td>Email:</td><td><input type="text" name="email"></td></tr>
		<tr><td>Password:</td><td><input type="text" name="password"></td></tr>
		<tr><td><button type="submit">Sign Up</button></td></tr>
		
	</table>
	</form>
</body>
</html>