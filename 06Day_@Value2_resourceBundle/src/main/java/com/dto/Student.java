package com.dto;

import org.springframework.beans.factory.annotation.Value;

public class Student {
	@Value("${stu.name}")
	private String name;
	@Value("${stu.age}")
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


	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}

	public void setName(String name) {
		this.name = name;
	}



	public void setAge(int age) {
		this.age = age;
	}

	

	 

}
