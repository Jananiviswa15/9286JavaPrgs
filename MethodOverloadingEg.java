
public class MethodOverloadingEg {
	
	//non stat and stat methods can be overloaded 
	//main method can also overloaded
	//type / order / no of
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
	
//	int add(float num1, int num2) {//20.0+13  --> 33.0
//		return (int) num1+num2;
//	}
//	
//	void add(float num1, int num2) {
//		
//	}
	
	//add(55)
	static void add(int num) {
		System.out.println();
	}
	
	//add(55,false
	 void add(int num, boolean isMarried) {
		System.out.println();
	}
	//add(89)
	void add(float num1, float num2) {
	System.out.println(num1+num2);	
	}
	
	public static void main(String name) {
		System.out.println(" im main");
	}
	public static void main(String args[]) {
		MethodOverloadingEg obj = new MethodOverloadingEg();
		obj.add(10.0f,20.0f);
		obj.display(10, "dfdf");
		main("hi");
		
	}

}
