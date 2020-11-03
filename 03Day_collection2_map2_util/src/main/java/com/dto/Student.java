package com.dto;


import java.util.Map;


public class Student {
	
	private String name;
	private int age;
	private Map<String, Cat> map;

	public String getInfo() {
		return name +"\t"+age+"\t"+getMap();
	}


	public void setName(String name) {
		System.out.println("setName호출=====");
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}


	public Map<String, Cat> getMap() {
		return map;
	}


	public void setMap(Map<String, Cat> map) {
		this.map = map;
	}


	





	
	
	
	
}
