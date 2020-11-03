import org.springframework.context.support.GenericXmlApplicationContext;

import com.dto.Student;

public class TestStudent {

	public static void main(String[] args) {
		/*
		 * Student s = new Student("홍길동", 20); System.out.println(s);
		 */
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("stu.xml");
		
		
		
	}

}
