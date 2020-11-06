package com.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.dto.LoginDTO;

@Controller
public class TestController {
@RequestMapping("/login")
public String login() {

	return "loginForm";
}

@RequestMapping(value = "/login" , method = RequestMethod.POST)
public String login(LoginDTO dto ) {
	System.out.println(dto.toString());
	System.out.println(dto);
	return "login";
}

	
}
