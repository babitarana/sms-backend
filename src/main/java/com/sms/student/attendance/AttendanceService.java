package com.sms.student.attendance;



public interface AttendanceService {
	Attendance saveAttendance(Attendance attendance);
	Attendance getAttendanceById(Integer id);
	void deleteAttendanceById(Integer id);
	
	

}
