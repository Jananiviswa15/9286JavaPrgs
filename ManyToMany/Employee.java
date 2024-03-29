package ManyToMany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.annotations.DynamicUpdate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
@DynamicUpdate
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer empId;
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [empId=").append(empId).append(", name=").append(name).append(", email=").append(email)
				.append("]");
		return builder.toString();
	}
	@Column(name = "emp_name", length = 20,nullable = false)
	private String name;
	
	@Column(name = "emp_mail", unique = true, nullable = false)
	private String email;
	
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinTable(name = "newtablename", joinColumns = @JoinColumn(name = "employee"),inverseJoinColumns = @JoinColumn(name = "adrs"))
	private List<Address> adrs = new ArrayList<Address>();  //adrs_adrsid
	
	
	public List<Address> getAdrs() {
		return adrs;
	}
	
	public void setAdrs(List<Address> adrs) {
		this.adrs = adrs;
	}
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
