package com.dao;

import org.springframework.stereotype.Repository;

import com.entity.DeptDTO;
@Repository("dao") //이름을 명시하지 않으면 기본적으로 소문자로 시작되는 클래스 명으로 자동설정됨 -db접근
//@Repository  //이름을 명시하지 않으면 기본적으로 소문자로 시작되는 클래스 명으로 자동설정됨 -db접근
public class DeptDAO {

	public DeptDTO getInfo() {
		return new DeptDTO(100,"관리","서울");
	}
}
