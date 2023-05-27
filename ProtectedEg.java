package checkDefault;

public class ProtectedEg {

	protected String name;
	ProtectedEg(){
		System.out.println("no arg cons");
	}

	static {
		System.out.println("stat block");
	}
	protected void display() {
		System.out.println("say hi");
	}
	void display1() {
		System.out.println("say hi1");
	}
	{
		name = "hi";	
		System.out.println("instance block");
		display1();
	}
	public static void main(String args[]) {
		System.out.println(" main method");
		ProtectedEg obj  = new ProtectedEg(); //instance , dc , match con
		ProtectedEg obj1 = new ProtectedEg();
	}

}
