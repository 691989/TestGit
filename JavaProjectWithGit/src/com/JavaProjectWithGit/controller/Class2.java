package com.JavaProjectWithGit.controller;

public class Class2 {
	
	int rollnumber;
	String studentName;
	static String div="A";
	
	
	Class2(int rollnumber,String studentName){
		this.rollnumber=rollnumber;
		this.studentName=studentName;
	}

	void Division() {
		System.out.println("Class "+div);
		System.out.println("Student Roll Number:"+rollnumber);

		System.out.println("Student Name:"+studentName);
	}
	
	void print(int id,String name) {
		System.out.println(id);
		System.out.println(name);
	}
	
	void print(String surname) {
		System.out.println(surname);
	}
	
	
	
}
