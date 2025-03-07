<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>This is First.jsp</h1>
<%
String username=request.getParameter("user");
String email = request.getParameter("email");

out.println("<h1> Welcome "+username + "!! Email is "+email +"</h1>");

%>
</body>
</html>