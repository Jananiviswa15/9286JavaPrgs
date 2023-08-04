package Resource;

public class Pancard {

	private String nameOnThePancard;
	private String panNumber;
	public Pancard(String nameOnThePancard, String panNumber) {
		this.nameOnThePancard = nameOnThePancard;
		this.panNumber = panNumber;
	}
	public void display() {
		System.out.println(nameOnThePancard+" "+panNumber);
		
	}
}
