import org.springframework.context.support.GenericXmlApplicationContext;

import com.dto.Student;

public class TestStudent {

	public static void main(String[] args) {

		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("stu.xml");

		Student stu1 = ctx.getBean("firstStudent", Student.class);
		System.out.println(stu1.getInfo());

		
		 Student stu2 = ctx.getBean("secondStudent", Student.class);
		 System.out.println(stu2.getInfo());
		 

		
		
		 Student stu3 = ctx.getBean("thirdStudent", Student.class);
		 System.out.println(stu3.getInfo());
		 
		 
	}

}
