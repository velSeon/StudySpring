package com.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {
@ModelAttribute("xxx")//다른 함수의 사용 객체가 됨//list가 @ModelAttribute의 "xxx" key값으로 됨.
public ArrayList<String> getList(){
	System.out.println("getList()=====");
	ArrayList<String> list = new ArrayList<String>();
	list.add("홍길동1");
	list.add("홍길동2");
	list.add("홍길동3");
	list.add("홍길동4");
	list.add("홍길동5");
	
	return list;//xxx란 key로 list저장

	
}

@RequestMapping(value = "/aaa", method = RequestMethod.GET)
public String xxx3(@ModelAttribute("xxx") ArrayList<String > list) {
	System.out.println("aaa 추가 요청 작업");
	return "main";
	
}
@RequestMapping(value = "/bbb", method = RequestMethod.GET)
public String bbb(@ModelAttribute("xxx") ArrayList<String > list) {
	System.out.println("bbb 추가 요청 작업");
	return "main2";
	
}

}
