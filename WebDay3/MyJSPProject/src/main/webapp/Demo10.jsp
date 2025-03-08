
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import = "com.bean.Counter" %>

Beans Demo
<hr>

<jsp:useBean  id="x" class="com.bean.Counter"  scope="request" />
<jsp:setProperty name="x" property="count" value="100"  />
<jsp:getProperty name="x" property="count"  />
<jsp:forward page="Demo11.jsp"/>

<%--
        // first time
        Counter  x=(Counter)reauest.getAttribute("x");
             if above is null then
           Counter x=new Counter();
           x.setCount(value);
            x.getCount();
            request.setAttribute("x",x);
--%>












