package SpringCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DriverClass {

	public static void main(String[] args) {
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("NewFile1.xml");
		EdubridgeEmployee employee = (EdubridgeEmployee) appContext.getBean("eduEmp");
		
		employee.displayAllDetails();
		;
	}

}
