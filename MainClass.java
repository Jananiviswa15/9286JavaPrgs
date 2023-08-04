package Resource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainClass {

	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("ResourceConfig.xml");
		Employee obj =  appContext.getBean("empObj", Employee.class);
		obj.display();

	}

}
