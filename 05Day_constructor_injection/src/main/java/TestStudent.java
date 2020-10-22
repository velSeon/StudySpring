import java.util.List;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.service.DeptService;

public class TestStudent {

	public static void main(String[] args) {
		
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("dao.xml");
		DeptService ser = ctx.getBean("serevice", DeptService.class);
		System.out.println(ser.toString());
		
		List<String> list = ser.list();
		for (String string : list) {
			System.out.println(string);
		} 
	}
}
