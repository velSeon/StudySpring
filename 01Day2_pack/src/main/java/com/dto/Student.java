package com.dto;

public class Student {
private String name;
private int age;
public Student(String name, int age) {
	System.out.println("기본 생성자 호출");
	
	this.name = name;
	this.age = age;
}
public Student() {
	
	System.out.println("기본생성자");
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
@Override
public String toString() {
	return "Student [name=" + name + ", age=" + age + "]";
}


}
