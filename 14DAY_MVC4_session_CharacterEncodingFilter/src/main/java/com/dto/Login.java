package com.dto;

public class Login {
String userid;
String passwd;
public Login(String userid, String passwd) {
	super();
	this.userid = userid;
	this.passwd = passwd;
}
public Login() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Login [userid=" + userid + ", passwd=" + passwd + "]";
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


}
