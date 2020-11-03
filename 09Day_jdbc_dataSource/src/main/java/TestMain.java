import java.util.ArrayList;
import java.util.List;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.dao.TestDAO;
import com.dto.TestDTO;

public class TestMain {
public static void main(String[] args) {
		
//		 TestDAO dao = new TestDAO(); //update 안됨.!!! dao.update("김우리", "경기도", 6);
//		 ArrayList<TestDTO> list = dao.select(); for(TestDTO dto : list) {
//		 
//		 System.out.println(dto); }
		 
	
	
	GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:com/config/test.xml");
	TestDAO dao = ctx.getBean("testDAO", TestDAO.class);
	dao.update("유미", "경기도", 7);
	//dao.insert(7, "이유이", "서울");
	
	
		/*
		 * List<TestDTO> list = dao.select(); for (TestDTO testDAO : list) {
		 * System.out.println(list); }
		 */


}
}
