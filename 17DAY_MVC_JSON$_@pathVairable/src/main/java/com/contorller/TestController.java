package com.contorller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {
//세번째 오는 것{xxx}변수명처럼, abc의 값을 key, value처럼. key값에 넣어준 변수를 name에 넣어준다. 
	//borad/name/abc를 넣으면, xxx에 abc가 들어간다. 
	@RequestMapping(value = "/board/name/{xxx}" , method = RequestMethod.GET)
	public String aaa(@PathVariable("xxx") String name) {
		System.out.println("@PathVariable ('xxx') "+ name);
		return "main";
	}
	//xxx키 값을 name으로 넣어주고, yyy위치에 넣어 준 것을 int타입을 age로 저장함.  형변환도 자동으로 됨. 
	@RequestMapping(value = "/board/name/{xxx}/age/{yyy}" , method = RequestMethod.GET)
	public String aaa2(@PathVariable("xxx") int name, @PathVariable("yyy") int age) {
		System.out.println(name + "\t" + age);
		System.out.println(name+age);
		return "main";
	}
	
}
