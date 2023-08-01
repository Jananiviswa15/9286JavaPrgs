package SpringCore;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainClass {

	public static void main(String[] args) {
//		Car carObj = new Car();
//		carObj.moving();
//		
//		Bike bikeObj = new Bike();
//		bikeObj.moving();
//
//		
//		Vehicle vechileObj = new Bike();
//		vechileObj.moving();
//		
//		Vehicle vechileObj1 = new Car();
//		vechileObj.moving();
		
		
//		Resource resource = new ClassPathResource("Configuration.xml");
//		BeanFactory beanFact = new XmlBeanFactory(resource);
		ApplicationContext appContext = new ClassPathXmlApplicationContext("Configuration.xml");
		Car carObject = (Car) appContext.getBean("confusingObj");
		carObject.displayDetails();
//		Car carObject1 = (Car) appContext.getBean("carObj1");
//		carObject1.displayDetails();
		
//		Bike bike1 = (Bike)  appContext.getBean("bikeObj");
//		bike1.displayDetails();
//		
//		Bike bike2 = (Bike)  appContext.getBean("bikeObj1");
//		bike2.displayDetails();
//		
		
	}

}
