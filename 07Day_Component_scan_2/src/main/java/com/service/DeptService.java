package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.dao.DeptDAO;
import com.entity.DeptDTO;
//@Service("service")//클래스 이름 사용, 아예 이름을 이것으로 써라.
@Service("service")
@Scope("singleton")
public class DeptService {
	@Autowired
	DeptDAO dao;

	public DeptDAO getDao() {
		return dao;
	}

	public void setDao(DeptDAO dao) {
		this.dao = dao;
	}

		public DeptDTO getInfo() {
			return dao.getInfo();

}
		}
