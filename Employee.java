package Hibernate.HibernatePrjcts;

import org.hibernate.annotations.DynamicUpdate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity//(name = "emp_table")//classs name
@Table(name = "employee_table")
@DynamicUpdate
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer empId;
	
	@Column(name = "emp_name", length = 20,nullable = false )
	private String name;
	
	@Column(name = "emp_mail", unique = true, nullable = false)
	private String email;
	private Double salary;
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [empId=").append(empId).append(", name=").append(name).append(", email=").append(email)
				.append(", salary=").append(salary).append(", iDontWantToGoFrDB=").append(iDontWantToGoFrDB)
				.append("]");
		return builder.toString();
	}
	@Transient
	private String iDontWantToGoFrDB;
	
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
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
}
