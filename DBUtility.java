package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtility {
	private static final String DB_DRIVER_CLASS = "com.mysql.jdbc.Driver";
	private static final String DB_USERNAME = "root";
	private static final String DB_PASSWORD = "Ragul@123";
	private static final String DB_URL = "jdbc:mysql://127.0.0.1:3306/jdbcdb";
	private static Connection connection = null;
	
	static {
		try {
			Class.forName(DB_DRIVER_CLASS);
			connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD); 
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		}
	
	public static Connection getConnection() {
		return connection;
	}

}
