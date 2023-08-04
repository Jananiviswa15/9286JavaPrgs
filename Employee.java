package Resource;



import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {

	private String name;
	private int age;
	private String designation;
	
	@Resource(name = "panObj1")
	//@Qualifier("panObj1")
	private Pancard pancardDetails;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	
	
	public void setAge(int age) {
		this.age = age;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public Pancard getPancardDetails() {
		return pancardDetails;
	}
	public void setPancardDetails(Pancard pancardDetails) {
		this.pancardDetails = pancardDetails;
	}
	
	
	void display() {
		System.out.println(name +" "+ age +" "+designation);
		pancardDetails.display();
	}
}
