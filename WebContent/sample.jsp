<script type="text/javascript" src="js/abc.js"></script>
<script>
var ss=1;
function create() {
	
	var add=document.getElementById('add');
	var append=['<input type="hidden" name="id"><td><input type="text" name="fname"></td><td><input type="text" name="lname"></td><td><input type="button" onclick="removedata(',ss,')" value="Delete"></td>'].join('');
	var cr=document.createElement('tr');
	cr.innerHTML=append;
	cr.id='papa'+ss;
	ss++;
	add.appendChild(cr);
}
function removedata(ass) {
	var add = document.getElementById('add');
	var tt =  document.getElementById('papa'+ass);
	add.removeChild(tt);
}
</script>
<form action="insert" method="post">
<input type="hidden" name="i" value=4>
<table border=1>
	<thead>
		<tr>
			<th>Fname</th>
			<th>Lname</th>
			<th>action</th>
		</tr>
	</thead>
	<tbody id="add">
		
	</tbody>
	<tfoot>
		<tr>
			<td colspan=4><input type="button" value="CREATE" onclick="create()">
			<input type="submit" value="Submit"></td>
		</tr>
	</tfoot>
</table>
</form>