package com.dto;

public class Student {
	
	private String name;
	private int age;

	public String getInfo() {
		return name +"\t"+age;
	}


	public void setName(String name) {
		System.out.println("setName호출=====");
		this.name = name;
	}


	public void setAge(int age) {
		this.age = age;
	}

	
	
	
	
	
}
