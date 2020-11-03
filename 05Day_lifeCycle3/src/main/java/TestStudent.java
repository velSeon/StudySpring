
import org.springframework.context.support.GenericXmlApplicationContext;

import com.dto.Man;
import com.dto.Woman;



public class TestStudent {
	public static void main(String[] args) {

	GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("stu.xml");
	Man man = ctx.getBean("man", Man.class);
	Woman w = ctx.getBean("Woman", Woman.class);
	System.out.println(man);
	System.out.println(w);
	ctx.close();//destroy-method위해서 
	

	
	}

}
