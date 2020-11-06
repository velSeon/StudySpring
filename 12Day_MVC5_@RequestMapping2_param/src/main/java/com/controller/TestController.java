package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class TestController {
	//8070/test555/test/kkk
	@RequestMapping(value = "/kkk")
	public String kkk() {
		System.out.println("TestController.kkk요청");
		return "login";
	}

}
