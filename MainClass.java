package BeanLifeCycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("lifeCycle.xml");
		//SampleClass obj = appContext.getBean("sampleObj", SampleClass.class);
		((AbstractApplicationContext) appContext).close();

	}

}
