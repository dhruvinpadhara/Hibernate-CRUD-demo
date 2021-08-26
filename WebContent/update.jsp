<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<form action="insert" method="post">
<h1>Insert radio</h1>
<input type="hidden" name="i" value=2 />
<input type="hidden" name="id" value="${read.id }">
<input type="text" name="fname" placeholder="enter first name" value="${read.fname}" />
<input type="text" name="lname" placeholder="enter first last" value="${read.lname }" />
<input type="submit" name="Submit" />
<input type="reset" name="Reset" />
</form>