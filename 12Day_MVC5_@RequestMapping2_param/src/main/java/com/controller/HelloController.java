package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class HelloController {
	//8087/test555/hello/kkk
@RequestMapping("/kkk")
public String kkk() {
	System.out.println("HelloController./hello/kkk=====");
	return "login";
}
	
}
