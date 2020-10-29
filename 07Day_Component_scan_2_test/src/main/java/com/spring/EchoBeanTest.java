package com.spring;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.dao.DeptDAO;
import com.entity.DeptDTO;
import com.service.DeptService;

public class EchoBeanTest {

	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:echo.xml");
				
		DeptService service = ctx.getBean("service",DeptService.class);
		DeptDTO mesg = service.getInfo();
		System.out.println(mesg);
		
		DeptDAO xx = ctx.getBean("dao",DeptDAO.class);
		System.out.println(xx.getInfo());
		
	}

}
