package com.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {
	
	private String name;
	private int age;
	
	
	
	
	public Student() {
		System.out.println("기본생성자호출");
		// TODO Auto-generated constructor stub
	}

	
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}


	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}

	

	 

}
