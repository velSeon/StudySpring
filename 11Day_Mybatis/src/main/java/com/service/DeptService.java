package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.dao.DeptDAO;
import com.dto.DeptDTO;

public class DeptService {

	@Autowired
	DeptDAO dao;
	public List<DeptDTO> selectAll(){
		return dao.selectAll();
	}
}
