
import java.util.List;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.dto.ListStudent;
import com.dto.Student;
public class TestStudent {
	public static void main(String[] args) {

	GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("stu.xml");
	
	ListStudent stu = ctx.getBean("list", ListStudent.class);
	System.out.println("실행됭");
	System.out.println(stu.toString());
	
	ListStudent stu2 = ctx.getBean("list2", ListStudent.class);

		 List<Student> list = stu.getList(); 
		 for (Student student : list) {
		 System.out.println(student); 
		 }
		
		 List<Student> list2 = stu2.getList();
		 System.out.println("stu2====");
		 for (Student student : list2) {
				
			System.out.println(student);
		}

}
}

