package com.dto;

public class Student {
	
	private String name;
	

	public String getInfo() {
		return name +"\t";
	}

	public void setName(String name) {
		System.out.println("setName호출=====");
		this.name = name;
	}
	
	
	
}
