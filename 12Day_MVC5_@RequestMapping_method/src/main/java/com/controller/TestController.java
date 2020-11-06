package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {
	// 동일주소를 get, post 구분하여  뷰페이지를 다르게 처리하는 예제
	//get
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String xxx() {
		System.out.println("xxx======");
		return "loginForm";//loginForm.jsp
	}
	
	//Post
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String xxx2() {
		System.out.println("xxx2()====");
		return "login";//login.jsp
	}
	
	@RequestMapping(value = "/main", method = RequestMethod.GET)
	public String xxx3() {
		System.out.println("xxx3()====");
		return "main";
	}
	
}
