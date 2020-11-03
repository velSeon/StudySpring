package com.dto;



public class Student {

	private String name;
	private int age;
	private Cat cat;
	public Student(String name, int age, Cat cat) {
		super();
		this.name = name;
		this.age = age;
		this.cat = cat;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", cat=" + cat + "]";
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
	public Cat getCat() {
		return cat;
	}
	public void setCat(Cat cat) {
		this.cat = cat;
	}
	

	 

}
