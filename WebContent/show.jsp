<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<table border=1>
	<thead>
		<tr>
			<th>NO</th>
			<th>Name</th>
			<th>Mobile Number</th>
			<th>Action</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${view}" var=d varStatus="count">
			<tr>
				<td>${count.count }</td>
				<td>${d.name }</td>
				<td>${d.no }</td>
				<td><input type="button" value="update" onclick="updatedata(${d.is})"></td>
		</c:forEach>
	</tbody>
</table>
<script>
function updatedata(id) {
	window.location.href="file?i=5&id="+id;
}
</script>