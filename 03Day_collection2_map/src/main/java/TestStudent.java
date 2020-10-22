

import java.util.Map;
import java.util.Set;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.dto.Cat;
import com.dto.Student;


public class TestStudent {
	public static void main(String[] args) {
		
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("stu.xml");
		Student stu = ctx.getBean("firstStudent", Student.class);
		System.out.println(stu.getInfo());
		
		Map<String, Cat> map = stu.getMap();
		
		for (String key : map.keySet()) {
			System.out.println("key=="+key+"  value"+map.values());
		}
		
		

		/*
		 * GenericXmlApplicationContext ctx = new
		 * GenericXmlApplicationContext("stu.xml"); Student stu =
		 * ctx.getBean("firstStudent", Student.class);
		 * System.out.println(stu.getInfo());
		 * 
		 * Map<String, Cat> map = stu.getMap(); Set<String> keys = map.keySet();
		 * 
		 * for(String key : keys) {
		 * System.out.println(key+"="+map.get(key).getCatInfo()); }
		 * 
		 * 
		 * for (Map.Entry<String, Cat> entry : map.entrySet()) {
		 * System.out.println("key="+entry.getKey()+"\t"+"value="+entry.getValue()); }
		 * 
		 * for(String key : map.keySet()) { System.out.println("key==="+key); } for(Cat
		 * value : map.values()) { System.out.println("value===="+value); }
		 */
	}

}
