<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Class Information Form</title>
</head>
<link href="https://cdn.datatables.net/1.10.25/css/dataTables.bootstrap5.min.css" rel="stylesheet">

<body>
<h1> Class Information form</h1>

	<form action="classForm.jsp" method="post">
		<label for="className">Class Name:</label> <input type="text"
			name="className" id="className" required> <br> <br> <label for="number
		of student">Number of Student:</label> <input type="number"
			name="numberofstudent" id="numberofstudent" required> <br> <br> <label
			for="classSize">Class Size:</label> <input type="number"
			name="classSize" id="classSize" required> <br> <br> <label
			for="classSection"> Class Section</label> <input type="text"
			name="classSection" id="classSection" required> <br> <br> <label
			for="classTeacher"> Class Teacher</label> <input type="text"
			name="classTeacher" id="classTeacher" required> <br> <br> <input
			type="submit">

	</form>
	<br/>
	<hr/>

	<table id="classTable" style="width:100%">
		<thead>
			<tr>
			<th>Class Name</th>
				<th>Class Size</th>
				<th>Class Section</th>
				<th>CLass Teacher</th>
				
			</tr>
		</thead>
		
		<%-- Assume that "classes" is a list of objects passed from the servlet --%>
		<%-- <%
		for (Class class : classes) {
		%> --%>
		<tr style="text-align:center">
		
		<td>
				<%-- <%=class.getClass Name()%> --%>adjfjfn
			</td>
			<td>
			<%-- <%=class.getCLass Size()%> --%>hdjiuf
			</td>
			<td>
				<%-- <%=class.getClass Section>()% --%>asdfjn
			</td>
			<td>
			<%-- <%=class.getClass Teacher>()% --%>ajkdj
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
			
			$("#classTable").DataTable({});

		})
	</script>
</body>
</html>