package com.sms.student;

import java.util.List;

import com.sms.student.student.Student;

public class Section {
	private String sectionId;
	private String sectionName;
	private List<Student> students;
	
	
	public String getSectionId() {	
		return sectionId;
	}
	public void setSectionId(String sectionId) {
		this.sectionId = sectionId;
	}
	public String getSectionName() {
		return sectionName;
	}
	public void setSectionName(String sectionName) {
		this.sectionName = sectionName;
	}
	public void displaySectionInfo() {
		System.out.println("Section ID:" + sectionId);
		System.out.println("Section Name:" + sectionName);
		System.out.println("Student:"+ students.size() );
	}
	}
		
	
