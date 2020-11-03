package com.dto;

public class Student {
//target클래스 //핵심로직 구현 클래스
	
	public String sayEcho() {//핵심로직
		System.out.println("sayEcho===");
		//int n = 10/0;
		return "HEllo";
	}
	
	public String callEcho() {//핵심로직
		System.out.println("callEcho====");
		return "World";
	}
	
}
