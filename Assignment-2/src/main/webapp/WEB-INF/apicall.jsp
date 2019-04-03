<%@page import="com.example.demo.Result"%>
<%@page import="com.example.demo.Show"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body>
	<h1>User successfully loged in</h1>
	<br/>
	<form action="/search" >
	<input type="text" id="searchform-q" name="q" placeholder="Search Shows and People">
	<button type="submit"  value="Search">Search </button>
     </form>                       
	<a href="/callApiMethod">Call API</a>
	<a href="/">Logout</a>
	<h1>List of Shows</h1>
	<%  List<Show> participantJsonList = (List<Show>) request.getSession().getAttribute("results"); %>
<% for (Show result : participantJsonList ) {%>
	<h3><%= result.getName() %></h3>

	
<%}%>
</body>
</html>