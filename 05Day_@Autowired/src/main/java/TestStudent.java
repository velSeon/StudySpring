
import org.springframework.context.support.GenericXmlApplicationContext;

import com.dto.Student;




public class TestStudent {
	public static void main(String[] args) {

	GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("stu.xml");
	Student stu = ctx.getBean("firststudent", Student.class);
	
	System.out.println(stu.getInfo());
	
	}

}
