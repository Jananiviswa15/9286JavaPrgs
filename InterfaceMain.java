public class InterfaceMain {

	public static void main(String args[]) {
		phoneFetaures obj = new Mobile();
		obj.calling();
		obj.sendMessages();
		obj.display();
		advPhoneFeatures obj1 = new Mobile();
		obj1.openMap();
		System.out.println(obj.brandName); //intf naem
		System.out.println(phoneFetaures.brandName);
		
	
	}
}
