<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Form</h1>
	<form method="post" action="DemoServlet">
		Enter your name <input type="text" name="user"> <br>
						<input type="hidden" name="email" value="admin@abc.com">
		<input type="Submit" value="submit">
	</form>
</body>
</html>