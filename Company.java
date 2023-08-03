package BeanCreation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("myBean")
//class name in small case
public class Company { 
	
	//@Autowired
	private Manager manager;  //null  / new Manager()
	
	@Autowired
	//@Qualifier("pythonDeveloper")
	public Company(Manager manager, Developers dev) {
		this.manager = manager;
		this.dev = dev;
	}

//	@Autowired
//	@Qualifier("pythonDeveloper")
	private Developers dev; // new JavaDeveloper / new PythonDeveloper

/*	public void setDev(Developers dev) {
		this.dev = dev;
	}*/

/*	@Autowired
	public void setManager(Manager manager) {
		this.manager = manager;
	}*/

	Company(){System.out.println("no arg constr");}

	//@Autowired
/*	public Company(Manager manager) {
		this.manager = manager;
	}*/

	public void sayHi() {
		System.out.println("hello i am from company");
		manager.display();
		dev.developApps();
	}
}
