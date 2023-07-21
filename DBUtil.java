package JDBC;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBUtil {

//	private static final String DB_DRIVER_CLASS = "com.mysql.jdbc.Driver";
//	private static final String DB_USERNAME = "root";
//	private static final String DB_PASSWORD = "Ragul@123";
//	private static final String DB_URL = "jdbc:mysql://127.0.0.1:3306/jdbcdb";
	
	
	private static final String DB_DRIVER_CLASS = "driver.class.name";
	private static final String DB_USERNAME = "db.username";
	private static final String DB_PASSWORD = "db.password";
	private static final String DB_URL = "db.url";
	
	private static Connection connection = null;
	
	
	static {
		try {
			Properties propertyObj = new Properties();
			propertyObj.load(new FileInputStream("src/main/java/datasource.properties"));
			//Class.forName(DB_DRIVER_CLASS);
			Class.forName(propertyObj.getProperty(DB_DRIVER_CLASS));
			
			propertyObj.put("user", DB_USERNAME);
			//propertyObj.put("password", DB_PASSWORD);
			
		//	connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);  //1st type
			//connection = DriverManager.getConnection(DB_URL,propertyObj);  //2nd type
			//connection = DriverManager.getConnection(DB_URL+"?"+"user="+DB_USERNAME+"&"+"password="+DB_PASSWORD); //3rd type
			
			connection = DriverManager.getConnection(propertyObj.getProperty(DB_URL), propertyObj.getProperty(DB_USERNAME), propertyObj.getProperty(DB_PASSWORD));
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static Connection getConnection() {
		return connection;
	}
}
