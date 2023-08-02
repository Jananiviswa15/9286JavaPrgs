package SpringCore;

public class Employee {

	private String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	Employee(){
		System.out.println("emp cons");
	}
	private Address adrs;

	public Address getAdrs() {
		return adrs;
	}

	public void setAdrs(Address adrs) {
		this.adrs = adrs;
	}

	void displayAllDetails() {
		System.out.println(name);
		adrs.display();
	}
}
