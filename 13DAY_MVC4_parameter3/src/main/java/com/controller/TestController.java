package com.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dto.Login;

@Controller
public class TestController {

	
	@RequestMapping(value = "/aaa" , method = RequestMethod.GET)
	public ModelAndView xxx(ArrayList<String> list) {//list 객체 생성
		list.add("홍길동1");//data add
		list.add("홍길동2");
		list.add("홍길동3");
		list.add("홍길동4");
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("list", list);//list 저장
		mav.setViewName("main");//main.jsp
		return mav;
	}
	
	@RequestMapping(value = "/bbb" , method = RequestMethod.GET)
	public String xxx3(@ModelAttribute("xxx") ArrayList<String> list) {//xxx
		//ArrayList 생성 후 xxx 란 키로 @ModelAttribute에 저장
		
		list.add("홍길동1");//data add
		list.add("홍길동2");
		list.add("홍길동3");
		list.add("홍길동4");
		
		return "main2";
	}
	
	@RequestMapping(value = "/ccc", method = RequestMethod.GET)
	public String ccc(ArrayList<String> list) {//키값없이 ${stringList}
		list.add("홍길동1");//data add
		list.add("홍길동2");
		list.add("홍길동3");
		list.add("홍길동4");
		return "main3";
		
	}
	
	@RequestMapping(value = "/ddd", method = RequestMethod.GET)
	public String ddd(HttpServletRequest request) {
		request.setAttribute("userid", "abcd");
		return "main4";
	}
	
	@RequestMapping(value = "/eee", method = RequestMethod.GET)
	public String eee(Login dto) {
		dto.setUserid("abcd");
		dto.setPasswd("123");
		return "main5";
	}
	
}
