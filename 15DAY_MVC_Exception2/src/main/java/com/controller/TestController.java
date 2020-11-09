package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {

	//GET
	@RequestMapping(value = "/aaa", method = RequestMethod.GET)
	public String xxx() {
		if(true)throw new ArithmeticException("error 발생1");
		return "main";
	}
	@RequestMapping(value = "/bbb", method = RequestMethod.GET)
	public String bbb() {
		if(true)throw new NullPointerException("erorr 발생2");
		return "main";
	}
	
	
}
