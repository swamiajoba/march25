<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  import="java.time.LocalDateTime"%>
    
<h1>Declaration</h1>
 <%!    int res=0;
 
 		public int add(int a,int b) {
 			return a+b;
 		}
 %>
 
 <h1>Scriptlets</h1>
 <%  String name="Manjiri";   %>
 
 <h1>Expression</h1>
 <%=name %> <br>
 <%=add(10,20) %> <br>
 <%=LocalDateTime.now() %>
 