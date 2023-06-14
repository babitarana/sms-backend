package com.sms.student.teacher;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Data
@Entity
@Table
public class Teacher {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer teacherId;
	
	private String name;
	private String address;
	private int age;
	private String phoneNo;
	private String subject;
	private String email;
	
}
