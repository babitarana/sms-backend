package com.sms.student.courses;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;


public interface CourseService {
	
	List<Course> getAllCourses();
	
	Optional<Course> getCourseByCourseCode(Integer courseId);

	Course createCourse(Course course);

	void updateCourse(Integer courseId, Course courseDetails);

	boolean deleteCourse(Integer courseId);

}
