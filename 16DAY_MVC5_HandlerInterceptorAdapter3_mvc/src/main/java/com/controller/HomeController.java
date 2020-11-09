package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
@RequestMapping("/home")
public String main() {//인터셉터 사용해서 검사
	System.out.println("homeController=====");
	return "main";
}
}
