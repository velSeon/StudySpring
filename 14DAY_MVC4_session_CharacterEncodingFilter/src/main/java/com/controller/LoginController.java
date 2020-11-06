package com.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dto.Login;

@Controller
public class LoginController {

	@RequestMapping(value = "/login" , method = RequestMethod.GET)
	public String aaa() {
		System.out.println("loginForm()======");
		return "loginForm";
	}
//	@RequestMapping(value = "/login" , method = RequestMethod.POST)
//	public String aaa1(Login dto) {
//		
//		
//		System.out.println(dto);
//		return "login";
//	}
	
	
//	@RequestMapping(value = "/login" , method = RequestMethod.POST)
//	public ModelAndView aaa1(HttpServletRequest request) {
//		System.out.println("logined======");
//		ModelAndView mav = new ModelAndView();
//		mav.addObject("userid", request.getParameter("userid"));
//		mav.addObject("passwd", request.getParameter("passwd"));
//		mav.setViewName("logined");
//		
//		return mav;
//	}
	
	
//	//map으로 받은 경우
//	@RequestMapping(value = "/login", method = RequestMethod.POST)
//	public String bbb(Map<String, String> map, String userid, String passwd) {
//		//Login dto = new Login();
//		map.put("userid", userid);
//		map.put("passwd", passwd);
//		return "logined";
//	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(Login dto, HttpSession session) {
		System.out.println("login=======");
		System.out.println("login Session 설정" +dto);
		session.setAttribute("login", dto);
		return "login";
	}
	
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(HttpSession session) {
		System.out.println("logout=====");
		session.invalidate();

		return "redirect:login";
		//= respose.sendredirect효과
		// "/login"의 get방식을 찾아간다 -> //loginForm으로 다시 이동
		//매핑 login으로 다시 접근 
	}
	
	
}
