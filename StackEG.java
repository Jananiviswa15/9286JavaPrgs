package CollectionEg;

import java.util.Stack;

public class StackEG {

	public static void main(String args[]) {
		Stack<String> stackList = new Stack();
		stackList.add("hi");
		stackList.add("hello");
		stackList.add("everyone");
		
	
		stackList.add("good");
		stackList.add(2,"goods");
		stackList.add(1, "god");
		System.out.println(stackList);
		
		Stack<String> stackList1 = new Stack();
		stackList1.add("veggies");
		stackList1.add("fruits");
		stackList1.add("dry fruits");
//		System.out.println(stackList1);
//		System.out.println(stackList1.peek());
//		System.out.println(stackList1);
//		System.out.println(stackList1.pop());  //remove and return 
//		
//		stackList1.push("insert an item");
//		System.out.println(stackList1.search("fruits"));
		
		stackList1.add(1,"apple");
		stackList1.add(2,"2ndapple");
		System.out.println(stackList1);
		
//		stackList.addAll(1, stackList1);
//		stackList.addAll(stackList1);
		stackList.push("last item");
		System.out.println(stackList);
		//clear, size, empty, contains
		stackList.remove(0);  //remove("exactValue"), removeAll, set , get 
		System.out.println(stackList);
	}
}
