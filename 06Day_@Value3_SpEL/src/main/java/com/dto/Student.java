package com.dto;



public class Student {

	private String name;
	private int age;
	private boolean married;
	private double weigit;
	
	public Student(String name, int age, boolean married, double weigit) {
		super();
		this.name = name;
		this.age = age;
		this.married = married;
		this.weigit = weigit;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", married=" + married + ", weigit=" + weigit + "]";
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
	public double getWeigit() {
		return weigit;
	}
	public void setWeigit(double weigit) {
		this.weigit = weigit;
	}
	
	
	
	
	

	 

}
