
//parent --> super/  base 
//child --> sub derived

//extends
public class Mobile {

	int cost;
	String brandName;
	
	Mobile(){
		System.out.println("parent no arg cons");
	}
	
	Mobile(int cost){
		this.cost = cost;
	}
	
	Mobile(int cost, String brandName){
		this(cost);
		this.brandName = brandName;
	}
	void calling() {
		System.out.println("calling");
	}
	
	void displayDetails() {
		System.out.println(this.cost+" "+this.brandName);
	}
	
	 void displayDetails(String name) {	
	System.out.println("im param frokm parent");
	}
	private void parentsPersonal() {
		System.out.println("dont touch");
	}
}



class keypadMobile extends Mobile{
	//all objs of kp can aces all the methids and attr except private
	
	String buttonColor;
	
	public keypadMobile() {
		System.out.println("child no arg");
	}
	
	public keypadMobile(String buttonColor) {
		this.buttonColor = buttonColor;
	}
	
	public keypadMobile(String buttonColor, int cost , String brandName) {
	//	this(buttonColor);
		super(cost, brandName);
		this.buttonColor = buttonColor;
//		this.cost = cost;
//		this.brandName = brandName;
	}
	
	//method overriding
	void displayDetails() {
		super.displayDetails();
		System.out.print(this.buttonColor);
	}
	
	void calling() {
		System.out.println("press buttongs for calling");
	}
}