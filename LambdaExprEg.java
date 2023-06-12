package multithreadingEgs;

@FunctionalInterface
interface showable{
//	void display();
	//void display(String name);
	
	//void display(String name, String name1);
	
	int sum(int num1, int num2);
}

/*
 * class A implements showable{
 * //	public void display() {
//		
//	}
	
 * }
 * 
 */
public class LambdaExprEg {
	

	public static void main(String args[]) {
		//showable obj = new A();
		
//		showable obj = () -> System.out.println(" hi all");
		// {more than 1 line use curly braces
//			System.out.println(" hi all");
//};
//		showable obj = (String name) -> System.out.println(" hi all"+name);
//		obj.display("janani");
		//if it is one param u can give like this ---> name
		
//		showable obj = (String name, String myName) -> System.out.println(myName+" "+name);
//		obj.display("janani", "viswa");
//		
//		showable obj = ( name,  myName) -> System.out.println(myName+" "+name);
//		obj.display("janani", "viswa");
	
		//5,4
//		showable obj = (num1, num2) -> {
//			int sum = num1 + num2;
//			 return sum;
//		};
		
		//showable obj = (num1, num2) ->  num1+num2; //return ct error, evaluates to a value
		//num1*num2
		
		//System.out.println(obj.sum(4, 5));
	}

}
