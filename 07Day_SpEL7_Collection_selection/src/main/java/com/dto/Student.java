package com.dto;



public class Student {

	private String name;
	private int age;
	private boolean married;
	private double weight;
	public Student(String name, int age, boolean married, double weight) {
		super();
		this.name = name;
		this.age = age;
		this.married = married;
		this.weight = weight;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", married=" + married + ", weight=" + weight + "]";
	}
	public String xxx() {
		return "HongKilDong";
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
	public boolean isMarried() {
		return married;
	}
	public void setMarried(boolean married) {
		this.married = married;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	
	
	
	

	 

}
