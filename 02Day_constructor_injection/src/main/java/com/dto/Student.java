package com.dto;

public class Student {
	private String name;
//public Student(){}//사용자가 생성자 작성시 기본생성자가 사라짐.
	public Student(String name) {//생성자를 작성
		System.out.println("인자 있는 생성자");
		this.name = name;
	}

	public String getInfo() {
		return this.name;
	}

}
