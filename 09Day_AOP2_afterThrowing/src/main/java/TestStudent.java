import org.springframework.context.support.GenericXmlApplicationContext;

import com.aspect.StudentAfterThrowingAspect;
import com.dto.Student;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//IoC 컨테이너 
GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("stu.xml");
try {
	Student stu = ctx.getBean("stu",Student.class);
	System.out.println(stu.sayEcho());
			
			 StudentAfterThrowingAspect stu1 = ctx.getBean("aspect",StudentAfterThrowingAspect.class); 
			 System.out.println(stu1);
			  
} catch (Exception e) {
	System.out.println("error 발생==========");
	System.out.println(e.getMessage());
	e.printStackTrace();
}
		
		 
		 
	}

}
