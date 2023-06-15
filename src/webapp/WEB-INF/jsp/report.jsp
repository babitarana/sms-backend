<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>School Record Form</title>
</head>

<link href="https://cdn.datatables.net/1.10.25/css/dataTables.bootstrap5.min.css" rel="stylesheet">

<body>
<h1>School Record Form</h1>
    
    <form action="record.jsp" method="post">

		<label for="studentName">Student Name:</label> <input type="text"
			name="studentName" id="studentName" required><br> <br> <label
			for="grade">Grade:</label> <input type="text" name="grade"
			id="grade" required><br> <br> <label for="address">Address:</label>
		<input type="text" name="address" id="address" required> <br> <br> <label
			for="contactNumber">Contact Number:</label> <input type="text"
			name="contactNumber" id="contactNumber" required><br> <br>
			 <input type="submit">
			 </form>
	<br/>
	<hr/>

	<table id="recordTable" style="width:100%">
		<thead>
			<tr>
			<th>Student Name</th>
				<th>Grade</th>
				<th>Address</th>
				<th>ContactNo</th>
				
			</tr>
		</thead>
		
		<%-- Assume that "records" is a list of objects passed from the servlet --%>
		<%-- <%
		for (Record record : record) {
		%> --%>
		<tr style="text-align:center">
		
		<td>
				<%-- <%=record.getStudent Name()%> --%>adjfjfn
			</td>
			<td>
			<%-- <%=record.getGrade()%> --%>hdjiuf
			</td>
			<td>
				<%-- <%=record.getAddress>()% --%>asdfjn
			</td>
			<td>
				<%-- <%=record.getContactNo()%> --%>dsafs
				</td>
			
		</tr>
	</table>
	<%-- <%
	}
	%> --%>
	
	<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
	<script src="https://cdn.datatables.net/1.11.2/js/jquery.dataTables.min.js"></script>
	<script src="https://cdn.datatables.net/1.11.2/js/dataTables.bootstrap5.min.js"></script>

	<script>

		$(document).ready(function() {
			
			$("#recordTable").DataTable({});

		})
	</script>   
</body>
</html>





