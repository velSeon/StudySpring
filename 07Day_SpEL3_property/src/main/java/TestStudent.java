
import org.springframework.context.support.GenericXmlApplicationContext;

import com.dto.Student;
public class TestStudent {
	public static void main(String[] args) {

	GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("stu.xml");
	Student stu1 = ctx.getBean("stu",Student.class);
	Student stu = ctx.getBean("firstStudent", Student.class);
	System.out.println(stu.toString());
	System.out.println(stu1.toString());
	

}
}

