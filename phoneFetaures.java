

//adject
//small letter
//blue print of method
public interface phoneFetaures {

	String brandName = "samsung"; //public static final
	void calling(); //public abstract
	void sendMessages();
	
	  default void display() {
		//personalNote();
		System.out.println(" i am default");
	}
	
	private void personalNote() {
		personalNote1();
		System.out.println(" i am private");
	}
	
	
	private static void personalNote1() {
		//personalNote();
		System.out.println(" i am private static");
	}
	
	
}


interface advPhoneFeatures extends phoneFetaures{
//nterface advPhoneFeatures{
	void sendMessages();
	void openMap();
}