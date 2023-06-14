<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Course form</title>
</head>
<link href="https://cdn.datatables.net/1.10.25/css/dataTables.bootstrap5.min.css" rel="stylesheet">

<body>
<h1>Course Form</h1>

	<form action="submit-course" method="POST">

		<label for="coursecode"> CourseCode:</label> <input type="text"
			name="coursecode" id="coursecode" required><br> <br> <label
			for="coursename"> CourseName:</label> <input type="text"
			name="coursename" id="coursename" required><br> <br> <label
			for="credithour"> CreditHours:</label> <input type="text"
			name="credithours" id="credithours" required><br> <br> <label
			for="name">Instructor:</label> <input type="text" name="instructor"
			id="instructor" required><br> <br> <input type="submit"
			value="Submit">

	</form>
	<br/>
	<hr/>

	<table id="courseTable" style="width:100%">
		<thead>
			<tr>
			<th>Course code</th>
				<th>Course Name</th>
				<th>Course Hours</th>
				<th>Instructor</th>
			</tr>
		</thead>
		
		<%-- Assume that "courses" is a list of objects passed from the servlet --%>
		<%-- <%
		for (Course course : courses) {
		%> --%>
		<tr style="text-align:center">
		
		<td>
				<%-- <%=course.getcoursecode()%> --%>adjfjfn
			</td>
			<td>
			<%-- <%=course.getcousename()%> --%>hdjiuf
			</td>
			<td>
				<%-- <%=course.getcoursehours>()% --%>asdfjn
			</td>
			<td>
				<%-- <%=course.getinstructor>()% --%>asdfjn
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
			
			$("#courseTable").DataTable({});

		})
	</script>
	</body>
</html>