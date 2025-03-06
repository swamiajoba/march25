<%-- 
    Document   : Login
    Created on : 26 Jul, 2022, 10:56:06 PM
    Author     : manji
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Login Form!</h1>
        <h1>Welcome </h1>
        <pre>
        <form action="LoginServlet.do" method="post">
            Enter Username      <input type="text" name="user" required="true">
            Enter Password      <input type="password" name="pass" required="true">
            <input type="submit" value="Login">
        </form>
        </pre>
    </body>
</html>
