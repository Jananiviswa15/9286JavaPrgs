package Inheritence;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



public class DriverManager {

	public static void main(String[] args) {
		
		
		Person person = new Person();
		person.setAge(10);
		person.setName("swathi");
		
		Student stdnt = new Student();
		stdnt.setAge(14);
		stdnt.setGrade(10);
		stdnt.setName("anusha");
		stdnt.setSchoolName("ABC");
		
		Employee emp = new Employee();
		emp.setAge(26);
		emp.setCompanyName("amazon");
		emp.setDesignation("lead");
		emp.setName("dhinesh");
		
		
		Configuration config = new Configuration().configure().addAnnotatedClass(Employee.class).addAnnotatedClass(Student.class).addAnnotatedClass(Person.class);
		SessionFactory sessionFact = config.buildSessionFactory();
		Session session = sessionFact.openSession();
		session.beginTransaction();
		session.persist(emp);
		session.persist(stdnt);
		session.persist(person);
		session.getTransaction().commit();

	}

}
