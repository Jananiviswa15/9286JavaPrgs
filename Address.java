package Autowire;

import org.springframework.beans.factory.annotation.Value;

public class Address {



	private String state;
	public Address(String state, String district) {

		this.state = state;
		this.district = district;
	}

	
	private String inspirationLeader;	
	public String getInspirationLeader() {
		return inspirationLeader;
	}

	@Value("APJ")
	public void setInspirationLeader(String inspirationLeader) {
		this.inspirationLeader = inspirationLeader;
	}

	private String district;

	void displayAddrs() {
		System.out.println("i am from india"+ inspirationLeader);
		System.out.println(state+" "+ district);
	}
}
