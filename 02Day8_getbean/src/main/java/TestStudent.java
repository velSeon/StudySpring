import org.springframework.context.support.GenericXmlApplicationContext;

import com.dto.Student;

public class TestStudent {

	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:com/config/stu.xml");
		
		Student stu1  = ctx.getBean("aa", Student.class);
		Student stu3  = ctx.getBean("aa", Student.class);
		
		System.out.println(stu1 == stu3);//true
		
		Student stu2 = ctx.getBean("bb", Student.class);
		Student stu4 = ctx.getBean("bb", Student.class);
		
		
		System.out.println(stu2 == stu4);//true
		System.out.println(stu1 == stu2);//false
	
		/*
		 * GenericXmlApplicationContext ctx = new
		 * GenericXmlApplicationContext("classpath:com/config/stu.xml");
		 * 
		 * Student stu = ctx.getBean("stu1",Student.class); //"stu"로 만들어진 bean을 가져와라.
		 * stu.xml에 있는 id 값: "stu" System.out.println(stu); //toString으로 안에 있는 값을 찍어냄.
		 * 
		 * Student stu3 = ctx.getBean("stu1", Student.class); System.out.println(stu ==
		 * stu3); //true
		 * 
		 * Student stu2 = ctx.getBean("stu2",Student.class);
		 * 
		 * Student stu4 = ctx.getBean("stu2",Student.class); System.out.println(stu ==
		 * stu2); //false System.out.println(stu2 == stu4); //true
		 */		
	}

}
