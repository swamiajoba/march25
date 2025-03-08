<%@ page language="java"  %>
<%@ page import = "com.bean.Counter" %>

Beans Demo
<hr>

<jsp:useBean  id="x" class="com.bean.Counter" scope="application"/>
<jsp:setProperty name="x" property="count" />  <%--setCount(0) --%>
<jsp:getProperty name="x" property="count"  /><br><%--getCount() --%>
<br>
Count is
${applicationScope.x.count }  
