package com.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.dto.LoginDTO;

@Controller
public class TestController {
//	@RequestMapping("/main")
//	public String xxx() {
//		System.out.println("main호출>>>>>>");
//		return "main";	
//	}
	
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginForm() {
		System.out.println("loginForm()실행>>>>>");
		return "loginForm";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login1(LoginDTO dto ) {
		System.out.println("/login() post data dto" + dto);
		return "loginForm";
	}
	
	
	//-----------------------------
//	@RequestMapping(value = "/login2")
//	public String login2(@RequestParam("userid") String id, @RequestParam("passwd") String pw) {
//		//String id = request.getParameter("userid")와 동일
//		System.out.println("@RequestParam=========="+ id+"\t"+pw);
//
//		return "login";
//	}
//	@RequestMapping("/login2")
//	public ModelAndView xxx(HttpServletRequest request) {
//		//데이터 파싱
//		//파싱한 data를 이용 ModelAndView에 저장
//		//뷰페이지를 logined.jsp로 지정
//		//logined.jsp에서 id, passwd출력
//		
//		ModelAndView mav = new ModelAndView();
//		mav.addObject("userid",request.getParameter("userid"));
//		mav.addObject("passwd",request.getParameter("passwd"));
//		mav.setViewName("logined");
//		System.out.println(mav);
//		return mav;
//		
//	}
	//매개변수와 form의 변수 이름이 같기 때문에 HttpServletRequest쓸필요 없이 , 
	@RequestMapping("/login2")
	public ModelAndView xxx(String userid, String passwd) {
		//데이터 파싱
		//파싱한 data를 이용 ModelAndView에 저장
		//뷰페이지를 logined.jsp로 지정
		//logined.jsp에서 id, passwd출력
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("userid",userid);
		mav.addObject("passwd",passwd);
		mav.setViewName("logined");
		System.out.println(mav);
		return mav;
		
	}
	
	
//	@RequestMapping(value = "/login2")
//	public String login2(HttpServletRequest request) {
//		String id = request.getParameter("userid");
//		String pw = request.getParameter("passwd");
//		System.out.println("id:   "+ id+"\t" +"pw:    "+pw);
//		return "login";
//	}
	/*
	 * @RequestMapping(value = "/login2") public String login2(HttpServletRequest
	 * request) { String id = request.getParameter("userid"); String pw =
	 * request.getParameter("passwe");
	 * System.out.println("@HttpServletRequest=========="+ id+"\t"+pw); return
	 * "login"; }
	 */
	
	@RequestMapping("/login3")
	public String login3(@RequestParam String userid, @RequestParam String passwd) {
		System.out.println("@RequestParam String id ====, pw==="+userid+"\t"+passwd);
		return "login";
	}
	
	@RequestMapping(value = "/login4", method = RequestMethod.POST)
	public String login4(String userid, String passwd) {
		System.out.println("String id ====, pw==="+userid+"\t"+passwd);
		return "login";
	}
	
	@RequestMapping("/login5")
	public String login5(@RequestParam ( required = false, defaultValue = "홍길동") 
	String userid, String passwd) {
		System.out.println("@RequestParam required false "+userid+"\t"+passwd);
		return "login";
	}
	
	@RequestMapping(value = "/login6", method = RequestMethod.POST)
	public String login6(@RequestParam Map<String, String> map) {
		System.out.println("Map post data map==== "+map);
		return "login";
	}
	
	@RequestMapping("/login7")
	public String login7(HttpServletRequest request) {
		String id = request.getParameter("userid");
		String pw = request.getParameter("passwd");
		System.out.println("@RequestParam passsing=====" + id+ "\t"+ pw);
		return "login";
	}

}
