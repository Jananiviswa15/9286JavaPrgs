package Hibernate.HibernatePrjcts;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       Employee emp = new Employee();
       emp.setEmail("supriya@gmail.com");
       emp.setName("supriya");
       emp.setSalary(40000.00);
       
       //hibernate.cfg.xml
       //new Configuration().configure("newFile.xml);
       Configuration config = new Configuration().configure().addAnnotatedClass(Employee.class);
       SessionFactory sessionFact = config.buildSessionFactory();
       Session session = sessionFact.openSession();
       session.beginTransaction();
       session.save(emp); //obj --> rec
       session.getTransaction().commit();
       
     
    }
}
