package com.sms.student.courses;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepo extends JpaRepository<Course, Integer> {

	@Query("select c from Course c where c.courseId = :courseId")
	Course findByCourseId(@Param("courseId") Integer courseId);

}
