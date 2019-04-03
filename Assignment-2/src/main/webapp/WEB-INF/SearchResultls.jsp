<%@page import="com.example.demo.Result"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="/search" >
	<input type="text" id="searchform-q" name="q" placeholder="Search Shows and People">
	<button type="submit"  value="Search">Search </button>
     </form>                       
	<a href="/callApiMethod">Call API</a>
	<a href="/">Logout</a>
<h1>Search Results</h1><br />
<%  List<Result> participantJsonList = (List<Result>) request.getSession().getAttribute("results"); %>
<% for (Result result : participantJsonList ) {%>
	
	<h1><%= result.getShow().getId() + " --- " + result.getShow().getName() %></h1>
	
<%}%>
</body>
</html>