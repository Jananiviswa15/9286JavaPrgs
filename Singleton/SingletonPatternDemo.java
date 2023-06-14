package Singleton;

public class SingletonPatternDemo {

	public static void main(String[] args) {
			SingleObject object = SingleObject.getInstance(); 
			//SingleObject object = new SingleObject();
	SingleObject object1 = SingleObject.getInstance();
		object1.showMessage();
		object.showMessage();
		}
}
