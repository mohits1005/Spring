import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jfs.service.CustomerService;

public class Application {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		CustomerService service = applicationContext.getBean("customerService", CustomerService.class);
		System.out.println(service);
		CustomerService service2 = applicationContext.getBean("customerService", CustomerService.class);
		System.out.println(service2);
		System.out.println(service.findAll().get(0).getFirstname());
	}
}
