import java.util.List;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.dao.TestDAO;
import com.dto.TestDTO;



public class testMain {

	public static void main(String[] args) {
	GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:com/config/test.xml");
	
	TestDAO dao = ctx.getBean("TestDAO", TestDAO.class);
	List<TestDTO> list = dao.select();
	
	dao.insert(8, "애옹", "경기도");
	for (TestDTO testDAO : list) {
		System.out.println(testDAO);
	}

	System.out.println(dao.selectByName("유미"));
	
	}

	
}
