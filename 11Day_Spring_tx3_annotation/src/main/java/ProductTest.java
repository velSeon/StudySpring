import java.util.List;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.entity.OrderDTO;
import com.entity.ProductDTO;
import com.service.ProductService;

public class ProductTest {
	
	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("dept.xml");
		ProductService service = ctx.getBean("ProductService", ProductService.class);
		
//		 List<ProductDTO> list =  service.selectProduct();
//		 for (ProductDTO productDTO : list) {
//			System.out.println(productDTO);
//		}
//		
//		 
//		 System.out.println("OrderDTO=====");
//		 List<OrderDTO> list2 = service.selectOrder();
//		 for (OrderDTO orderDTO : list2) {
//			System.out.println(orderDTO);
//		}
		 
		 System.out.println("p01 상품 5개 주문합니다.");
		 
		 try {
			service.addOrder("p01", 5);
		} catch (Exception e) {
			System.out.println("에러가 발생하여 롤백처리");
		}
		 List<ProductDTO> list =  service.selectProduct();
		 for (ProductDTO productDTO : list) {
			System.out.println(productDTO);
		}
		 System.out.println("OrderDTO=====");
		 List<OrderDTO> list2 = service.selectOrder();
		 for (OrderDTO orderDTO : list2) {
			System.out.println(orderDTO);
		} 
		 
		 
	}
}
