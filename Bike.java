package SpringCore;

public class Bike implements Vehicle{
	
	private String brandName;
	private int engineCC;
	
	public Bike(String brandName) {
		System.out.println("1const");
		this.brandName = brandName;
	}
	
	
	
	public Bike(String brandName, int engineCC) {
		System.out.println("2const");
		this.brandName = brandName;
		this.engineCC = engineCC;
	}
	
	public void displayDetails() {
		System.out.println(brandName+" "+ engineCC);
	}
	
	Bike(){
		System.out.println("bike created");
	}
	@Override
	public void moving() {
		System.out.println("bike started...");
	}
}
