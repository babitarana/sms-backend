
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Teacher form</title>
</head>

	
	<link href="https://cdn.datatables.net/1.10.25/css/dataTables.bootstrap5.min.css" rel="stylesheet">

<body>
	<h1>Teacher Form</h1>

	<form action="submit-teacher" method="POST">


		<label for="name"> Name:</label> <input type="text" id="name"
			name="name" required><br> <br> <label for="email">
			Email:</label> <input type="text" id="email" name="email" required><br>
		<br> <label for="subject"> Subject:</label> <input type="text"
			id="subject" name="subject" required><br> <br> <label
			for="qualification"> Qualification:</label> <input type="text"
			id="qualification" name="qualification" required> <br> <br>

		<label for="experience"> Experience:</label> <input type="text"
			id="experience" name="experience" required> <br> <br>
		<label for="address"> Address:</label> <input type="text" id="adress"
			name="address" required> <br> <br> <label
			for="phoneno"> PhoneNo:</label> <input type="text" id="phoneno"
			name="phoneno" required> <br> <br> <input
			type="submit">
	</form>
	<br/>
	<hr/>

	<table id="teacherTable" style="width:100%">
		<thead>
			<tr>
				<th>Name</th>
				<th>Email</th>
				<th>Subject</th>
				<th>Qualification</th>
				<th>Experience</th>
				<th>Address</th>
				<th>PhoneNo</th>
			</tr>
		</thead>
		
		<%-- Assume that "teachers" is a list of objects passed from the servlet --%>
		<%-- <%
		for (Teacher teacher : teachers) {
		%> --%>
		<tr style="text-align:center">
			<td>
				<%-- <%=teacher.getName()%> --%>sdfsad
			</td>
			<td>
				<%-- <%=teacher.getEmail()%> --%>asdf
			</td>
			<td>
				<%-- <%=teacher.getSubject()%> --%>dsafs
				</td>
			<td>
				<%-- <%=teacher.getQualification()%> --%>asdfds
			</td>
			<td>
				<%-- <%=teacher.getExperience()%> --%>sadfdsf
			</td>
			<td>
				<%-- <%=teacher.getAddress()%> --%>asdfdsf
			</td>
			<td>
				<%-- <%=teacher.getPhoneNo()%> --%>sdfsaf
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

		$(document).ready(function()) {
			
			$("#teacherTable").DataTable({});

		}
	</script>
</body>
</html>










