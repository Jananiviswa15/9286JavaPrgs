package OneToONe;

import org.hibernate.annotations.DynamicUpdate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

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
				.append(", adrs=").append(adrs).append("]");
		return builder.toString();
	}
	@Column(name = "emp_name", length = 20,nullable = false)
	private String name;
	
	@Column(name = "emp_mail", unique = true, nullable = false)
	private String email;
	
	@OneToOne(cascade = CascadeType.ALL)
	//cascadetype.persist --> (Integer) session.persist(emp);
	//if no cascade is given u should write session.save (adrs), session.save(emp)
	@JoinColumn(name = "stupidColumn") //fk name
	private Address adrs;  //fk has been added in this table
	//def col --> attr_otherClassPK --> adrs_adrsId

	public Address getAdrs() {
		return adrs;
	}
	public void setAdrs(Address adrs) {
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
