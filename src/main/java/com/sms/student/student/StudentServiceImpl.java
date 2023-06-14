package com.sms.student.student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
@Service
public class StudentServiceImpl implements StudentService {
	
//	@Override
//	public Student createStudent(Student student) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//	
//	@Override
//	public boolean deleteStudent(Integer id) {
//		// TODO Auto-generated method stub
//		return false;
//	}  
//	
//	@Override
//	public List<Student> getAllStudents() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//	
//@Override
//	public Student getStudentById(Integer id) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//@Override
//public Student saveStudent(Student student) {
//	// TODO Auto-generated method stub
//	return null;
//}
//
//@Override
//public Student updateStudent(Integer id, Student student) {
//	// TODO Auto-generated method stub
//	return null;
//}



	
	@Autowired
	private StudentRepo studentRepo;
	
	@Override
	public Student createStudent(Student student) {
		return studentRepo.save(student);
	}
	
	@Override
	public boolean deleteStudent(Integer id) {
        Student existingStudent = studentRepo.findById(id).orElse(null);
        if (existingStudent != null) {
            studentRepo.delete(existingStudent);
            return true;
        }
        return false;
	}
	
	@Override
	public List<Student> getAllStudents() {
		return studentRepo.findAll();
	}
	
	@Override
	public Student getStudentById(Integer id) {
    	return studentRepo.findById(id).orElseGet(null);
	}
	
	@Override
	public Student saveStudent(Student student) {
		return studentRepo.save(student);
	}
	
	@Override
	public Student updateStudent(Integer id, Student student) {
        Student existingStudent = studentRepo.findById(id).orElse(null);
        if (existingStudent != null) {
            existingStudent.setName(student.getName());
            existingStudent.setAge(student.getAge());
            return studentRepo.save(existingStudent);
        }
        return null;
	}
	
	public StudentServiceImpl() {
		// TODO Auto-generated constructor stub
	}
}
