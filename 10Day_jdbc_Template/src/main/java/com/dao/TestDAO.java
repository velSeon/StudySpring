package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.dto.TestDTO;

public class TestDAO {
private JdbcTemplate jdbcTemplate;//pom.xml에 디펜던시 추가 설명
	public TestDAO(DataSource dataSource) {//DataSource는 생성자를 통해 주입받을 것임
		jdbcTemplate = new JdbcTemplate(dataSource);//dataSource를 이용하여 jdbcTemplate
	}
	
	public List<TestDTO> select(){
		List<TestDTO> list = jdbcTemplate.query("select * from test", new RowMapper<TestDTO>() {//RowMapper, mapRow함수 오버라이딩.
			public TestDTO mapRow(ResultSet rs, int roNum) throws SQLException{
				TestDTO dto = new TestDTO();//구현은 레코드의 내용을 읽어와 컬럼의 값을 꺼내
				dto.setNum(rs.getInt(1));//model(dto)에 담아서 리턴하는 부분만 구현
				dto.setUsername(rs.getString(2));
				dto.setAddress(rs.getString(3));
				return dto;
			}
			
		});
		return list;
	}
	
	public List<TestDTO> selectByName(String name){
		List<TestDTO> list = jdbcTemplate.query("select * from test where username=?", new RowMapper<TestDTO>() {
			public TestDTO mapRow(ResultSet rs, int roNum)throws SQLException{
				TestDTO dto = new TestDTO();
				dto.setNum(rs.getInt(1));
				dto.setUsername(rs.getString(2));
				dto.setAddress(rs.getString(3));
				return dto;
			}
		}, name);
		return list;
	}
	public void insert(int num, String username, String address) {
		jdbcTemplate.update( "insert into test(num, username, address) values(?,?,?)", num, username, address);
	}
//public ArrayList<TestDTO> select(){
//	ArrayList<TestDTO> list = new ArrayList<TestDTO>();
//	
//	Connection con = null;
//	PreparedStatement pstmt = null;
//	ResultSet rs = null;
//	
//	try {
//		con = dataSource.getConnection();
//		String sql = "select * from test";
//		pstmt = con.prepareStatement(sql);
//		rs = pstmt.executeQuery();
//		
//		while (rs.next()) {
//			int n = rs.getInt("num");
//			String n2 = rs.getString("username");
//			String n3 = rs.getString("address");
//			TestDTO dto = new TestDTO(n, n2, n3);
//			list.add(dto);
//			
//			
//		}
//	} catch (Exception e) {
//		e.printStackTrace();
//	}finally {
//		try {
//			if(rs!=null)rs.close();
//			if(pstmt != null)pstmt.close();
//			if(con != null)con.close();
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
//	}
//	return list;
//}

//public void insert(int num, String name, String address) {
//	Connection con = null;
//	PreparedStatement pstmt = null;
//	try {
//		con = dataSource.getConnection();
//		String sql = "insert into test(num, username, address" + " value(?,?,?";
//		pstmt = con.prepareStatement(sql);
//		pstmt.setInt(1, num);
//		pstmt.setString(2, name);
//		pstmt.setString(3, address);
//		
//		int n = pstmt.executeUpdate();
//		System.out.println("삽입된 행의 갯수==="+n);
//	
//	} catch (Exception e) {
//		e.printStackTrace();
//	}finally {
//		try {
//		if(pstmt != null)pstmt.close();
//		if(con != null)con.close();
//		}
//	catch (Exception e) {
//		e.printStackTrace();
//	
//}
//	}	
//	
//}

//public void delete( int num) {
//	Connection con = null;
//	PreparedStatement pstmt = null;
//	try {
//		con = dataSource.getConnection();
//		String sql = "delete from test where num =?";
//		pstmt = con.prepareStatement(sql);
//		pstmt.setInt(1, num);
//		int n = pstmt.executeUpdate();
//		System.out.println("삭제된 행의 갯수===="+n);
//	} catch (Exception e) {
//		e.printStackTrace();
//	}finally {
//		try {
//			if( pstmt != null) pstmt.close();
//			if(con != null) con.close();
//		} catch (Exception e2) {
//		 e2.printStackTrace();
//		}
//	}
//}


//public void update (int num, String username, String address) {
//	Connection con = null;
//	PreparedStatement pstmt = null;
//	try {
//		con = dataSource.getConnection();
//		String sql = "update test set username =? , address= ? where num =?";
//		pstmt = con.prepareStatement(sql);
//		pstmt.setString(1, username);
//		pstmt.setString(2, address);
//		pstmt.setInt(3, num);
//		
//		int n = pstmt.executeUpdate();
//		System.out.println("수정된 행의 갯수 ===="+n);
//	} catch (Exception e) {
//		e.printStackTrace();
//	}finally {
//		try {
//			if(pstmt != null) pstmt.close();
//			if(con != null)con.close();
//		} catch (Exception e) {
//		e.printStackTrace();
//		}
//	}
//}
}
