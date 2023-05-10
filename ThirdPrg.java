

public class ThirdPrg {
	//1. cls var / stat 
	//2. instan / non stat 
	//when ever u need to acces 2. u need to create objss
	//3. local var any var created or decl only inside a method
	//4.parameters

	//non stat
	int number;//a var / attr which is present outside all the methods but inside a cls
//stat attr
	static int noOfAssessments = 10;
	
	
	static void sum(int num1, int num2) { //90,12
		//stat loc var are not allwd
		 int age = 27;
		System.out.println(age);
		System.out.println(num1+num2);
		
	}

	public static void main(String args[]) {
		boolean isListening = false;
		short age = 90;
		sum(age,12);  //90,12	
		System.out.println(age);
//create obj 
		//cn objName = new cn();
		ThirdPrg obj1;
		ThirdPrg obj = new ThirdPrg(); //class NPDT		
		//tyoe of obj see lhs
		//mem occupied by the obj see RHS
		System.out.println(obj.number);
System.out.println(noOfAssessments);		
		obj.number = 100;
		System.out.println(obj.number);
		
	}
}
