
import org.springframework.context.support.GenericXmlApplicationContext;

import com.dto.Student;


public class TestStudent {
	public static void main(String[] args) {

	GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("stu.xml");

	ctx.close();//destroy-method위해서 
	

	
	}

}
