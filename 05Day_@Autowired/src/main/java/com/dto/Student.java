package com.dto;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
	
	private String name;
	private int age;
	
	@Autowired
	private Cat cat;
	//멤버
	
	
	public Student() {
		System.out.println("기본생성자호출");
		// TODO Auto-generated constructor stub
	}
	public Student(Cat cat) {
		System.out.println("cat======");
		this.cat = cat;
	}
	
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return this.name;
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
	
	
	 public String getInfo() { 
		 
		 return "Student [name=" + name + ", age=" + age + "cat="+cat.getCatInfo()+"]";
				 
	 }
	 

}
