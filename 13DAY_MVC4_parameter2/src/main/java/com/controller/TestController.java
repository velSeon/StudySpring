package com.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dto.Login;

@Controller
public class TestController {
@RequestMapping(value = "/login", method = RequestMethod.GET)
public String xxx() {
	return "loginForm";//loginForm.jsp
}


@RequestMapping(value = "/login", method = RequestMethod.POST)
public String ttt4(Login dto) {//파싱한 데이터로 login객체 생성
	System.out.println("ttt==="+dto);

	return "login3";//login3.jsp
}


@RequestMapping(value = "/login", method = RequestMethod.POST)
public String ttt5(Login dto) {//파싱한 데이터로 login객체 생성
	System.out.println("ttt==="+dto);
	dto.setUserid("userid");
	dto.setPasswd("passwd");
	return "login3";//login3.jsp
}

@RequestMapping(value = "/login2" , method = RequestMethod.POST)
public ModelAndView ttt9(Login dto) {
	ModelAndView mav = new ModelAndView();
	mav.addObject("loginDTO", dto);//전송할 객체 삽입
	mav.setViewName("login");//이동할 페이지 설정 login.jsp
	return mav;//login.jsp
}

//@RequestMapping(value = "/login3", method = RequestMethod.POST)
//public String tt3(@ModelAttribute("xxx") Login dto) {//@ModelAttribute에 xxx란 키로 넣음.
//	
//	return "login2";//login2.jsp
//	
//}

//@RequestMapping(value = "/login3", method = RequestMethod.POST)
//public String tt3(@ModelAttribute("xxx") HttpServletRequest request) {//@ModelAttribute에 xxx란 키로 넣음.
//	
//	String userid = request.getParameter("userid");
//	String passwd = request.getParameter("passwd");
//	
//	return "login2";//login2.jsp
//	
//}


}
