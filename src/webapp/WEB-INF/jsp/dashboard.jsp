<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>School Management System Dashboard</title>
  <link rel="stylesheet" type="text/css" href="/dashboard.css">
</head>
<body id="dashboard">

	<header>
    <h1>School Management System</h1>
  </header>

  <nav>
    <ul>
      <li><a href="/api/dashboard" class="active">Dashboard</a></li>
      <li><a href="/api/student/registration-form">Students</a></li>
      <li><a href="/api/teacher/teacher-form">Teachers</a></li>
      <li><a href="/api/course">Courses</a></li>
      <li><a href="/api/record-form">Classes</a></li>
      <li><a href="/api/register-form">Attendance</a></li>
      <li><a href="/api/record-form"> School Reports</a></li>
    </ul>
  </nav>

  <section>
    <h2>Dashboard Overview</h2>
    <!-- Your dashboard content goes here -->
  </section>

  <footer>
    <p>&copy; 2023 School Management System. All rights reserved.</p>
  </footer>

</body>
</html>



