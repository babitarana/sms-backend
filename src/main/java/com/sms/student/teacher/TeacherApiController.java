package com.sms.student.teacher;

import java.util.Arrays;
import java.util.List;

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

@Controller
@RequestMapping("/api/teacher")
public class TeacherApiController {

	@Autowired
	private TeacherService teacherService;

	public TeacherApiController(TeacherService teacherService) {
		this.teacherService = teacherService;
	}

	@PostMapping("/save")
	public ResponseEntity<?> saveTeacher(@RequestBody Teacher teacher) throws Exception {
		System.out.println("Welcome");

		teacherService.saveTeacher(teacher);
		return new ResponseEntity<String>("Success", HttpStatus.OK);
	}

	@GetMapping("/get")
	public @ResponseBody List<String> getAll() {
		return Arrays.asList("Sanjit", "Santosh");
	}

	@GetMapping
	public ResponseEntity<List<Teacher>> getAllTeacher() {
		List<Teacher> teachers = teacherService.getAllTeachers();
		return new ResponseEntity<>(teachers, HttpStatus.OK);
	}

	@GetMapping("/get-by-id/{teacherId}")
	public ResponseEntity<Teacher> getTeacherById(@PathVariable("teacherId") Integer teacherId) {
		
		Teacher teacher = teacherService.getTeacherById(teacherId);
		System.out.println("Teacher Id:"+ teacherId);
		System.out.println("Teacher get: "+ teacher);
		if (teacher != null) {
			return new ResponseEntity<>(teacher, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}

	}

	@PostMapping
	public ResponseEntity<Teacher> addTeacher(@RequestBody Teacher teacher) {
		Teacher createdTeacher = teacherService.addTeacher(teacher);
		return new ResponseEntity<>(createdTeacher, HttpStatus.CREATED);
	}

	@PutMapping("/update")
	public ResponseEntity<Teacher> updateTeacher(int id, Teacher teacher) {
		Teacher updateTeacher = teacherService.updateTeacher(id, teacher);
		if (updateTeacher != null) {
			return new ResponseEntity<>(updateTeacher, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@DeleteMapping("{/id}")
	public ResponseEntity<?> deleteTeacher(@PathVariable("id") int id) {
		boolean delete = teacherService.deleteTeacher(id);
		if (delete) {
			return new ResponseEntity<>(HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);

		}

	}

}
