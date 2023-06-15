<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Attendance Form</title>
</head>
<body>
<h1>Attendance Form</h1>

    <form method="post" action="Attendance.php">
<label for="attendanceId">Attendance Id:</label> <input type="text"
			name="attendenceId" id="attendanceId" required> <br> <br> 

		<label for="studentId">Student Id:</label> <input type="text"
			name="studentId" id="studentId" required> <br> <br> 
			
			<label for="date">Date:</label> <input type="text"
			name="date" id="date" required> <br> <br> 
			<label
			for="attendanceStatus">Attendance Status:</label> <select
			name="attendanceStatus" id="attendanceStatus" required>
			<br><br><option value="Present">Present</option>
			<option value="Absent">Absent</option>
		</select> <input type="submit" value="Submit">
	</form>

</body>
</html>