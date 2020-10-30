import java.util.List;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.dao.TestDAO;
import com.dto.TestDTO;



public class testMain {

	public static void main(String[] args) {
	GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:com/config/test.xml");
	
	TestDAO dao = ctx.getBean("TestDAO", TestDAO.class);
	List<TestDTO> list = dao.select();
	
	for (TestDTO testDAO : list) {
		System.out.println(testDAO);
	}

	}

}
