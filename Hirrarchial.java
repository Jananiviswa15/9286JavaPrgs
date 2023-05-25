


public class Hirrarchial {

	void display() {
		System.out.println("from parent");
	}
}


class sibling1 extends Hirrarchial{
	
	public void myMethod(){
		System.out.println("sibling1");
	}
	void display() {
		System.out.println("from sibiling1");
	}
}

class sibling2 extends Hirrarchial{
	public void myMethod(){
		System.out.println("sibling2");
	}
	
	void display() {
		System.out.println("from sibiling1");
	}
}