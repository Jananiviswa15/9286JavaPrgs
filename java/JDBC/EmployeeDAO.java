package JDBC;

import java.util.List;

public interface EmployeeDAO {

	void createEmployee(Employee emp);
	Employee getEmployeeById(Integer empId);
	void updateEmployeeDetails(String email, Integer empId);
	void deleteEmployeeById(Integer empId);
	List<Employee> getAllEmployees();
}
