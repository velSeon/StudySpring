package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.dao.DeptDAO;

public class DeptService {
@Autowired
DeptDAO dao;//new가 사라지고 .xml에서 주입

String driver;
String url;
String userid;
String passwd;
//setDriver, setUrl, setUserid, setPass 구현
//jdbc.properties 파일에서 4가지 정보를 읽어와서 property로 설정
//main에서 service에 저장된 4가지 정보를 출력



public DeptService() {}

@Override
public String toString() {
	return "DeptService [dao=" + dao + ", driver=" + driver + ", url=" + url + ", userid=" + userid + ", passwd="
			+ passwd + "]";
}

public DeptService(DeptDAO dao) {//생성된 DeptDAO bean을 생성자를 통해 주입함.
	System.out.println("DeptService 생성자 호출됨======");
	this.dao = dao;
}
public List<String> list(){
	System.out.println("DeptService list() 호출됨======");
	return dao.list();
}
public void setDriver(String driver) {
	this.driver = driver;
}
public void setUrl(String url) {
	this.url = url;
}
public void setUserid(String userid) {
	this.userid = userid;
}
public void setPasswd(String passwd) {
	this.passwd = passwd;
}

public void setDao(DeptDAO dao) {
	this.dao = dao;
}


}
