

import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.dto.Cat;
import com.dto.Student;


public class TestStudent {
	public static void main(String[] args) {

	GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("stu.xml");
	Student stu = ctx.getBean("firstStudent", Student.class);
	System.out.println(stu);
	
		/*
		 * Set<Cat> setCat = stu.getSetCat(); for (Cat cat : setCat) {
		 * System.out.println("SetCat"); System.out.println(cat.getCatInfo()); }
		 */
		 
	
	Map<String, Cat> mapCat = stu.getMapCat();
	for (String key : mapCat.keySet()) {
		System.out.println("key===="+key + "  value"+mapCat.values());
	}
	
	Properties phones = stu.getPhones();
	Set<String> xxx = phones.stringPropertyNames(); //ket값만 얻어옴
	System.out.println("Properties=====");
	for (String key : xxx) {
		
		System.out.println(key+"="+phones.getProperty(key));
	}
	
	}

}
