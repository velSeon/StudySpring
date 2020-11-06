package com.dto;

import java.util.Arrays;

public class LoginDTO {
String userid;
String passwd;
String [] phone; //추가부분 - set/get메소드 추가, tostring 재 작성
public LoginDTO(String userid, String passwd, String[] phone) {
	super();
	this.userid = userid;
	this.passwd = passwd;
	this.phone = phone;
}
public LoginDTO() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "LoginDTO [userid=" + userid + ", passwd=" + passwd + ", phone=" + Arrays.toString(phone) + "]";
}
public String getUserid() {
	return userid;
}
public void setUserid(String userid) {
	this.userid = userid;
}
public String getPasswd() {
	return passwd;
}
public void setPasswd(String passwd) {
	this.passwd = passwd;
}
public String[] getPhone() {
	return phone;
}
public void setPhone(String[] phone) {
	this.phone = phone;
}


}
