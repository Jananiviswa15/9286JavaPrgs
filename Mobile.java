import javax.crypto.KeyAgreement;

//parent --> super/  base 
//child --> sub derived

//extends

//final keyword --> class, method, attr
//final cls cant be extended --> string cls, immutable cls
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
	
	//cant override 
	final void rulesAndRegulations() {
		System.out.println("u cant change it");
	}
	
	final void displayDetails(String name) {	
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
	
	
	//not overriding, becoz parent class method is private, which is not visible to the child
//	private void parentsPersonal() {
//		System.out.println("dont touch");
//	}
}

class SmartPhone extends keypadMobile{

short screenSize;
short cameraPxls;
public SmartPhone() {
	System.out.println("no arg const");
}

public SmartPhone(	int cost, String brandName, String buttonColor, short screenSize, short cameraPxls) {
	super(buttonColor, cost, brandName);
	this.screenSize = screenSize;
	this.cameraPxls = cameraPxls;
}

 void displayDetails() {
	super.displayDetails();
	System.out.print(this.screenSize+" "+this.cameraPxls);
}
}