package com.sms.student.attendance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AttendanceServiceImpl implements AttendanceService {
	
	 @Autowired
	private AttendanceRepo attendancerepo;

     public AttendanceServiceImpl(AttendanceRepo attendanceRepo) {
        this.attendancerepo = attendanceRepo;
    }

    @Override
    public Attendance saveAttendance(Attendance attendance) {
        return attendancerepo.save(attendance);
    }

   @Override
    public Attendance getAttendanceById(Integer id) {
        return attendancerepo.findById(id).orElse(null);
    }
    
    @Override
    public void deleteAttendanceById(Integer id) {
    	attendancerepo.deleteById(id);
    
    }
}