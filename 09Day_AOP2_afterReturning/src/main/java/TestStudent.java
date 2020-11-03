import org.springframework.context.support.GenericXmlApplicationContext;

import com.aspect.StudentAfterAspect;
import com.dto.Student;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//IoC 컨테이너 
GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("stu.xml");
Student stu = ctx.getBean("stu",Student.class);
System.out.println(stu.sayEcho());

StudentAfterAspect stu1 = ctx.getBean("aspect", StudentAfterAspect.class);
System.out.println(stu1);
		
	}

}
