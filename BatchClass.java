package JDBC;

import java.sql.Connection;
import java.sql.Statement;

public class BatchClass {

	public static void main(String args[]) {
		String insertQuery = "INSERT INTO employee_table(employee_name, email, salary,date_of_joining,bonus)"
				+ "values('viswa', 'viswa@gmail.com', 50000.00, '2023-07-20', 500.00)";
		String updateQuery = 	"UPDATE employee_table  SET email = 'newmail@gmail.com' where employee_id = 1";
		String deleteQuery = "DELETE FROM   employee_table WHERE employee_id = 5";
		
		try {
			Connection conn = DBUtility.getConnection();
			Statement stmt = conn.createStatement();
			stmt.addBatch(deleteQuery);  //0
			stmt.addBatch(updateQuery); //1
			stmt.addBatch(insertQuery); //2
			
		int[] resultBatch =	stmt.executeBatch();
		for(int ctr : resultBatch)
			System.out.println(ctr);
			
		}
		catch(Exception ex) {
			System.out.println(ex);
		}
		
	}
}
