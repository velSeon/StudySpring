package com.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import com.dto.DeptDTO;

public class DeptDAO {

	
	@Autowired
	SqlSessionTemplate template; //SqlSession과 동일 기능
	
	public List<DeptDTO> selectAll(){
		return template.selectList("DeptMapper.selectAll");
	}
	
	
	public void tx() throws Exception{
		
		template.delete("DeptMapper.deptDelete",51);
		DeptDTO dto = new DeptDTO(10, "6666", "6666");
		template.insert("DeptMapper.deptInsert", dto);
	
	}
}
