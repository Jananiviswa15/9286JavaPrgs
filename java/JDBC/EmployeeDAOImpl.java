package JDBC;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EmployeeDAOImpl implements EmployeeDAO{
	//values
	public void createEmployee(Employee emp) {
		String insertSQL = "INSERT INTO employee_table(employee_name, email, salary, bonus)"
				+ "VALUES(?,?,?,?)";
		try {
			Connection connection = DBUtility.getConnection();
			PreparedStatement preparedStmt = connection.prepareStatement(insertSQL);
			preparedStmt.setString(1, emp.getEmpName());
			preparedStmt.setString(2, emp.getEmail());
			preparedStmt.setDouble(3, emp.getSalary());
			//preparedStmt.setDate(4,  (java.sql.Date) new Date(622790105000L));
			preparedStmt.setBigDecimal(4, emp.getBonus());

			int recordInserted = preparedStmt.executeUpdate();

			if(recordInserted == 1)
				System.out.println("record inserted...");
			else
				System.out.println("issue occured");

		}
		catch(Exception exc) {
			System.out.println(exc);
		}

	}

	public Employee getEmployeeById(Integer empId) {
		Employee emp = null;
		String selectQuery = "SELECT * FROM employee_table WHERE employee_id=?";
		try {
			Connection connection = DBUtility.getConnection();
			PreparedStatement preparedStmt = connection.prepareStatement(selectQuery);

			preparedStmt.setInt(1,empId);
			ResultSet result = preparedStmt.executeQuery();
			if(result.next()) {
				int employeeId = result.getInt(1);
				String name = result.getString("employee_name");
				String email = result.getString(3);
				double salary = result.getDouble(4);
				Date doj = result.getDate(5);
				BigDecimal bonus = result.getBigDecimal(6);

				emp = new Employee();
				emp.setBonus(bonus);
				emp.setDoj(doj);
				emp.setEmail(email);
				emp.setEmpId(employeeId);
				emp.setSalary(salary);
				emp.setEmpName(name);

			}
			else
				emp = null;
		}
		catch(Exception exc) {
			System.out.println(exc);
		}
		return emp;
	}

	public void updateEmployeeDetails(String email, Integer empId) {

		if(getEmployeeById(empId) != null) {
			String updateQuery = "UPDATE employee_table set email = ? WHERE employee_id = ?";
			try {
				Connection connection = DBUtility.getConnection();
				PreparedStatement preparedStmt = connection.prepareStatement(updateQuery);
				preparedStmt.setString(1, email);
				preparedStmt.setInt(2,empId);
				int updatedRecrds = preparedStmt.executeUpdate();
				System.out.println("records updated.."+updatedRecrds);
			}
			catch(Exception exc) {
				System.out.println(exc);
			}
		}
		else {
			System.out.println("emp doesnt exists...");
		}

	}

	public void deleteEmployeeById(Integer empId) {
		String deleteQuery = "DELETE FROM employee_table WHERE employee_id = ?";
		if(getEmployeeById(empId) != null) {
			try {
				Connection connection = DBUtility.getConnection();
				PreparedStatement preparedStmt = connection.prepareStatement(deleteQuery);
				preparedStmt.setInt(1,empId);
				int deletedRcrds = preparedStmt.executeUpdate();
				System.out.println("deleted records = "+deletedRcrds);
			}
			catch(Exception exc) {
				System.out.println(exc);
			}
		}
		else {
			System.out.println("emp doesnt exists...");
		}

	}

	public List<Employee> getAllEmployees() {
		String selectQuery = "SELECT * FROM employee_table";
		List<Employee> empList = new ArrayList<Employee>();
		try {
			Connection connection = DBUtility.getConnection();
			Statement stmt = connection.createStatement();
			ResultSet resultSet = stmt.executeQuery(selectQuery);

			while(resultSet.next()) {
				int empId = resultSet.getInt("employee_id");
				String name = resultSet.getString("employee_name");
				String email = resultSet.getString("email");
				Double salary = resultSet.getDouble(4);
				Date doj = resultSet.getDate(5);
				BigDecimal bonus = resultSet.getBigDecimal(6);
				//System.out.println(empId+ " "+ name + " "+ " "+email+" "+ salary+" "+bonus);

				Employee emp = new Employee();
				emp.setBonus(bonus);
				emp.setDoj(doj);
				emp.setEmail(email);
				emp.setEmpId(empId);
				emp.setSalary(salary);
				emp.setEmpName(name);

				empList.add(emp);
			}

		}
		catch(Exception exc) {
			System.out.println(exc);
		}
		return empList;
	}

}
