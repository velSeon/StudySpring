package com.dto;

public class Student {
	private String name;
	private int age;
	public Student (int age) {
		this.age = age;
	}
	public Student (String name) {
		this.name = name;
	}
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getInfo() {
		return name +"\t"+age;
	}
	

	
}
