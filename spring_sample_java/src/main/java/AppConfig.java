import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import com.jfs.repository.CustomerRepository;
import com.jfs.repository.HibernateCustomerRepositoryImpl;
import com.jfs.service.CustomerService;
import com.jfs.service.CustomerServiceImpl;

@Configuration
@ComponentScan({"com.jfs"})
@PropertySource("app.properties")
public class AppConfig {
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer getPropertySourcesPlaceholderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}
	
//	@Bean(name = "customerService")
//	public CustomerService getCustomerService() {
//		CustomerServiceImpl service = new CustomerServiceImpl();
//		CustomerServiceImpl service = new CustomerServiceImpl(getCustomerRepository());
//		service.setCustomerRepository(getCustomerRepository());
//		return service;
//	}
//	@Bean(name = "customerRepository")
//	public CustomerRepository getCustomerRepository() {
//		return new HibernateCustomerRepositoryImpl();
//	}
}
