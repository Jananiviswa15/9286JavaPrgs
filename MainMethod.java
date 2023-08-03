package BeanCreation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainMethod {

	public static void main(String args[]) {
		//ApplicationContext appContext = new ClassPathXmlApplicationContext("NewFile5.xml");
		ApplicationContext appContext = new AnnotationConfigApplicationContext(CompanyConfug.class);
		Company obj = (Company) appContext.getBean("myBean");
		obj.sayHi();
	}
}
