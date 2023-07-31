package ManyToMany;

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
		

		Employee empObj = new Employee();
		empObj.setEmail("aniviswa@gmail.com");
		empObj.setName("janani");
		
		Employee empObj1 = new Employee();
		empObj1.setEmail("adhithya@gmail.com");
		empObj1.setName("aditya");
		
		Address adrsObj = new Address();
		adrsObj.setCity("agra");
		adrsObj.setState("delhi");
		adrsObj.setPincode(324344);
		
		Address adrsObj1 = new Address();
		adrsObj1.setCity("chennai");
		adrsObj1.setState("TN");
		adrsObj1.setPincode(641035);

		Address adrsObj2 = new Address();
		adrsObj2.setCity("Blre");
		adrsObj2.setState("KA");
		adrsObj2.setPincode(34035);
		
		empObj.getAdrs().add(adrsObj2);
		empObj.getAdrs().add(adrsObj1);
		empObj.getAdrs().add(adrsObj);

		empObj1.getAdrs().add(adrsObj2);
		empObj1.getAdrs().add(adrsObj1);
		empObj1.getAdrs().add(adrsObj);
		
		adrsObj.getEmp().add(empObj);
		adrsObj1.getEmp().add(empObj);
		adrsObj2.getEmp().add(empObj);
		
		adrsObj.getEmp().add(empObj1);
		adrsObj1.getEmp().add(empObj1);
		adrsObj2.getEmp().add(empObj1);
		
		
		session.beginTransaction();
		int id1 = 	(Integer) session.save(empObj);
		int id2 = 	(Integer) session.save(empObj1); 
		session.getTransaction().commit();
		System.out.println("employee inserted with "+id1+" "+id2+"as empId");

	}

}
