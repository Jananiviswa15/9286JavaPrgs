package JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class BatchClass2 {
	public static void main(String args[]) {
		String UPDATESQL="UPDATE employee_table set salary=? WHERE employee_id=?";
		try{
			Connection connection = DBUtility.getConnection();
			PreparedStatement ps= connection.prepareStatement(UPDATESQL);
			ps.setDouble(1, 70000.00);
			ps.setInt(2, 1);

			ps.addBatch();  //1

			ps.setDouble(1, 95000.00);
			ps.setInt(2, 2);  //0

			ps.addBatch();

			ps.setDouble(1, 75000.00);
			ps.setInt(2, 20);  //0

			ps.addBatch();

			int[] executeBatch = ps.executeBatch();
			for (int i : executeBatch) {
				System.out.println(i);
			}
		}
			catch(Exception ex) {
				System.out.println(ex);
			}

		}

	}
