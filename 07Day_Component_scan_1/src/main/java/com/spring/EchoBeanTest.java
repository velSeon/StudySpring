package com.spring;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.service.DeptService;

public class EchoBeanTest {

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("echo.xml");
		DeptService service = ctx.getBean("deptService", DeptService.class);
		//bean의 이름(id)은 첫글자 소문자 클래스 명이됨.
		String mesg = service.getService();
		System.out.println(mesg);

	}

}
