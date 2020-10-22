import java.util.List;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.dto.Cat;
import com.dto.Student;
import com.service.DeptService;

public class TestStudent {

	public static void main(String[] args) {

	
		
		
		/*
		 * Student stu1 = ctx.getBean("firstStudent", Student.class);
		 * System.out.println(stu1.getInfo()); Cat cat1 = stu1.getCat();
		 * System.out.println(cat1.getCatInfo());
		 * 
		 * 
		 * Cat cat = ctx.getBean("pet01", Cat.class);
		 * System.out.println(cat.getCatInfo());
		 */


GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("dao.xml");
DeptService stu = ctx.getBean("DeptService", DeptService.class);
List<String> list = stu.list();
for(String String: list) {
	System.out.println(String);
}

		 
	}

}
