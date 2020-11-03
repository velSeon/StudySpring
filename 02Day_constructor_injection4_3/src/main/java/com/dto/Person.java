package com.dto;

public class Person {

	private String name;
	private int age;
	private String gender;
	private Cat cat;
	
	
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
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



	public String getGender() {
		return gender;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}



	public Cat getCat() {
		return cat;
	}



	public void setCat(Cat cat) {
		this.cat = cat;
	}



	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + ", cat=" + cat + "]";
	}



	public Person(String name, int age, String gender, Cat cat) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.cat = cat;
	}



	public String getInfo() {
		return name+"\t"+age+"\t"+gender+"\t"+cat.getCatInfo();
	}
	
	
}
