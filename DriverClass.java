package OneToMany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class DriverClass {

	public static void main(String[] args) {
		Configuration config = new Configuration().configure().addAnnotatedClass(Employee.class).addAnnotatedClass(Address.class);;
		SessionFactory sessionFact = config.buildSessionFactory();
		Session session = sessionFact.openSession();
		createEmployee(session);


	}

	private static void createEmployee(Session session) {
		
		Employee emp = getEmployee();
		session.beginTransaction();
		int id = 	(Integer) session.save(emp);  
		session.getTransaction().commit();
		System.out.println("employee inserted with "+id+"as empId");

	}

	private static Employee getEmployee() {
		Employee empObj = new Employee();
		empObj.setEmail("aniviswa@gmail.com");
		empObj.setName("janani");
		
		Address adrsObj = new Address();
		adrsObj.setCity("agra");
		adrsObj.setState("delhi");
		adrsObj.setPincode(324344);
		
		Address adrsObj1 = new Address();
		adrsObj1.setCity("chennai");
		adrsObj1.setState("TN");
		adrsObj1.setPincode(641035);
		
		empObj.getAdrs().add(adrsObj1);
		empObj.getAdrs().add(adrsObj);
		return empObj;
	}

}
