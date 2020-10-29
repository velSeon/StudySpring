package com.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.service.OneService;
import com.service.TwoService;
@Component
public class EchoBean {
	
//@autowired 하거나 수동으로 주입시켜주거나
	@Autowired
OneService one;
	@Autowired
TwoService two;
public OneService getOne() {
	return one;
}
public void setOne(OneService one) {
	this.one = one;
}
public TwoService getTwo() {
	return two;
}
public void setTwo(TwoService two) {
	this.two = two;
}
@Override
public String toString() {
	return "EchoBean [one=" + one + ", two=" + two + "]";
}
public EchoBean() {
	super();
	// TODO Auto-generated constructor stub
}
public EchoBean(OneService one, TwoService two) {
	super();
	this.one = one;
	this.two = two;
}


}
