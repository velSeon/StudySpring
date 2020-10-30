package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;

import com.dto.TestDTO;

public class TestDAO {
@Autowired
DataSource dataSource;

public ArrayList<TestDTO> select(){
	ArrayList<TestDTO> list = new ArrayList<TestDTO>();
	
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	try {
		con = dataSource.getConnection();
		String sql = "select * from test";
		pstmt = con.prepareStatement(sql);
		rs = pstmt.executeQuery();
		
		while (rs.next()) {
			int n = rs.getInt("num");
			String n2 = rs.getString("username");
			String n3 = rs.getString("address");
			TestDTO dto = new TestDTO(n, n2, n3);
			list.add(dto);
			
			
		}
	} catch (Exception e) {
		e.printStackTrace();
	}finally {
		try {
			if(rs!=null)rs.close();
			if(pstmt != null)pstmt.close();
			if(con != null)con.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	return list;
}

public void insert(int num, String name, String address) {
	Connection con = null;
	PreparedStatement pstmt = null;
	try {
		con = dataSource.getConnection();
		String sql = "insert into test(num, username, address" + " value(?,?,?";
		pstmt = con.prepareStatement(sql);
		pstmt.setInt(1, num);
		pstmt.setString(2, name);
		pstmt.setString(3, address);
		
		int n = pstmt.executeUpdate();
		System.out.println("삽입된 행의 갯수==="+n);
	
	} catch (Exception e) {
		e.printStackTrace();
	}finally {
		try {
		if(pstmt != null)pstmt.close();
		if(con != null)con.close();
		}
	catch (Exception e) {
		e.printStackTrace();
	
}
	}	
	
}

public void delete( int num) {
	Connection con = null;
	PreparedStatement pstmt = null;
	try {
		con = dataSource.getConnection();
		String sql = "delete from test where num =?";
		pstmt = con.prepareStatement(sql);
		pstmt.setInt(1, num);
		int n = pstmt.executeUpdate();
		System.out.println("삭제된 행의 갯수===="+n);
	} catch (Exception e) {
		e.printStackTrace();
	}finally {
		try {
			if( pstmt != null) pstmt.close();
			if(con != null) con.close();
		} catch (Exception e2) {
		 e2.printStackTrace();
		}
	}
}


public void update (int num, String username, String address) {
	Connection con = null;
	PreparedStatement pstmt = null;
	try {
		con = dataSource.getConnection();
		String sql = "update test set username =? , address= ? where num =?";
		pstmt = con.prepareStatement(sql);
		pstmt.setString(1, username);
		pstmt.setString(2, address);
		pstmt.setInt(3, num);
		
		int n = pstmt.executeUpdate();
		System.out.println("수정된 행의 갯수 ===="+n);
	} catch (Exception e) {
		e.printStackTrace();
	}finally {
		try {
			if(pstmt != null) pstmt.close();
			if(con != null)con.close();
		} catch (Exception e) {
		e.printStackTrace();
		}
	}
}
}
