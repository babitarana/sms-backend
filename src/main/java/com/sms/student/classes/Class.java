package com.sms.student.classes;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Data
@Entity
@Table
public class Class {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int classId;
	private String className;
    private String teacherName;
    private int numberOfStudents;

}
