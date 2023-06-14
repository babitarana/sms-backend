package com.sms.student;

public class Subject {
	private String subjectCode;
	private String subjectName;
	private int creditHours;
	
	public String getSubjectCode() {
		return subjectCode;
	}
	public void setSubjectCode(String subjectCode) {
		this.subjectCode = subjectCode;
	}
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public int getCreditHours() {
		return creditHours;
	}
	public void setCreditHours(int creditHours) {
		this.creditHours = creditHours;
	}
	
	public void displaySubjectInfo() {
		System.out.println("Subject Code: " + subjectCode);
		System.out.println("Subject Name: " + subjectName);
		System.out.println("Credit Hour:" + creditHours);
	}
	
	

}
