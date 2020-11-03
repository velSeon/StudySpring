package com.dto;

import java.util.List;

public class Student {
	
	private String name;
	private int age;
	private Cat cat;
	private List<Cat> listCat;

	public String getInfo() {
		return name +"\t"+age+"\t"+getListCat();
	}


	public void setName(String name) {
		System.out.println("setName호출=====");
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}


	public List<Cat> getListCat() {
		return listCat;
	}


	public void setListCat(List<Cat> listCat) {
		this.listCat = listCat;
	}


	
	
	
	
}
