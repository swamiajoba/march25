<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.time.LocalDate"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@include file="Banner.jsp" %>
	<h1>JSP Demo</h1>
	<h2>Scriplets</h2>
	<% LocalDate today=LocalDate.now();
		out.println(today);
	%>
	<h2>Expression </h2>
	<%=today %>
	
	
	
</body>
</html>