package com.sms.student;

public class Class {
	private String classId;
	private String className;
	private String classTeacher;
	private String students;
	
	public String getClassId() {
		return classId;
	}
	public void setClassId(String classId) {
		this.classId = classId;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	
	public String getClassTeacher() {
		return classTeacher;
	}
	public void setClassTeacher(String classTeacher) {
		this.classTeacher = classTeacher;
	}
	public String getStudents() {
		return students;
	}
	public void setStudents(String students) {
		this.students = students;

	}
	public void displayClassIfo() {
		System.out.println("Class ID:"+ classId);
		System.out.println("Class Name:"+ className);
		System.out.println("class Teacher:"+ classTeacher);
		System.out.println("students:"+students);
	}
	
}
