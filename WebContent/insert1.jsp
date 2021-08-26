<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="java.util.ArrayList"%>
<%@page import="hiber1.model"%>
<%@page import="java.util.List"%>
<h1>One to many Insert page</h1>
<form action="insert" method="post">
	<input type="hidden" name="i" value="3">
	 Name<input type="text" name="uname" placeholder="enter user name"><br>
	 Mobile_number<input type="number" name="mno" placeholder="enter mobile number"><br>
	 name<select name="id">
	 <option>select name</option>
		<%
			List<model> l=(ArrayList)request.getAttribute("list");
			if(l!=null){
				for(model m:l){
					%>
					<option value="<%=m.getId()%>"> <%=m.getFname()%> </option>
					<% 
				}
			}
		%> 
	 </select><br>
	 <input type="submit" value="Submit">&nbsp;&nbsp;
	 <input type="reset" value="Reset">
</form>