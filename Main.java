package HQL;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;



public class Main {

	public static void main(String[] args) {
		Configuration config = new Configuration().configure().addAnnotatedClass(Product.class);
		SessionFactory sessionFact = config.buildSessionFactory();
		Session session = sessionFact.openSession();

		//Query<Product> qry = session.createQuery("from Product p");
		Query<Product> qry = session.createQuery("from Product p order by p.price desc");
		List<Product> productList =qry.list();
		System.out.println("Total Number Of Records : "+ productList.size());
		Iterator<Product> it =  productList.iterator();

		while(it.hasNext())
		{
			Object obj = (Object)it.next();
			Product prod = (Product)obj;
			System.out.println("Product id : "+prod.getProductId());
			System.out.println("Product Name : "+prod.getProName());
			System.out.println("Product Price : "+prod.getPrice());
			System.out.println("----------------------");
		}		

/*	Query<Product> qry1 = session.createQuery("from Product p where p.productId=:id");
		qry1.setParameter("id",1);  //scan

		List<Product> list1 =qry1.list();
		System.out.println("Total Number Of Records : "+list1.size());
		Iterator<Product> itr = list1.iterator();

		while(itr.hasNext())
		{
			Object obj = (Object) itr.next();
			Product prod = (Product)obj;
			System.out.println("Product Name : "+prod.getProName());
			System.out.println("Product Price : "+prod.getPrice());
			System.out.println("---------------------------");

		}*/

//		session.beginTransaction();
//		Query qry2 = session.createQuery("update Product p set p.proName=?1 where p.productId=:id");
//		qry2.setParameter(1,"new");
//		qry2.setParameter("id", 1); //2nd way
//		int res = qry2.executeUpdate();

/*
		Query query=session.createQuery("delete from Product p where p.productId=?1");
		query.setParameter(1, 1);  //1st way
		int rowsDeleted=query.executeUpdate();
		session.getTransaction().commit();*/
}

}
