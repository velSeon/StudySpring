import org.springframework.context.support.GenericXmlApplicationContext;

import com.spring.Person;

public class PersonTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("person.xml");
		
		Person person = ctx.getBean("onePerson", Person.class);
		System.out.println("person  :"+person.toString());
		/*
		 * Person person1 = ctx.getBean("xxx1", Person.class);
		 * System.out.println("person1  :"+person1);
		 * 
		 * Person person2 = ctx.getBean("xxx2", Person.class);
		 * System.out.println("person2  :"+ person2);
		 * 
		 * Person person3 = ctx.getBean("xxx3", Person.class);
		 * System.out.println("person3  :"+ person3);
		 */
	}

}
