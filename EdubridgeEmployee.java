package SpringCore;

public class EdubridgeEmployee {

	private int exp;
	private String empName;
	
	public EdubridgeEmployee(String empName, int exp,AddressInterface adrs) { //OfficeAddress ofcAdrs, HouseAddress houseAdrs) {
		this.empName = empName;
		this.exp = exp;
		this.adrs = adrs;  //new OffcieAddress()
//		this.ofcAdrs = ofcAdrs;
//		this.houseAdrs = houseAdrs;
	}
	
//	private OfficeAddress ofcAdrs;
//	private HouseAddress houseAdrs;
//	
	
	private AddressInterface adrs;  //new houseadrs() / new offcieAdrs();
	void displayAllDetails() {
		System.out.println(empName+" "+exp);
//		ofcAdrs.displayAddress();
//		houseAdrs.displayAddress();

		adrs.displayAddress();
	}
}
