package com.sms.student.courses;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/courses")
public class CourseApiController {

	@Autowired
	private CourseService courseService;

	public CourseApiController(CourseService courseService) {
		this.courseService = courseService;
	}
	@GetMapping("/all-courses")
	public ResponseEntity<List<Course>>getAllCourse(){
		List<Course> course = courseService.getAllCourses();
		return new ResponseEntity<>(course, HttpStatus.OK);
		
	}

	@GetMapping("/{courseId}")
	public ResponseEntity<Course> getCourseByCode(@PathVariable("courseId") Integer courseId) {
		Course course = courseService.getCourseByCourseCode(courseId).get();
		
		if (course != null) {
			return new ResponseEntity<>(course, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	} 

	@PostMapping("/save")
	public ResponseEntity<Course> createCourse(@RequestBody Course course) {
		Course createdCourse = courseService.createCourse(course);
		return new ResponseEntity<>(createdCourse, HttpStatus.CREATED);
	}

	@PutMapping("/{courseId}")
	public ResponseEntity<Course> updateCourse(@PathVariable("courseId")Integer courseId, @RequestBody Course course) {
		courseService.updateCourse(courseId, course);
		return new ResponseEntity<Course>(HttpStatus.OK);
	}

	@DeleteMapping("/{courseId}")
	public ResponseEntity<?> deleteCourse(@PathVariable("courseId") Integer courseId) {
		boolean deleted = courseService.deleteCourse(courseId);
		if (deleted) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
}