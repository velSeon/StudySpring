import java.util.ArrayList;

public class TestMain {
public static void main(String[] args) {
	TestDAO dao = new TestDAO();
	dao.update("김우리", "경기도", 1);
	ArrayList<TestDTO> list = dao.select();
	for(TestDTO dto : list) {
		
		System.out.println(dto);
	}
	
}
}
