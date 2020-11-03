package com.dto;

public class Student {
	private String name;
	private int age;
	private Cat cat; // has a 표현

	public Student(String name, int age, Cat cat) {
		this.name = name;
		this.age = age;
		this.cat = cat;
	}
	
	public String getInfo() {
		return name +"\t"+age+"\t"+cat.getCatInfo();
	}
	
	public Cat getCat() {
		return cat;
	}

	
}
