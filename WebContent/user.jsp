<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="insert" method="post">
	<input type="hidden" name="i" value=6>
	<input type="hidden" name="id">
	Name:<input type="text" name="username" placeholder="enter name"><br>
	Number:<input type="text" name="usernumber" placeholder="enter name"><br>
	Hobby:<input type="checkbox" name="hobby" value="cricket">:cricket
	<input type="checkbox" name="hobby" value="travel">travel
	<input type="checkbox" name="hobby" value="listen song">listen song
	<br>
	<input type="submit" value="submit">
</form>

<table border="1">
	<thead>
		<tr>
			<th>no</th>
			<th>userName</th>
			<th>Number</th>
			<th>Action</th>
		</tr>
	</thead>
	<tbody>
	<c:if test="${user ne null }">	
		<c:forEach items="${user}" var="d" varStatus="count">
			<tr>
				<td>${count.count}</td>
				<td>${d.uname}</td>
				<td>${d.number}</td>
				<td><button>update</button><button onclick="del(${d.uid})">delete</button></td>
			</tr>
		</c:forEach>
	</c:if>
	</tbody>	
</table>
<form action="insert" method="post">
	<br>
	<input type="hidden" name="i" value=7>
	select Name:<select name="username">
	<c:if test="${user ne null }">	
		<c:forEach items="${user}" var="d" varStatus="count">
			<option value="${d.uid }">${d.uname }</option>
		</c:forEach>
	</c:if>
	</select>
	<br>
	Hobby:<input type="checkbox" name="hobby" value="cricket">:cricket
	<input type="checkbox" name="hobby" value="travel">travel
	<input type="checkbox" name="hobby" value="listen song">listen song
	<br>
	<input type="submit" value="submit">
</form>
</body>
<script>
	function del(id){
		window.location.href="insert?i=2&id="+id;
	//	alert(id);
	}
</script>
</html>
