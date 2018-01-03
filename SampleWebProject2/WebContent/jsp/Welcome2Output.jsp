<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Welcome 2 Output page in JSP</title>
</head>
<body>

<%
	String message = (String) request.getAttribute("errorMessage");
	if(message != null && message.trim().length() != 0){
%>
	<font color = "red">	<%= message %> </font>
<%		
	}
%>


	<h1>First Name: </h1> <%= session.getAttribute("fn") %>
	<h1>Middle Name: </h1> <%= session.getAttribute("mn") %>
	<h1>Last Name: </h1> <%= session.getAttribute("ln") %>

</body>
</html>