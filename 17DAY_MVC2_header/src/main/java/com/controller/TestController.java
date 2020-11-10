package com.controller;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
//request 안에  요청 url, 브라우저 정보, get or post방식 request를 매개변수로 받아서 , getheaderNames로 header의 이름들만 받아서
//key로 받아서, enumeration로 받아준다. 
	@RequestMapping("/header")
	public String xxx(HttpServletRequest request) {
		Enumeration<String> keys = request.getHeaderNames(); //헤더정보의 전체 키 값만 얻기
		while(keys.hasMoreElements()) {//다음 키 값이 있는 지 검사
			String key = keys.nextElement();//하나의 키 값 얻기
			String value = request.getHeader(key); //하나의 키에 해당하는 정보 얻기
			System.out.println(key + "\t " + value); //키와 정보 출력			
		}
		return "hello";
	}
}
