

package springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[]args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		ICustomerService customerService = context.getBean("service",ICustomerService.class);
		
		CustomerManager manager = new CustomerManager(context.getBean("database",ICustomerDAL.class));
		manager.add();
		
	}
	
}
