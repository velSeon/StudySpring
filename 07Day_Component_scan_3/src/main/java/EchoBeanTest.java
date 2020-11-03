import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.EchoBean;
import com.service.OneService;
import com.service.TwoService;

public class EchoBeanTest {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("echo.xml");
		
		EchoBean bean = ctx.getBean("echoBean",EchoBean.class);
		
		OneService one = bean.getOne();
		TwoService two = bean.getTwo();
		
		one.one();
		two.two();
	}
	
}
