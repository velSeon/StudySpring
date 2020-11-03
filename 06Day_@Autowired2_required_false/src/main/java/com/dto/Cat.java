package com.dto;

public class Cat {
private String catName;
private int catAge;

//기본 생성자 자동으로 만들어짐.
//setter injection
public void setCatName(String catName) {
	this.catName = catName;
}


public void setCatAge(int catAge) {
	this.catAge = catAge;
}

public String getCatInfo() {
	return catName +"\t" + catAge;
}


@Override
public String toString() {
	return "Cat [catName=" + catName + ", catAge=" + catAge + "]";
}


}
