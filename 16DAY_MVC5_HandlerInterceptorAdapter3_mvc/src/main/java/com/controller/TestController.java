package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {

	@RequestMapping(value = "/main", method = RequestMethod.GET)
	public String main() {//인터셉터 사용 검사
		System.out.println("Test.main=====");
		return "main";
	}
	
	@RequestMapping(value = "/loginForm", method = RequestMethod.GET)
	public String loginForm() {
		System.out.println("Test.loginForm====");
		return "loginForm";
		
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView login(String userid, String passwd) {
		System.out.println("Test.login=====");
		ModelAndView mav = new ModelAndView();
		mav.addObject("userid", userid);
		mav.addObject("passwd", passwd);
		mav.setViewName("logined");
		return mav;
		
	}
}
