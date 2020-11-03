package com.dto;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Student implements InitializingBean, DisposableBean {
	
	private String name;
	private int age;

	public Student() {
		System.out.println("기본생성자호출");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("DisposableBean.destroy");
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("InitializingBean.afterPropertiesSet");
		
	}
	

}
