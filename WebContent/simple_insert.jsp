<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<form action="insert" method="post">
<input type="hidden" name="i" value=4>
<input type="hidden" name="id" value="${list.id }"> 
Name:<input type="text" name="name" value="${list.name }">
No:<input type="number" name="mno" value="${list.no }"> 
<input type="submit" value="Submit">
<input type="reset" value="Reset">
</form>