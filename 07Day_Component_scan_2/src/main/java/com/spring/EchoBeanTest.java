package com.spring;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.dao.DeptDAO;
import com.entity.DeptDTO;
import com.service.DeptService;

public class EchoBeanTest {

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("echo.xml");
		DeptService service = ctx.getBean("service", DeptService.class);
		//bean의 이름(id)은 첫글자 소문자 클래스 명이됨.
		DeptService service2 = ctx.getBean("service", DeptService.class);
		
		System.out.println(service == service2);
		DeptDTO mesg = service.getInfo();
		System.out.println(mesg);
		
		DeptDAO xx = ctx.getBean("dao",DeptDAO.class);
		System.out.println(xx.getInfo());
		
	}

}
