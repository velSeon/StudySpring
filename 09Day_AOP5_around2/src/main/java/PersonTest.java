import org.springframework.context.support.GenericXmlApplicationContext;

import com.aspect.PersonAroundAspect;

import com.spring.Person;

public class PersonTest {

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("com/spring/person.xml");	
	
		
		Person per = ctx.getBean("xxx", Person.class);
		 System.out.println(per.getInfo());
	}

}
