package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class TestController {

	

	//redirct-flash
	@RequestMapping(value = "/redirect", method = RequestMethod.GET)
	public String redirect(RedirectAttributes m) {//리다이렉트용 전용 객체
		System.out.println("redirect 호출");
		m.addFlashAttribute("userid", "홍길동");
		return "redirect:main";

	}
	
	
//	@RequestMapping(value = "/redirect", method = RequestMethod.GET)
//	public ModelAndView redirect() {//리다이렉트용 전용 객체
//
//		ModelAndView mv = new ModelAndView();
//		mv.addObject("userid", "홍길동");
//		mv.setViewName("redirect:main");
//		return mv;
//
//	}
	
	@RequestMapping(value = "/main", method = RequestMethod.GET)
	public String main() {
		System.out.println("main====");
		return "main";
	}
}
