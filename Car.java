package SpringCore;

public class Car implements Vehicle{

	private String brandName;
	public Car(String brandName) {
		System.out.println("constructor");
		this.brandName = brandName;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		System.out.println("hi all");
		this.brandName = brandName;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		System.out.println("hi all");
		this.cost = cost;
	}
	private int cost;
	Car(){
		System.out.println("it is a car");
	}
	@Override
	public void moving() {
		System.out.println("car started...");

	}

	public void displayDetails() {
		System.out.println(brandName+" "+ cost);
	}

}
