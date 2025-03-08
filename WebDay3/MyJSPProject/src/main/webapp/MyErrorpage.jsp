<%@ page isErrorPage="true"  import = "java.io.*" %>
<html>
<body bgcolor="yellow">

<CENTER>
<H1>JSP ERROR PAGE</H1>
<Table Border="1">
<tr>
	<td>EXCEPTION</TD>
	<TD> <%= exception %></TD> 
</TR>
<TR>
	<TD>MESSAGE </TD>
	<TD><%= exception.getMessage() %> </TD> 
</TR>
</TABLE>
</CENTER>
</body>
</html>
