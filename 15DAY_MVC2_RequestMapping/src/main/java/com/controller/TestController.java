package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {

	//1. 맵핍값 하나
	@RequestMapping(value = "/aaa" , method = RequestMethod.GET)
	public String aaa() {
		System.out.println("aaa====");
		return "main";
	}
	
	
	//2. 맵핍값 여러개
	@RequestMapping(value = {"/aaa2", "/bbb2"}, method = RequestMethod.GET)
	public String aaa2() {
		System.out.println("aaa2======");
		return "main";
	}
	
	//3. ccc만 맞으면 아무거나 와도 상관없다. 
	@RequestMapping(value = "/ccc*", method = RequestMethod.GET)
	public String ccc() {
		System.out.println("ccc===");
		return "main";
	}
	
	//4.*는 하나의 문자열 ddd/zzz, ddd/bbb가능하지만, ddd/bbb/ccc(x)
	@RequestMapping(value = "/ddd/*", method = RequestMethod.GET)
	public String ddd() {
		System.out.println("ddd====");
		return "main";
	}
	
	//5."/eee/"뒤로 뭐가 와도 상관없다. 여러 경로 가는 ddd/zzz, ddd/bbb, ddd/bbb/ccc(O)
	@RequestMapping(value = "/eee/*" ,method = RequestMethod.GET )
	public String eee() {
		System.out.println("eee====");
		return "main";
	}
	
	//6. 앞뒤로 /fff/, /ggg가 들어간다면 중간에 아무거나 들어와도 상관없다. 
	@RequestMapping(value = "/fff/**/ggg",method = RequestMethod.GET )
	public String fff() {
		System.out.println("fff========");
		return "main";
	}
	
	//7. /hhh/aaa/hhh/xxxx , userid와 passwd로 파싱을 할 수 있다. 
	@RequestMapping(value = "/hhh/{userid}/xxx/{passwd}", method = RequestMethod.GET )
	public String hhh() {
		System.out.println("hhh========");
		return "main";
	}
	
}
