
public class Students {

	boolean isActiveStdnt;
	int mathsMark;
	int sciMark;
	static int noOfExams;  //dec
	static {
		noOfExams = 10;
		System.out.println(" hi i am from stat");
	}
	
	void display() {
		System.out.println("hi i am a non stati mathod");
	}
	
	static void sayHi() { //default
		System.out.println("stat method");
	}
	
	void calculateSum(int num1, int num2) { //100, 100
		System.out.println(num1+num2);  //10 + 10 = 20 
	}
	
	static void rulesAndRegulations(int year ) {  //param	
		
		
		int foundedYear = year;  //10000
		//str concat
		System.out.println("it is not going to change - founded year "+foundedYear);
	
	}
	
	static void stringConcat() {
		
		System.out.println(10+10);
		System.out.println("10"+10);  //1010
		System.out.println("kalpesh kumar"+10+20); 	//"kalpesh kumar10"+20
		System.out.println(10+20+"kalpesh kumar"+10+20);
	
	}
	public static void main(String args[]) {
	System.out.println(" hi i am from main");
		sayHi();
		rulesAndRegulations(10000);
		System.out.println(noOfExams);
		noOfExams = 34;
		System.out.println(noOfExams);

		Students student2;
		Students student1 = new Students();
		System.out.println(student1.isActiveStdnt);
		student1.mathsMark = 100;
		student1.sciMark = 100;
		student2= new Students();
		student2.isActiveStdnt = true;
		System.out.println(student2.isActiveStdnt);
		student1.display();
		student1.calculateSum(student1.mathsMark, student1.sciMark);
		student2.mathsMark = 1;
		student2.sciMark = 1;
		student2.calculateSum(student2.mathsMark, student2.sciMark);
		System.out.println(student1.noOfExams);//Students.noOfExams
		student1.sayHi();
		stringConcat();
	}
}
