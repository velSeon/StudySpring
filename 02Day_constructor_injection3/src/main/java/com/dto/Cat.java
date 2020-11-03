package com.dto;

public class Cat {
private String catName;
private int catAge;

public Cat(String catName, int catAge) {
	this.catName = catName;
	this.catAge = catAge;
}

public String getCatInfo() {
	return catName +"\t" + catAge;
}
}
