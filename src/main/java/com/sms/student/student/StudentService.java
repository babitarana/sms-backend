package com.sms.student.student;

import java.util.List;

public interface StudentService {
	
	List<Student>getAllStudents();
	
	Student saveStudent(Student student);
	Student getStudentById(Integer id);
	Student createStudent(Student student);
	Student updateStudent(Integer id, Student student);
	boolean deleteStudent(Integer id);

}
