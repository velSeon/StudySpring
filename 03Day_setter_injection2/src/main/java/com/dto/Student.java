package com.dto;

public class Student {
	
	private String name;
	private int age;

	public String getInfo() {
		return name +"\t"+age;
	}

	public void setAge(int a) {
		System.out.println("setAge호출=====");
		this.age = a;
	}

	public void setName(String name) {
		System.out.println("setName호출=====");
		this.name = name;
	}
	
	
	
}
