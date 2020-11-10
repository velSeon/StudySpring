package com.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

//쿠키 생성 사용자 컴에 저장  key/value 쌍으로 저장(로그인정보 검사, 임시 데이터 저장 등에 활용)
//쿠키를 얼마정도 쓸건지 시간 지정 해준다.
//response에 add해준다.
	
	@RequestMapping(value = "/setCookie")
	public String setCookie(HttpServletRequest request, HttpServletResponse response) {
		Cookie c1 = new Cookie("myName", "홍길동"); //저장할 쿠키 생성 key/value
		Cookie c2 = new Cookie("age", "10");
		Cookie c3 = new Cookie("favorite", "악기");
		c1.setMaxAge(60*60); //쿠키의 생존시간 설정
		c2.setMaxAge(60*60);
		c3.setMaxAge(60*60);
		
		response.addCookie(c1);
		response.addCookie(c2);
		response.addCookie(c3);//사용자 컴에 쿠키 저장
		return "hello"; //hello.jsp
	}
	
	@RequestMapping("/getCookie")//쿠키 정보를 가져와 출력해 보기 
	public String getCookie(HttpServletRequest request, HttpServletResponse response) {
		Cookie [] cookies = request.getCookies(); 
		//for 문 돌아가면서 하나 씩 받으며, key와 value값을 찍어봄
		for(Cookie c : cookies) {//쿠키 하나의 정보 출력 "myName","홍길동"
			System.out.println(c.getName() + "\t" + c.getValue());
		}
		return "hello";
	}
}
