package OneToMany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchDetails {

	public static void main(String[] args) {
		Configuration config = new Configuration().configure().addAnnotatedClass(Employee.class).addAnnotatedClass(Address.class);;
		SessionFactory sessionFact = config.buildSessionFactory();
		Session session = sessionFact.openSession();
		getAdrsEmpDetailsByEmpId(session);
		//getAdrsEmpDetailsByAdrsId(session);
	}

	private static void getAdrsEmpDetailsByAdrsId(Session session) {

		Address adrsObj = session.get(Address.class, 2);
		if(adrsObj != null) {
			System.out.println(adrsObj);
		}
	}

	private static void getAdrsEmpDetailsByEmpId(Session session) {
		Employee empObj = session.get(Employee.class, 1);
		if(empObj != null) {
			System.out.println(empObj);
			System.out.println(empObj.getAdrs().get(0));
			System.out.println(empObj.getAdrs().get(1));
		}
		
	}

}
