
import java.util.List;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.dto.Student;





public class TestStudent {
	public static void main(String[] args) {

	GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("dao.xml");
	Student stu = ctx.getBean("student", Student.class);
	System.out.println(stu);
	
	}

}
