package com.dto;

public class Man {
		private String name;
		private int age;
		private String address;
		@Override
		public String toString() {
			return "Man [name=" + name + ", age=" + age + ", address=" + address + "]";
		}
		
		public void setName(String name) {
			this.name = name;
		}
		
		public void setAge(int age) {
			this.age = age;
		}
		
		public void setAddress(String address) {
			this.address = address;
		}
		
		
}
