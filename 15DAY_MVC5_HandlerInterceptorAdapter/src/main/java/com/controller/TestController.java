package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class TestController {
//main이라는 함수가 실행되기 전에 round먼저 호출 됨.
	@RequestMapping(value = "/main" , method = RequestMethod.GET)
	public String main() {
		System.out.println("main=====");
		return "main";
	}
	
	@RequestMapping(value = "/kkk", method = RequestMethod.GET)
	public String kkk() {
		System.out.println("kkkk====");
		return "home";
	}
}
