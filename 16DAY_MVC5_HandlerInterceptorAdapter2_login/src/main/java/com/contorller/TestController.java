package com.contorller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//home, main, loginForm 매핑주소

@Controller
public class TestController {

	@RequestMapping(value = "/main", method = RequestMethod.GET)
	public String main() {
		System.out.println("test.main=====");
		return "main";
	}
	
	@RequestMapping(value = "/loginForm")
	public String loginForm() {
		System.out.println("test.loginForm===");
		return "loginForm";
	}
}
