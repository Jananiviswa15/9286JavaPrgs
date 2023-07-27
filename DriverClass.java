package Hibernate.HibernatePrjcts;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DriverClass {

	public static void main(String[] args) {

		Configuration config = new Configuration().configure().addAnnotatedClass(Employee.class);
		SessionFactory sessionFact = config.buildSessionFactory();
		Session session = sessionFact.openSession();
		createEmployee(session);
		//getEmployeeById(session);
		//updateEmployeeDetail(session);
		//deleteEmployee(session);
		//sessionFact.close(); //drop the table
	}

	private static void deleteEmployee(Session session) {
		Employee fromDb = session.get(Employee.class, 1);
		if(fromDb != null) {
			session.beginTransaction();
			session.remove(fromDb);  //delete
			session.getTransaction().commit();
		}

	}

	private static void updateEmployeeDetail(Session session) {
		Employee fromDb = session.get(Employee.class, 1);
		if(fromDb != null) {
			session.beginTransaction();
			fromDb.setEmail("viswa@gmail.com");
			fromDb.setName("janan         i");
			session.saveOrUpdate(fromDb);
			session.getTransaction().commit();
		}

	}

	private static void getEmployeeById(Session session) {
		Employee fromDb = session.get(Employee.class, 1);
		if(fromDb != null) {
			System.out.println(fromDb);
		}
		else
			System.out.println("emplyee is not there");

	}

	private static Employee getEmployee() {
		Employee empObj = new Employee();
		empObj.setEmail("jananiviswa@gmail.com");
		empObj.setName("janani");
		empObj.setSalary(32345.00);
		return empObj;
	}

	private static void createEmployee(Session session) {
		Employee emp = getEmployee();
		session.beginTransaction();
		int id = 	(Integer) session.save(emp);
		session.getTransaction().commit();
		System.out.println("employee inserted with "+id+"as empId");

	}
}