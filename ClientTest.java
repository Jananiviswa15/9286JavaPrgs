package JDBC;

import java.math.BigDecimal;
import java.security.DrbgParameters.Reseed;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ClientTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

//		createEmployee();
		//updateEmployeeById();
		//DeleteEmployeeById();
		//		fetchEmployeeById();
		fetchEmployees();
	}

	private static void fetchEmployees() {
		try {
			Connection connection = DBUtility.getConnection();
			Statement stmt = connection.createStatement();
			String selectQuery = " SELECT * FROM employee_table";
			ResultSet resultSet = stmt.executeQuery(selectQuery);
				while(resultSet.next()) {
					int empId = resultSet.getInt("employee_id");
					String name = resultSet.getString("employee_name");
					String email = resultSet.getString("email");
					Double salary = resultSet.getDouble(4);
					BigDecimal bonus = resultSet.getBigDecimal(6);
					System.out.println(empId+ " "+ name + " "+ " "+email+" "+ salary+" "+bonus);

				}
			

		}
		catch (Exception e) {
			e.printStackTrace();
		}


	}

	private static void fetchEmployeeById() {

		try {
			Connection connection = DBUtility.getConnection();
			Statement stmt = connection.createStatement();
			String selectQuery = " SELECT * FROM employee_table where employee_id = 3";
			//	boolean resultSet = stmt.execute(selectQuery);
			ResultSet resultSet = stmt.executeQuery(selectQuery);
			if(resultSet.next()) {
				int empId = resultSet.getInt("employee_id");
				String name = resultSet.getString("employee_name");
				String email = resultSet.getString("email");
				Double salary = resultSet.getDouble(4);
				BigDecimal bonus = resultSet.getBigDecimal(6);
				System.out.println(empId+ " "+ name + " "+ " "+email+" "+ salary+" "+bonus);

			}
			else
				System.out.println("no employee with that id");
		}
		catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static void DeleteEmployeeById() {

		try {
			Connection connection = DBUtility.getConnection();
			Statement stmt = connection.createStatement();
			String deleteQuery = "DELETE FROM   employee_table WHERE employee_id = 2";
			int records = stmt.executeUpdate(deleteQuery);
			if(records == 1)
				System.out.println("employee has been deleted");
			else
				System.out.println("prblm encountered...");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void updateEmployeeById() {
		try {
			Connection connection = DBUtility.getConnection();
			Statement stmt = connection.createStatement();
			String updateQuery = "UPDATE employee_table  SET email = 'newmail@gmail.com' where employee_id = 1";
			int records = stmt.executeUpdate(updateQuery);
			if(records == 1)
				System.out.println("employee has been updated");
			else
				System.out.println("prblm encountered...");
		}
		catch (Exception e) {
			e.printStackTrace();
		}		

	}

	private static void createEmployee() {

		try {
			Connection connection = DBUtility.getConnection();
			Statement stmt = connection.createStatement();
			String insertQuery = "INSERT INTO employee_table(employee_name, email, salary,date_of_joining,bonus)"
					+ "values('viswa', 'viswa@gmail.com', 50000.00, '2023-07-20', 500.00)";  
			int records = stmt.executeUpdate(insertQuery);
			if(records == 1)
				System.out.println("employee has been inserted");
			else
				System.out.println("prblm encountered...");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		//	finally {
		//		connection.close();
		//	}

	}



}
