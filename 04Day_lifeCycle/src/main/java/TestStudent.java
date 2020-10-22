

import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.dto.Cat;
import com.dto.Student;


public class TestStudent {
	public static void main(String[] args) {

	GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("stu.xml");
	Student stu = ctx.getBean("stu", Student.class);
	System.out.println(stu.getName());
	ctx.close();//destroy-method위해서 
	

	
	}

}
