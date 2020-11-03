package com.dto;



public class Student {
	
	private String name;
	private int age;
	//init-method:초기화작업
	public void aaa() {
		System.out.println("init-method.aaa");
		this.name="홍길동";
	}

	public Student() {
		System.out.println("기본생성자호출");
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return this.name;
	}
	//destroy-method : 자원 반납
	public void bbb() {
		System.out.println("destroy-method.bbb");
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
	

}
