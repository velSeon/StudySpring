package com.dto;


import java.util.Set;

public class Student {
	
	private String name;
	private int age;
	private Set<Cat> setCat;

	public String getInfo() {
		return name +"\t"+age+"\t"+getSetCat();
	}


	public void setName(String name) {
		System.out.println("setName호출=====");
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}


	public Set<Cat> getSetCat() {
		return setCat;
	}


	public void setSetCat(Set<Cat> setCat) {
		this.setCat = setCat;
	}





	
	
	
	
}
