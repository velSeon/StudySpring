

import org.springframework.context.support.GenericXmlApplicationContext;


import com.dto.Student;


public class TestStudent {

	public static void main(String[] args) {

	
	
	
	GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:com/config/stu.xml");
	Student stu1 = ctx.getBean("stu", Student.class);
	Student stu2 = ctx.getBean("stu", Student.class);
	System.out.println(stu1 == stu2);//false, 객체를 새로 만들어줌
	
	Student stu3 = ctx.getBean("stu2", Student.class);
	Student stu4 = ctx.getBean("stu2", Student.class);
	System.out.println(stu3 == stu4);//ture, 하나의 객체를 사용하기 때문에 같은 객체를 사용함.
	
	Student stu5 = ctx.getBean("scopeTest", Student.class);
	Student stu6 = ctx.getBean("scopeTest", Student.class);
	System.out.println(stu5 == stu6); //ture, 기본값이 singleton
		 
	}

}
