package DIwithFactory;

import java.rmi.StubNotFoundException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("NewFile3.xml");
		//Student obj = (Student) appContext.getBean("std");
		//obj.sayHi();
		
//		Exam obj = (Exam) appContext.getBean("std");
//		obj.writeExams();

		
		Exam obj = (Exam) appContext.getBean("objToHold");
		obj.writeExams();

	}

}
