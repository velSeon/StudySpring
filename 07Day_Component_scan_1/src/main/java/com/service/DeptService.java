package com.service;

import org.springframework.stereotype.Component;

@Component
public class DeptService {

	public String getService() {
		return "DeptService.getService() 호출됨";
	}
}
