package com.sms.student.student;

import java.util.Arrays;
import java.util.List;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sms.student.teacher.Teacher;

@Controller
@RequestMapping("/api/student")
public class StudentApiController {
	
	    @Autowired
	    private  StudentService studentService;

	 
	    public StudentApiController(StudentService studentService) {
	        this.studentService = studentService;
	    }
	    
	    @PostMapping("/save")
	    public ResponseEntity<?> saveStudent(@RequestBody Student student)throws Exception{
	    	System.out.println("something else");
	    	
	    	studentService.saveStudent(student);
	    	return new ResponseEntity<String>("Success", HttpStatus.OK);
	    	
//	    	@GetMapping("/get")
//	    	public @ResponseBody List<String> getAll() {
//	    		return Arrays.asList("Ram", "Hari");
	   
	    }

	    @GetMapping
	    public ResponseEntity<List<Student>> getAllStudents() {
	        List<Student> students = studentService.getAllStudents();
	        return new ResponseEntity<>(students, HttpStatus.OK);
	    }

	    @GetMapping("/get-by-id/{studentId}")
	    public ResponseEntity<Student> getStudentById(@PathVariable ("student")Integer studentId) {
	        Student student = studentService.getStudentById(studentId);
	        System.out.println("Student Id:"+ studentId);
			System.out.println("Student get: "+ student);
	        if (student != null) {
	            return new ResponseEntity<>(student, HttpStatus.OK);
	        } else {
	            return new ResponseEntity<>(student, HttpStatus.NOT_FOUND);
	        }
	    }

	    @PostMapping
	    public ResponseEntity<Student> createStudent(@RequestBody Student student) {
	        Student createdStudent = studentService.createStudent(student);
	        return new ResponseEntity<>(createdStudent,HttpStatus.CREATED);
	    }

	    @PutMapping("update/{id}")
	    public ResponseEntity<Student> updateStudent(@PathVariable("id") Integer id, @RequestBody Student student) {
	        Student updatedStudent = studentService.updateStudent(id, student);
	        if (updatedStudent != null) {
	            return new ResponseEntity<>(HttpStatus.OK);
	        } else {
	            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	        }
	    }

	    @DeleteMapping("deleteStudent/{id}")
	    public ResponseEntity<?> deleteStudent(@PathVariable("id")Integer id) {
	        boolean deleted = studentService.deleteStudent(id);
	        if (deleted) {
	            return new ResponseEntity<>(HttpStatus.OK);
	        } else {
	            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	        }
	    }
	}