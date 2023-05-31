package ExceptionHandling;

import java.io.IOException;

public class Parent {

	void display() throws ArrayIndexOutOfBoundsException{
		
	}
}


class child extends Parent{
void display() throws ArithmeticException, NullPointerException , RuntimeException{
		System.out.println("1. no except decl in super class method, only unchecked exc dec is allowed in child class overiden method");
		System.out.println("1. parent is having excp dec, sub class can have equivalent / oarent cls exc");
	}
}