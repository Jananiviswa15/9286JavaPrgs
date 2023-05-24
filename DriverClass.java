
public class DriverClass {

	public static void main(String args[]) {
//	Mobile obj = new Mobile(2000, "nokia");	
//	obj.calling();
//	obj.displayDetails();
//	//obj.parentsPersonal(); //private
		
		keypadMobile basicMobile = new keypadMobile();
		//child cls obj, parwnt obj is npt created, a copy it given to child
		basicMobile.displayDetails();
	}
}
