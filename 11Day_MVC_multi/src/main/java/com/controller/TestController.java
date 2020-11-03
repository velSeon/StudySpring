package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	//http://ip번호:포트번호/컨테스트명/서블릿맵핑/request맵핑
	//http://localhost:8090/app/kkk
	@RequestMapping("/kkk")
	public String xxx() {
		System.out.println("kkk=====");
		return "/WEB-INF/views/main.jsp";
	}
	
	//http://localhost:8090/app/yyy
	@RequestMapping("/yyy")
	public String xxx2() {
		System.out.println("yyy=====");
		return "/WEB-INF/views/main.jsp";
	}
	
}
