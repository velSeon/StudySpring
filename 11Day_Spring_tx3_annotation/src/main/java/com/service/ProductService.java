package com.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.dao.ProductDAO;
import com.entity.OrderDTO;
import com.entity.ProductDTO;

public class ProductService {

	ProductDAO dao;
	


	public ProductService() {
		super();
		// TODO Auto-generated constructor stub
	}




	public void setDao(ProductDAO dao) {
		this.dao = dao;
	}




	public List<ProductDTO> selectProduct(){
		return dao.selectProduct();
	}
	
	public List<OrderDTO> selectOrder(){
		return dao.selectOrder();
	}
	
	@Transactional
	public void addOrder(String pcode, int quantity) throws Exception{
		dao.addOrder(pcode, quantity);
	}
}
