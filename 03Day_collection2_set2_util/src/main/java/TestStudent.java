

import java.util.Set;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.dto.Cat;
import com.dto.Student;


public class TestStudent {
	public static void main(String[] args) {

	GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("stu.xml");
	Student stu = ctx.getBean("firstStudent", Student.class);
	System.out.println(stu.getInfo());
	
	Set<Cat> setCat = stu.getSetCat();
	for (Cat cat : setCat) {
		System.out.println("SetCat");
		System.out.println(cat.getCatInfo());
	}
		 
	}

}
