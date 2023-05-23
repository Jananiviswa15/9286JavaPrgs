
public class Driver {

	private	String name;
	private int age;

	Driver(String name, int age){
//		this.name = name;
	//	this.age = age;
		setName(name);
		setAge(age);
	}

	Driver(){}
	//public setter --> write
	public void setName(String name) {
		if(name.length() >= 3)
			this.name = name;
	}

	public void setAge(int age) {
		if(age >= 18)
			this.age = age;
	}
	//getter -> read
	public int getAge() {
		return this.age;
	}
	
	public String getName() {
		return this.name;
	}
	void display() {
		System.out.println(this.name+" "+this.age);
	}
	public static void main(String args[]) {
		Driver driver1 = new Driver("geetha", 12);
		driver1.display();
		Driver driver2 = new Driver();
		driver2.setAge(34);
		driver2.setName("akilan");
	//	driver2.display();
		System.out.println(driver2.getAge() + driver2.getName());
	}

}
