package com.sms.student.classes;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/classes")
public class ClassApiController {
	
	@Autowired
	private ClassService classService;
	
	 @GetMapping
	 public List<Class> getAllClass(){
		 return classService.findAll();
	 }
	 
	 @GetMapping("/{id}")
	 public ResponseEntity<Class> getClasById(@PathVariable Integer id){
		Optional<Class> optionalClass = classService.findById(id);
		if(optionalClass.isPresent()) {
			return ResponseEntity.ok(optionalClass.get());
			
		} else {
			
			return ResponseEntity.notFound().build();
		}
		 
	 }
	 
	 @PutMapping("/{id}")
	 public ResponseEntity<Class> updateClass(@PathVariable Integer id, @RequestBody Class updatedClass){
		 Optional<Class> optionalClass = classService.findById(id);
		 if(optionalClass.isPresent()) {
			 Class existingClass = optionalClass.get();
			 existingClass.setClassName(updatedClass.getClassName());
			 existingClass.setTeacherName(updatedClass.getTeacherName());
			 existingClass.setNumberOfStudents(updatedClass.getNumberOfStudents());
			 classService.save(existingClass);
			 return ResponseEntity.ok().body(null);
		 }else {
			 return ResponseEntity.notFound().build(); 
		 }
	 }
	 
	 @DeleteMapping("/{id}")
	 public ResponseEntity<?> deleteClass(@PathVariable Integer id){
		 Optional<Class> optionalClass = classService.findById(id);
		 if(optionalClass.isPresent()) {
			 classService.delete(optionalClass.get());
			 return ResponseEntity.noContent().build();
		 }else {
			 return ResponseEntity.notFound().build();
		 }
	 }
	 
//	 @PostMapping("")
//	 public ResponseEntity<Class> createClass(@RequestBody Class newClass){
//		classRepository.save(newClass);
//		return ResponseEntity.status(HttpStatus.CREATED).body(savedCalss);
//	 }
	  
}
