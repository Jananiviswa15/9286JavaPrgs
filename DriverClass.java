package SpringCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DriverClass {

	public static void main(String[] args) {
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("Config.xml");
		Employee employee = (Employee) appContext.getBean("emp");
		Employee employee1 = (Employee) appContext.getBean("emp1");
		employee.displayAllDetails();
		employee1.displayAllDetails();
	}

}
