package com.controller;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dto.Login;

@Controller
public class TestController {
@RequestMapping("/ddd")
@ResponseBody //비동기 처리 어노테이션 : 함수의 리턴이 클라이언트에게 보내지는 응답내용이 됨
public String ddd(String mesg) {
	System.out.println("ddd()======="+mesg);
	return "hello!!"; //jsp 파일이 아닌 응답 data가 됨
}


@RequestMapping("/aaa")
@ResponseBody
public Login aaa() {
	Login login = new Login();
	login.setUserid("홍길동");
	login.setPasswd("1234");
	return login; //객체를 json데이터로 전달 //{userid:"홍길동", passwd:"1234"}
}

@RequestMapping("/bbb")
@ResponseBody
public ArrayList<Login> bbb(){
	ArrayList<Login> list = new ArrayList<Login>();
	list.add(new Login("홍길동1", "10"));
	list.add(new Login("홍길동2", "20"));
	list.add(new Login("홍길동3", "30"));
	return list;
}

@RequestMapping("/ccc")
@ResponseBody
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
