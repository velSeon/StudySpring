import org.springframework.context.support.GenericXmlApplicationContext;

import com.spring.Person;

public class PersonTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("echo1.xml","echo2.xml");
		
		Person person = ctx.getBean("onePerson", Person.class);
		System.out.println("person  :"+person.toString());
	
		
	}

}

