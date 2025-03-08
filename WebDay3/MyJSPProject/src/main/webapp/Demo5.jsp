<%@page language = "Java" buffer = "12kb" %>
<html>
<head>
<title>Employee Information</title>
</head>
<body>
	<jsp:forward page= "Demo5_1.jsp" >
		<jsp:param name="email" value="abc@xyz.com"/>
	</jsp:forward>   	

    <%--
    <jsp:include page= "Demo5_1.jsp" flush="true">
    	<jsp:param name="email" value="abc@xyz.com"/>
    </jsp:include> 
 	 --%>

<hr>
This text is from Demo5.jsp
</body>
</html>




 
