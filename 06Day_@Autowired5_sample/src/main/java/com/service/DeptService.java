package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import com.dao.DeptDAO;

public class DeptService {
@Autowired
DeptDAO dao;

@Value("${driver}")
String driver;
@Value("${url}")
String url;
@Value("${name}")
String username;
@Value("${pass}")
String passwd;

public DeptService() {
	super();
	// TODO Auto-generated constructor stub
}
public DeptService(DeptDAO dao) {
	this.dao = dao;
}
public List<String> list(){
	return dao.list();
}

	
	/*
	 * public String getDriver() { return driver; } public void setDriver(String
	 * driver) { this.driver = driver; } public String getUrl() { return url; }
	 * public void setUrl(String url) { this.url = url; } public String
	 * getUsername() { return username; } public void setUsername(String username) {
	 * this.username = username; } public String getPasswd() { return passwd; }
	 * public void setPasswd(String passwd) { this.passwd = passwd; }
	 */
	 
@Override
public String toString() {
	return "DeptService [dao=" + dao + ", driver=" + driver + ", url=" + url + ", username=" + username + ", passwd="
			+ passwd + "]";
}





}
