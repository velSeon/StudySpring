import java.util.List;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.service.DeptService;

public class TestStudent {

	public static void main(String[] args) {

		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("dao.xml");

		
		DeptService stu1 = ctx.getBean("DeptService", DeptService.class);
		List<String> list = stu1.list();
		for(String string :list) {
			System.out.println(string);
		}
		
		System.out.println(stu1.list());
		
		
		/*
		 * Student stu1 = ctx.getBean("firstStudent", Student.class);
		 * System.out.println(stu1.getInfo()); Cat cat1 = stu1.getCat();
		 * System.out.println(cat1.getCatInfo());
		 * 
		 * 
		 * Cat cat = ctx.getBean("pet01", Cat.class);
		 * System.out.println(cat.getCatInfo());
		 */


		 
	}

}
