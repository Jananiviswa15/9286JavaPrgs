package OneToMany;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Address {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer adrsId;

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Address [adrsId=").append(adrsId).append(", state=").append(state).append(", city=")
				.append(city).append(", pincode=").append(pincode).append("]");
		return builder.toString();
	}

	@ManyToOne
	@JoinColumn(name = "employee_id")
	private Employee emp;
	
	
	public Employee getEmp() {
		return emp;
	}
	public void setEmp(Employee emp) {
		this.emp = emp;
	}
	
	private String state;
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	private String city;
	private int pincode;
}
