<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import = "com.bean.Counter" %>

Beans Demo
<hr>


<jsp:useBean  id="x" class="com.bean.Counter"  scope="request" />
<jsp:setProperty name="x" property="count"  />
<jsp:getProperty name="x" property="count"  />
<%-- 
            next time  it does fillowing
			Counter  x=(Counter)request.getAttribute("x");
			x.setCount(value)
             x.getCount();
             request.setAttribute("x",x);
             
             --%>


<%--



<hr> Request Scope EL 
${requestScope.x.count}

<hr>Session Scope EL
${sessionScope.x.count}

<hr>  Application Scope EL
${applicationScope.x.count}
<hr>


${1+2*4} <br>
${(1+2)*4} <br>
${32 mod 4 } <br>
<hr>
${1 > 4} <br>
${4 eq 5} <br>
${4 == 5} <br>
${4 != 5} <br>

--%>


