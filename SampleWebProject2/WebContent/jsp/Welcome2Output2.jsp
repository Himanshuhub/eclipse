<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Welcome 2 Output page in JSP</title>
</head>
<body>
	<h1>Account Number: </h1> <%= session.getAttribute("an") %>
	<h1>Bank Name: </h1> <%= session.getAttribute("bname") %>

</body>
</html>