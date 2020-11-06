package com.controller;


import java.util.ArrayList;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {
//@ModelAttribute 사용안됨, 자동으로 모델처리
@RequestMapping(value = "/aaa", method = RequestMethod.GET)
public String xxx3(Model m){//request대신 model객체 사용
	m.addAttribute("username", "홍길동"); //key:username
	return "main";

	
}

@RequestMapping(value = "/bbb", method = RequestMethod.GET)
public String bbb(Map<String, Object> map) {//request대신 map객체 사용
	map.put("address","서울"); //jsp에서 map의 key로 바로 사용 key:Address
	map.put("username","홍길동");
	ArrayList<String>list = new ArrayList<String>();
	list.add("a");
	list.add("b");
	map.put("list", list);
	
	
	return "main2";
	
}


}
