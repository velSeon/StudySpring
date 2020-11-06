package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {

	@RequestMapping("/aaa")
	public String xxx() {
		return "main";
	}
	
	@RequestMapping("/bbb")
	public ModelAndView xxx2() { //리턴타입 주의
		ModelAndView mav = new ModelAndView();//Model Key/Value저장, view페이지 정보 저장
		mav.addObject("username","홍길동");
		mav.addObject("age", 20);
		mav.setViewName("main2");//Web-INF/main2.jsp
		return mav; //리턴 ModelAndView //main2.jsp로 데이터 전달
	}
	@RequestMapping("/getCookie2")
	public String xxx3() {
		return "main";
	}

}
