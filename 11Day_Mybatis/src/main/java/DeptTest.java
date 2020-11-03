import java.util.List;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.dto.DeptDTO;
import com.service.DeptService;

public class DeptTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:com/config/stu.xml");
		DeptService service = ctx.getBean("service", DeptService.class);

		List<DeptDTO> list = service.selectAll();
		for (DeptDTO deptDTO : list) {
			System.out.println(deptDTO);
		}
	}

}
