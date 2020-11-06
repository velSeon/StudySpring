package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
//동일주소의 경우 파라미터를 이용하여 주소 매필ㅇ을 다르게 하는 예제 
	@RequestMapping(value = "/")
	public String xxx() {
		System.out.println("main 호출됨");
		return "main";//main.jsp
	}
	
	@RequestMapping(value = "/kkk", params = "aaa=bbb")
	public String kkk() {
		System.out.println("A호출");
		return "login";
	}
	
	@RequestMapping(value = "/kkk", params = "aaa=ccc")
	public String kkk2() {
		System.out.println("B호출");
		return "login";
	}
	
	//params ="!zzz"
	//?xxx=아무거나
	@RequestMapping(value = "/kkk", params = "xxx")
	public String kkk3() {
		System.out.println("D호출");
		return "login";
	}
}
