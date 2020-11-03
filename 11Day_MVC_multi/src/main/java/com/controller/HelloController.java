package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	@RequestMapping("/kkk")
	public String xxx() {
		System.out.println("kkk2======");
		return "/WEB-INF/views/main.jsp";
	}
	
	@RequestMapping("/yyy2")
	public String xxx2() {
		System.out.println("yyy2======");
		return "/WEB-INF/views/main.jsp";
	}
}
