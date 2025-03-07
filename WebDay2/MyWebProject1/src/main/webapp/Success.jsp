<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  import="com.bean.MyUser"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Success</h1>
	<%--
		MyUser myUser= (MyUser) request.getAttribute("myuser");
		out.println("User is "+myUser.getUser() +"<br>");
		out.println("Email is "+myUser.getEmail());
	
	--%>
	
	<%
		MyUser myUser= (MyUser) session.getAttribute("myuser");
		out.println("User is "+myUser.getUser() +"<br>");
		out.println("Email is "+myUser.getEmail());
	
	%>
	
	<a href="NextPage.jsp">Next</a>

	
</body>
</html>