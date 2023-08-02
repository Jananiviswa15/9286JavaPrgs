package Autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DriverClass {

	public static void main(String[] args) {
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("NewFile2.xml");
		Employee employee = (Employee) appContext.getBean("eduEmp");
		
		employee.displayDetails();
		;
	}

}
