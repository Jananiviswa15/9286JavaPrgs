package ManyToMany;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchDetails {

	public static void main(String[] args) {
		Configuration config = new Configuration().configure().addAnnotatedClass(Employee.class).addAnnotatedClass(Address.class);;
		SessionFactory sessionFact = config.buildSessionFactory();
		Session session = sessionFact.openSession();
		//getAdrsEmpDetailsByEmpId(session);
		getAdrsEmpDetailsByAdrsId(session);
	}

	private static void getAdrsEmpDetailsByAdrsId(Session session) {

		Address adrsObj = session.get(Address.class, 2);
		if(adrsObj != null) {
			System.out.println(adrsObj);
		}
	}

	private static void getAdrsEmpDetailsByEmpId(Session session) {
		Employee empObj = session.get(Employee.class, 2);
		if(empObj != null) {
			System.out.println(empObj);
//			List<Address> adrsList = empObj.getAdrs();
//			for(int ctr = 0; ctr < adrsList.size(); ctr++) {
//				System.out.println(empObj.getAdrs().get(ctr));
//			}

		}

	}

}
