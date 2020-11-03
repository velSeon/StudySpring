package com.dto;

public class Person {
	private String name;
	private int age;
	public Person() {
		System.out.println("person의 기본생성자");
		
		// TODO Auto-generated constructor stub
	}
	public Person(String name, int age) {
		System.out.println("person의 인자있는 기본생성자");
		
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
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
		return "Person [name=" + name + ", age=" + age + "]";
	}
	

}
