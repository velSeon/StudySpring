package com.controller;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dto.Login;

//@Controller
@RestController
public class TestController {
@RequestMapping("/home")
public String ddd() {
	return "home";
}

@RequestMapping("/eee")
public String eee(@RequestParam("mesg") String mesg) {
	System.out.println("eee===="+mesg);
	return "hello!!!";
}

@RequestMapping("/fff")
public String fff(@RequestBody String mesg) {//post방식
	//requestBody의 mesg를 받게끔..
	System.out.println("fff===="+mesg);
	return "Hello????";//클라이언트 단에 갈 데이터
}

@RequestMapping("/aaa") //@ResponseBody의 삭제
public Login aaa() {
	Login login = new Login();
	login.setUserid("홍길동");
	login.setPasswd("1234");
	return login; //객체를 json데이터로 전달 //{userid:"홍길동", passwd:"1234"}
}

@RequestMapping("/bbb")//@ResponseBody의 삭제
public ArrayList<Login> bbb(){
	ArrayList<Login> list = new ArrayList<Login>();
	list.add(new Login("홍길동1", "10"));
	list.add(new Login("홍길동2", "20"));
	list.add(new Login("홍길동3", "30"));
	return list;
}

@RequestMapping("/ccc")//@ResponseBody의 삭제
public HashMap<String , ArrayList<Login>> ccc(){
	HashMap<String , ArrayList<Login>> map = new HashMap<String, ArrayList<Login>>();
	ArrayList<Login> list = new ArrayList<Login>();
	list.add(new Login("홍길동1", "10"));
	list.add(new Login("홍길동2", "20"));
	list.add(new Login("홍길동3", "30"));
	
	ArrayList<Login> list2 = new ArrayList<Login>();
	list2.add(new Login("유관순1", "10"));
	list2.add(new Login("유관순2", "20"));
	list2.add(new Login("유관순3", "30"));
	
	map.put("one", list);
	map.put("two", list2);	
	return map;
}


}
