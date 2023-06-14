package com.sms.student.teacher;

import java.util.List;

public interface TeacherService {
	
	List<Teacher>getAllTeachers();
	
	Teacher saveTeacher(Teacher teacher);
	Teacher getTeacherById(Integer teacherId);
	Teacher addTeacher(Teacher teacher);
	Teacher updateTeacher(int id, Teacher teacher);
	boolean deleteTeacher(int id);
	}