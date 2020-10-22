package com.dto;

public class Student {
	private String name;
	private int age;
	

	public Student(String name, int age) {
		System.out.println("Student 인자있는 기본생성자");
		this.name = name;
		this.age = age;
		
	}
	
	public String getInfo() {
		return name +"\t"+age+"\t";
	}

	public Student() {
	System.out.println("Student 기본생성자");
	}
	
	
	
}
