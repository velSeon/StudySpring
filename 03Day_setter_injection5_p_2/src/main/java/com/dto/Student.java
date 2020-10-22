package com.dto;

public class Student {
	
	private String name;
	private int age;
	private Cat cat;

	public String getInfo() {
		return name +"\t"+age+"\t"+cat.getCatInfo();
	}


	public void setName(String name) {
		System.out.println("setName호출=====");
		this.name = name;
	}



	public void setAge(int age) {
		this.age = age;
	}


	public void setCat(Cat cat) {//cat 주입 setXXX 함수
		this.cat = cat;
	}
	
	
	
	
}
