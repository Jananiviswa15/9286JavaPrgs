package JDBC;

import java.math.BigDecimal;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class CallableStmt {

	public static void main(String args[]) {
		String sql = "call getEmployeeById(?)";
		try {
			Connection conn = DBUtility.getConnection();
			CallableStatement callableStmt = conn.prepareCall(sql);
			Scanner scan = new Scanner(System.in);
			callableStmt.setInt(1, scan.nextInt());
			ResultSet resultSet =  callableStmt.executeQuery();
			if(resultSet.next()) {
				int empId = resultSet.getInt("employee_id");
				String name = resultSet.getString("employee_name");
				String email = resultSet.getString("email");
				Double salary = resultSet.getDouble(4);
				BigDecimal bonus = resultSet.getBigDecimal(6);
				System.out.println(empId+ " "+ name + " "+ " "+email+" "+ salary+" "+bonus);

			}
		}
		catch(Exception ex) {
			System.out.println(ex);
		}
	}
}
