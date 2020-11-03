package com.dto;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

public class Student {
	@Value("홍길동")
	private String name;
	@Value("10")
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	

	 

}
