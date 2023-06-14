package com.sms.student;

import java.util.List;

public class Year {
private int yearNumber;
private int schoolClass;

public int getYearNumber() {
	return yearNumber;
}
public void setYearNumber(int yearNumber) {
	this.yearNumber = yearNumber;
}
public int getSchoolClasses() {
	return schoolClass;
}
public void setSchoolClasses(int schoolClasses) {
	schoolClasses = schoolClass;
}

public void displayYearInfo() {
System.out.println("year Number:"+ yearNumber);
System.out.println("school Classes:"+ schoolClass);
}
}