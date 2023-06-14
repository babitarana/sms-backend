package com.sms.student.courses;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseRepo courseRepo;

	public CourseServiceImpl(CourseRepo courseRepo) {
		this.courseRepo = courseRepo;
	}

	@Override
	public List<Course> getAllCourses() {
		return courseRepo.findAll();
	}

	@Override
	public Optional<Course> getCourseByCourseCode(Integer courseId) {
		return courseRepo.findById(courseId);

	}

	@Override
	public Course createCourse(Course course) {
		return courseRepo.save(course);
	}

	
	@Override
	public void updateCourse(Integer courseId, Course course) {
		course.setCourseId(courseId);
		courseRepo.save(course);
	}

	@Override
	public boolean deleteCourse(Integer courseId) {
		Course optionalCourse = courseRepo.findByCourseId(courseId);
		if (optionalCourse!=null) {
			courseRepo.deleteById(optionalCourse.getCourseId());
			return true;
		}
		return false;
	}
}
