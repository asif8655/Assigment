package com.first.assigment.entity;

import org.springframework.stereotype.Component;


public class Student {
	
	private int studentRollNo;
	
	private String studentName;
	
	private String studentClass;
	
	

	public Student() {
		super();
	}

	public Student(int studentRollNo, String studentName, String studentClass) {
		super();
		this.studentRollNo = studentRollNo;
		this.studentName = studentName;
		this.studentClass = studentClass;
	}

	

	@Override
	public String toString() {
		return "Student [studentRollNo=" + studentRollNo + ", studentName=" + studentName + ", studentClass="
				+ studentClass + "]";
	}
	
	
	

}
