import org.springframework.context.support.GenericXmlApplicationContext;

import com.aspect.StudentBeforeAspect;

import com.spring.Person;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//IoC 컨테이너 
GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:com/spring/person.xml");
Person p = ctx.getBean("person",Person.class);
p.getInfo();



		/*
		 * StudentBeforeAspect p2 = ctx.getBean("aspect" , StudentBeforeAspect.class);
		 * System.out.println(p2);
		 */

	}

}
