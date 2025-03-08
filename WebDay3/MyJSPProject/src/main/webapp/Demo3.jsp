<jsp:directive.page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  import="java.time.LocalDateTime"/>

    
<h1>Declaration</h1>
<jsp:declaration>
 	   int res=0;
 		public int add(int a,int b) {
 			return a+b;
 		}
 </jsp:declaration>
 
 <h1>Scriptlets</h1>
 <jsp:scriptlet>  String name="Manjiri";   </jsp:scriptlet>
 
 <h1>Expression</h1>
 <jsp:expression> name </jsp:expression> <br>
 <jsp:expression> add(10,20) </jsp:expression> <br>
  <jsp:expression> LocalDateTime.now() </jsp:expression>
 
 
 
 