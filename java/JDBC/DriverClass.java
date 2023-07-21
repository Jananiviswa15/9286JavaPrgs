package JDBC;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class DriverClass {
//scanner
	
	//switch case
	public static void main(String[] args) {
		EmployeeDAOImpl obj = new EmployeeDAOImpl();
	
		//obj.createEmployee(getEmployee());
//		if(obj.getEmployeeById(40) != null)
//			System.out.println(obj.getEmployeeById(40));
//		else
//			System.out.println("emp not found");
	//	obj.updateEmployeeDetails("newMail", 40);
//obj.deleteEmployeeById(4);
		List<Employee> empList = 	obj.getAllEmployees();
		for(Employee emp : empList)
			System.out.println(emp);
	}

	
	private static Employee getEmployee() {
		//here read user input
		Employee emp = new Employee();
		emp.setBonus(new BigDecimal(2900));
	//	emp.setDoj(new Date());
		emp.setEmail("hello@gmail.com");
		emp.setEmpName("harini");
		emp.setSalary(90000.00);
		return emp;
	}
}
