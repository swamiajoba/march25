<%@page import="com.bean.MyUser" %>
<html>
<body>
<%-- using JSP std tags--%>
<jsp:useBean id="a" class="com.bean.MyUser" scope="page" />
<%-- <% MyUser a=new MyUser();%> --%>   <%-- id=object variable name --%>

<jsp:setProperty name="a" property="uid" param="uid" />
<%-- a.setUid(request.getParameter("uid") --%>
<%-- name=object, property=set() param=parameter name--%>

<jsp:setProperty name="a" property="password" param="pass"/>
<%-- a.setPassword(request.getParameter("pass") --%>

name: <jsp:getProperty name="a" property="uid"/>
 <%-- <%=a.getUid()%>--%>

 password:<jsp:getProperty name="a" property="password"/>
 <%-- <%=a.getPassword()%>--%>
 
 <hr>
 <%--
 name: <h3>${a.uid}</h3>
 password:<h3>${a.password}</h3>
 --%>
 </body>
 </html>
 
 
 
 
 
 
 
 
 