package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.dao.DeptDAO;
import com.dto.DeptDTO;

public class DeptService {

	@Autowired
	DeptDAO dao;
	public List<DeptDTO> selectAll(){
		return dao.selectAll();
	}
	
	@Transactional
	public void tx() throws Exception{
		dao.tx();
	}
}
