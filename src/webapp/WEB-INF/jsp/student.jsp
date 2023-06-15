<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Form</title>
</head>

<link href="https://cdn.datatables.net/1.10.25/css/dataTables.bootstrap5.min.css" rel="stylesheet">

<body>

	<h1>Student Form</h1>

	<form action="submit-student" method="POST">


		<label for="id"> Id:</label> 
		<input type=text id="id" name="id"
			required>
			<br><br><label for="name"> Name:</label> <input type="text" id="name"
			name="name" required><br> <br> <label for="age">
			Age:</label> <input type="text" id="age" name="age" required><br>
		<br> <label for="rollno"> RollNo:</label> <input type="text"
			id="rollno" name="rollno" required><br> <br>
			<label for="address"> Address:</label> <input type="text" id="adress"
			name="address" required> <br> <br> 
			 <label for="father's name"> Father's Name:</label> <input type="text"
			id="father's name" name="father's name" required> <br> <br > 
			<label for="school's name"> School's Name:</label> <input type="text"
			id="school's name" name="school's name" required> <br> <br>
			<label for="phoneno"> PhoneNo:</label> <input type="text" id="phoneno"
			name="phoneno" required> <br> <br> <input
			type="submit">
		</form>
		<br/>
	<hr/>

	<table id="studentTable" style="width:100%">
		<thead>
			<tr>
			<th>Id</th>
				<th>Name</th>
				<th>Age</th>
				<th>RollNo</th>
				<th>Address</th>
				<th>Father's Name</th>
				<th>School's Name</th>
				<th>PhoneNo</th>
			</tr>
		</thead>
		
		<%-- Assume that "students" is a list of objects passed from the servlet --%>
		<%-- <%
		for (Student student : students) {
		%> --%>
		<tr style="text-align:center">
		
		<td>
				<%-- <%=student.getId()%> --%>adjfjfn
			</td>
			<td>
			<%-- <%=student.getName()%> --%>hdjiuf
			</td>
			<td>
				<%-- <%=student.getAge>()% --%>asdfjn
			</td>
			<td>
				<%-- <%=student.getRollNo()%> --%>dsafs
				</td>
			<td>
				<%-- <%=student.getAddress()%> --%>asdfds
			</td>
			<td>
				<%-- <%=student.getFather's Name()%> --%>sadfdsf
			</td>
			<td>
				<%-- <%=student.getSchool's Name()%> --%>asdfdsf
			</td>
			<td>
				<%-- <%=student.getPhoneNo()%> --%>asdjfj
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
			
			$("#studentTable").DataTable({});

		})
	</script>
</body>
</html>

		
		
	
