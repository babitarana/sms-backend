package com.sms.student.teacher;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherServiceImpl implements TeacherService {

	@Autowired
	private TeacherRepo teacherRepo;

	
	@Override
	public Teacher saveTeacher(Teacher teacher) {
		return teacherRepo.save(teacher);
	}

	@Override
	public List<Teacher> getAllTeachers() {
		return teacherRepo.findAll();
	}

	@Override
	public Teacher getTeacherById(Integer teacherId) {
		
		return teacherRepo.findById(teacherId).orElseGet(null);
	}

	@Override
	public Teacher addTeacher(Teacher teacher) {
		return teacherRepo.save(teacher);
	}

	@Override
	public Teacher updateTeacher(int id, Teacher updatedTeacher) {
		Teacher existingTeacher = teacherRepo.findById(id).orElse(null);
		if (existingTeacher != null) {
			existingTeacher.setName(updatedTeacher.getName());
			existingTeacher.setSubject(updatedTeacher.getSubject());
			return teacherRepo.save(existingTeacher);
		}
		return null;
	}

	public boolean deleteTeacher(int id) {
		if (teacherRepo.existsById(id)) {
			teacherRepo.deleteById(id);
			return true;
		}

		return false;
	}
}