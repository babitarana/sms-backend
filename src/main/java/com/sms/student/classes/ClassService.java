package com.sms.student.classes;

import java.util.List;
import java.util.Optional;

public interface ClassService {

	List<Class> findAll();
	
	Optional<Class> findById(Integer id);
	
	void save(Class schoolClass);
	
	void delete(Class schoolClass);
	
//	<Class> getAllClasses();
//
//	    Class getClassByName(String className);
//	    Class createClass(Class classObj);
//
//	    Class updateClass(String className, Class classObj);
//
//	    boolean deleteClass(String className);
	}


