import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jfs.service.CustomerService;
import com.jfs.service.CustomerServiceImpl;

public class Application {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		CustomerService service = applicationContext.getBean("customerService", CustomerService.class);
		System.out.println(service.findAll().get(0).getFirstname());
	}
}
