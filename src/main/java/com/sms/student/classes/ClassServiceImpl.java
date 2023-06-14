package com.sms.student.classes;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClassServiceImpl implements ClassService {
	
	@Autowired
	private ClassRepo classRepository;

	@Override
	public List<Class> findAll() {
		return classRepository.findAll();
	}

	@Override
	public Optional<Class> findById(Integer id) {
		return classRepository.findById(id);
	}

	@Override
	public void delete(Class schoolClass) {
		classRepository.delete(schoolClass);
	}

	@Override
	public void save(Class schoolClass) {
		classRepository.save(schoolClass);
	}

//	    @Override
//	    public Class getClassByName(String className) {
//	        return classRepository.findByClassName(className);
//	    }
//
//	    @Override
//	    public Class createClass(Class classObj) {
//	        return classRepository.save(classObj);
//	    }
//
//	    @Override
//	    public Class updateClass(String className, Class classObj) {
//	        Class existingClass = classRepository.findByClassName(className);
//	        if (existingClass != null) {
//	          
//	            existingClass.setTeacherName(classObj.getTeacherName());
//	            existingClass.setNumberOfStudents(classObj.getNumberOfStudents());
//	            return classRepository.save(existingClass);
//	        }
//	        return null; 
//	    }
//
//	    @Override
//	    public boolean deleteClass(String className) {
//	        Class existingClass = classRepository.findByClassName(className);
//	        if (existingClass != null) {
//	            classRepository.delete(existingClass);
//	            return true;
//	        }
//	        return false; 
//	    }

}
