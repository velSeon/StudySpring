package com.controller;

import javax.servlet.http.HttpSession;

import org.omg.CORBA.Request;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dto.LoginDTO;

@Controller
public class LoginTestController {

	
	@RequestMapping(value="/main", method = RequestMethod.GET)
	public String xxx1() {
		System.out.println("main====");
		return "main";
	}
	
	@RequestMapping(value ="/member", method = RequestMethod.GET)
	public String xxx3() {
		System.out.println("member.get=====");
		return "member";

	}
	
	@RequestMapping(value ="/member", method = RequestMethod.POST)
	public String xxx2(HttpSession session1, LoginDTO dto) {
		System.out.println("member.post======");
		session1.setAttribute("member", dto);
		System.out.println("member session======"+dto);
		return "redirect:login";
	
	}
	
	
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String xxx() {
		System.out.println("login.get=====");
		return "loginForm";
	}
	
	
	@RequestMapping(value="/logined", method = RequestMethod.POST)
	public String login(HttpSession session, LoginDTO dto) {//로그인 데이터
		System.out.println("login.post======");
		LoginDTO memberDTO = (LoginDTO) session.getAttribute("member");//회원가입 데이터
		System.out.println("memberDTO====="+memberDTO);
		String nextPage = "";
			if(memberDTO != null) {//회원가입 정보 있음.
				System.out.println("member.id===="+memberDTO.getUserid());
				if(memberDTO.getUserid().equals(dto.getUserid())) {//인증성공
					System.out.println("정보 일치");
						session.setAttribute("login", dto);
						
						nextPage ="logined";
					}else {
						System.out.println("id정보가 일치하지 않음.");
						nextPage ="redirect:login";
					}
						
					}else {//회원가입 정보가 없음. 
						System.out.println("로그인정보가 없음");
						nextPage="redirect:member";
				}
					return nextPage;
		
	}
	
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(HttpSession session) {
		System.out.println("logout=====");
		session.invalidate();
		return "redirect:main";
	}
	
}
