package com.sms.student.classes;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassRepo  extends JpaRepository<Class, Integer> { 
	
	@Query("")
	Class findByClassName(String s);
	
}
