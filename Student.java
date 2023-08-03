package DIwithFactory;

public class Student {
	
	private static final Student std = new Student();
	private Student() {
		System.out.println("constr");
	}

	private static Student getStdInstance() {
		return std;
	}
	
	public void sayHi() {
		System.out.println("hello i am a stdnt");
	}
}
