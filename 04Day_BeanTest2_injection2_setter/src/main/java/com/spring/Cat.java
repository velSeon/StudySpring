package com.spring;

public class Cat {
String catName;
int Catage;
public Cat() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Cat [catName=" + catName + ", Catage=" + Catage + "]";
}
public Cat(String catName, int catage) {
	super();
	this.catName = catName;
	Catage = catage;
}
public String getCatName() {
	return catName;
}
public void setCatName(String catName) {
	this.catName = catName;
}
public int getCatage() {
	return Catage;
}
public void setCatage(int catage) {
	Catage = catage;
}

}
