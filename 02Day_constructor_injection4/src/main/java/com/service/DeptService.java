package com.service;

import java.util.List;

import com.dao.DeptDAO;

public class DeptService {
DeptDAO dao;//new가 사라지고 .xml에서 주입
public DeptService(DeptDAO dao) {//생성된 DeptDAO bean을 생성자를 통해 주입함.
	System.out.println("DeptService 생성자 호출됨======");
	this.dao = dao;
}
public List<String> list(){
	System.out.println("DeptService list() 호출됨======");
	return dao.list();
}
}
