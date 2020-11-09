package com.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {

@RequestMapping(value = "/main", method = RequestMethod.GET)
public String main() {
	System.out.println("main====");
	return "main";
	}

//redirect
@RequestMapping(value = "/redirect", method = RequestMethod.GET)
public String redirect(Model m) {
	System.out.println("redirect 호출");
	m.addAttribute("userid", "홍길동");
	return "redirect:main";//main.jsp가 아닌 매핑주소가 main을 다시 찾아감.
}


//@RequestMapping(value = "/redirect", method = RequestMethod.GET)
//public String redirect(HttpServletRequest request) {
//	System.out.println("redirect 호출");
//	request.setAttribute("userid", "홍길동");
//	return "redirect:main";//main.jsp가 아닌 매핑주소가 main을 다시 찾아감.
//}

	
}
