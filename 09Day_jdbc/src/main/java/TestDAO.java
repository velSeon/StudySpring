import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;



public class TestDAO {
	String driver= "oracle.jdbc.driver.OracleDriver";
	String url="jdbc:oracle:thin:@localhost:1521:orcl";
	String username="scott";
	String passwd="tiger";
	
	public TestDAO() {
		try {
			Class.forName(driver);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList<TestDTO> select(){
		ArrayList<TestDTO> list = new ArrayList<TestDTO>();
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = DriverManager.getConnection(url, username, passwd);
			String sql = "select * from test";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
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
				if(rs != null)rs.close();
				if(pstmt != null)pstmt.close();
				if(con != null)con.close();
			
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		
		
	}
		
		return list;
	}
	
	
	
	
	
	public void insert(int num, String name, String address) {
		Connection con = null;
		PreparedStatement pstmt = null;
		
		
		try {
			con = DriverManager.getConnection(url, username, passwd);
			String sql = "insert into test(num, username, address)" + "values(?, ?, ?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, num);
			pstmt.setString(2, name);
			pstmt.setString(3, address);
			
			int n = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {			
			try {
				
				if(pstmt != null)pstmt.close();
				if(con != null)con.close();
			
			} catch (Exception e) {
				e.printStackTrace();
			}

	}
		
	}
	public void delete(int num) {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = DriverManager.getConnection(url, username, passwd);
			String sql = "delete from test where num=? ";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, num);
			
			int n = pstmt.executeUpdate();
			
		} catch (Exception e) {
		e.printStackTrace();
		}finally {			
			try {
				
				if(pstmt != null)pstmt.close();
				if(con != null)con.close();
			
			} catch (Exception e) {
				e.printStackTrace();
			}

	}
	}
	
	public void update(String name, String address,int num) {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = DriverManager.getConnection(url, username, passwd);
			String sql ="updat test set username =? address=? where num=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(3, num);
			pstmt.setString(1, name);
			pstmt.setString(2, address);
			
			int n = pstmt.executeUpdate();
			
			
		}catch (Exception e) {
			e.printStackTrace();
			}finally {			
				try {
					
					if(pstmt != null)pstmt.close();
					if(con != null)con.close();
				
				} catch (Exception e) {
					e.printStackTrace();
				}

		}
	}

}
