package Autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Autowired  //byTYpe / byName
	@Qualifier("adrsObj")
	private Address adrs;
	
	//@Autowired
//	public Employee(Address adrs) {
//	System.out.println("i came here");
//		this.adrs = adrs;
//	}

	public Address getAdrs() {
		return adrs;
	}

//	@Autowired  //byTYpe / byName
//	@Qualifier("adrsObj")
/*	public void setAdrs(Address adrs) {
		System.out.println("i came inside setter method");
		this.adrs = adrs;
	}*/

	void displayDetails() {
		System.out.println(name);
		adrs.displayAddrs();
	}
}
