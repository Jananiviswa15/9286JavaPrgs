

//class, method, constr, attr
//top / major
public class AccessModifiers {

	private int age = 29;
	private static String name = "janani";
	private static void display() {
		System.out.println("static meth");
//		AccessModifiers obj1 = new AccessModifiers();
//		obj1.sayHi();
//		System.out.println(obj1.age);
	}
	
	private void sayHi() {
		System.out.println("non static meth");
		display();
		System.out.println(name);
	}
	public static void main(String args[]) {
AccessModifiers obj = new AccessModifiers();
//		System.out.println(obj.age);
	obj.sayHi();
//		System.out.println(name);
		//display();
//		
		
	}
}
