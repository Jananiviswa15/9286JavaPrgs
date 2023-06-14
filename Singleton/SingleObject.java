package Singleton;

public class SingleObject {
	//create an object of SingleObject
	private static SingleObject instance = new SingleObject();  //
	//make the constructor private so that this class cannot be
	//instantiated
	private SingleObject(){System.out.println(" i will come here");}
	//Get the only object available
	public static SingleObject getInstance(){
		return instance;  //new SingleObject();
	}
	public void showMessage(){
		System.out.println("Hello World!");
	}
}


