<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.bean.MyUser"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		MyUser myUser= (MyUser) session.getAttribute("myuser");
		out.println("User is "+myUser.getUser() +"<br>");
		out.println("Email is "+myUser.getEmail());
		
		// expire the session
		
		session.invalidate();
	%>
</body>
</html>