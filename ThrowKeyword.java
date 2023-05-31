package ExceptionHandling;

import java.io.IOException;
import java.sql.SQLException;

import javax.management.RuntimeErrorException;

//checked / unchedcked / custom exce

public class ThrowKeyword {

	static void toValidateAge(int age) throws IOException, SQLException, RuntimeErrorException{
		try {
			if(age <= 18 ) {
				throw new ArithmeticException("age is not valid");
				//	System.out.println("hi");
			}
			else
				System.out.println("age is valid");
		}
		catch(ArithmeticException arth) {
			System.out.println("i will exe");
			age = 19;
		}
	}

	static void toValidateName(String name) {//throws RuntimeException, Exception{
		if(name == null)
			throw new NullPointerException("name cant be null");
		else if(name.length() <= 2)
			throw new RuntimeException("length cant be too short");
		else if(name.equals(" "))
			throw new  RuntimeException("name cant be empty");
		else
			System.out.println("name is valid");

	}
	public static void main(String args[])  throws Exception{
		int age = 18;
		String name = " ";
		toValidateAge(age);
//		try {
//			toValidateName(name);
//		}
//		catch(NullPointerException nullExc) {
//			System.out.println("change value, no null is allowed");	
//		}
//		catch(Exception exc) {
//			System.out.println(" ia m parent");
//		}
	}
}
