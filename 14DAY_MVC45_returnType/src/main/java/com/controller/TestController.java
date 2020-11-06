package com.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dto.Login;

@Controller
public class TestController {

	//1.리턴타입 String ->뷰만 알려줌
	@RequestMapping(value = "/aaa", method = RequestMethod.GET)
	public String xxx3() {
		return "main";
	}
	
	//2.ModelandView => Model과 뷰를 모두 알려줌
	@RequestMapping(value = "/bbb", method = RequestMethod.GET)
	public ModelAndView bbb() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("username","홍길동");
		mav.setViewName("main2");
		return mav;
	}
	
	//3.리턴타입 DTO =>모델만 알려줌, view는  value인 주소로 유추 (ccc.jsp) ,  key가 소문자 클래스가 되서 login이 됨
	@RequestMapping(value = "/ccc", method = RequestMethod.GET)
	public Login cccc() {
		Login d = new Login();
		d.setUserid("aaa");
		d.setPasswd("1234");
		return d;
	}
	
	//3-2.리턴타입 DTO=>모델만 알려줌, view는 유추 (ddd.jsp)
	@RequestMapping(value = "/ddd", method = RequestMethod.GET)
	@ModelAttribute("xxx")
	public Login ddd() {
		Login d = new Login();
		d.setUserid("aaa");
		d.setPasswd("1234");
		return d;
	}
	
	//4.리턴타입 ArrayList => 모델만 알려줌, view는 유추 (eee.jsp)
	@RequestMapping(value = "/eee", method = RequestMethod.GET)
	public ArrayList<String> kkk(){
		ArrayList<String> list = new ArrayList<String>();
		list.add("홍길동");
		list.add("홍길동1");
		list.add("홍길동2");
		list.add("홍길동3");
		list.add("홍길동4");
		
		return list;
	}
	
	//5.void ===>모델과 뷰 모두 안아려줌. View: fff.jsp, Model없음
	@RequestMapping(value = "/fff", method = RequestMethod.GET)
	public void fff(){
		System.out.println("fff");
	}
	
}
