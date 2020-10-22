import org.springframework.context.support.GenericXmlApplicationContext;

import com.dto.Cat;
import com.dto.Student;

public class TestStudent {

	public static void main(String[] args) {

		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("stu.xml");

		Student stu1 = ctx.getBean("firstStudent", Student.class);
		System.out.println(stu1.getInfo());
		Cat cat1 = stu1.getCat();
		System.out.println(cat1.getCatInfo());

		
		 Cat cat = ctx.getBean("pet01", Cat.class);
		 System.out.println(cat.getCatInfo());
		 


		 
	}

}
