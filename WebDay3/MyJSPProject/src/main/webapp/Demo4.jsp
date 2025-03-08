<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  errorPage="MyErrorpage.jsp"  isErrorPage="false"%>
<!DOCTYPE html >
<html>
<head>
<title>Insert title here</title>
</head>
<body>
<h1>
<%-- 
			<%   String name=request.getParameter("t1");
				 String fruits[] = request.getParameterValues("c1");
			%>
		Name is  <%=name %> Expression tag<br>
		Name is <%out.println(name); %> <br>
		<hr>
			<%
				for(int i=0;i<fruits.length;i++)
				{
					out.println(fruits[i] +"<br>");
				}
			%>
	</h1>
	--%>		 
	<hr>


	<h1>Expression Language EL</h1>		
${param.t1}  <br>

${paramValues.c1[0]} <br>
${paramValues.c1[1]} <br>
${paramValues.c1[2]}<br>
${paramValues.c1[3]}<br>











</h1>
</body>
</html>