
public class MethodOverloadingEg {
	
	//non stat and stat methods can be overloaded 
	//main method can also overloaded
	void display() {
		System.out.println("say hi");
	}
	
	void display(String name, int rollNum) { // ("nklh", 79)
		System.out.println("my name is "+name);
	}
	
	
	void display(int rollNum, String name) {  //34, ""
		System.out.println("my name is "+name);
	}
	
	void display(int totalMarks) {
		System.out.println(totalMarks);
	}
	
	int add(int num1, int num2) {
		System.out.println("inside int method");
		return num1+num2;
	}
	
	void add(int num1, int num2, int num3, int num4) {
		//return num1+num2;
		System.out.println(num1+num2+num3+num4);
	}
	
	
	void add(float num1, float num2) {
	System.out.println(num1+num2);	
	}
	
	public static void main(String name) {
		System.out.println(" im main");
	}
	public static void main(String args[]) {
		MethodOverloadingEg obj = new MethodOverloadingEg();
		obj.add(10.0f,20.0f);
		main("hi");
		
	}

}
