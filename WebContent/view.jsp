<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="java.util.ArrayList"%>
<%@page import="hiber1.model"%>
<%@page import="java.util.List"%>
<table border=1>
	<tr>
		<td>no</td>
		<td>Firstname</td>
		<td>Lastname</td>
	</tr>
	
	<%
		int z=1;
		List<model> l=(ArrayList)request.getAttribute("v");
		if(l!=null)
		{
			for(model m:l)
			{
				%>
				<tr>
				<td><%=z++ %></td>
				<td><%=m.getFname() %></td>
				<td><%=m.getLname() %></td>
				<td><input type="button" onclick="up(<%=m.getId()%>)" value="Update"></td>
				<td><input type="button" onclick="del(<%=m.getId()%>)" value="Delete"></td>
				</tr>
				<%
			}
		}
	%>
	
</table>
<script>
	function up(id){
		window.location.href="file?i=3&id="+id;	
	}
	function del(id){
		window.location.href="insert?i=1&id="+id;	
	}
</script>