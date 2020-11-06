package com.controller;

import javax.servlet.http.HttpServletRequest;

import org.omg.CORBA.Request;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dto.Login;



/*
1."/main"->main.jsp
2.main.jsp - "login"링크 - loginform.jsp
3.loginform-데이터 "login" post방식 전송->logined.jsp
4.logined.jsp -로그아웃링크 -"logout"->logout.jsp
5.logout.jsp-"로그아웃됨" 출력 -"로그인으로이동"-loginForm 링크걸기
6.logout.jsp-"메인으로 이동"-main.jsp
++ 회원가입 'member"->member.jsp, 로그인폼 ->loginFrom.jsp
1.member.jsp "회원가입페이지입니다."->loginForm.jsp이동, main.jsp링크 걸기
++logined.jsp -main링크 -main.jsp
*/


@Controller
public class TestController {

	@RequestMapping("/main")
	public String xxx() {
		System.out.println("main 호출=====");
		return "main";
	}
	
	
	@RequestMapping("/loginForm")
	public String xxx2() {
		System.out.println("loginForm 호출=====");
		return "loginForm";
	}
	@RequestMapping("/logout")
	public String xxx3() {
		System.out.println("logout 호출=====");
		return "logout";
	}
	@RequestMapping("/member")
	public String xxx4() {
		System.out.println("member 호출=====");
		return "member";
	}
	
	@RequestMapping(value = "/login" , method = RequestMethod.POST)
	public ModelAndView xxx1(HttpServletRequest request) {
		System.out.println("xxx1호출====");
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("userid", request.getParameter("userid"));
		mav.addObject("passwd", request.getParameter("passwd"));
		mav.setViewName("logined");
		
		
		return mav;
	}
	
	
}
