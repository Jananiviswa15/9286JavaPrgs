
public class StringBuilderEg {
	public static void main(String args[]) {
		StringBuilder strObj = new StringBuilder();
		StringBuilder strObj1 = new StringBuilder("janani");
		
		StringBuilder emptyStr = new StringBuilder();
		strObj.append("siddhu");  //16
//substr , index of 
		
		System.out.println(strObj.insert(0, 'i'));
		System.out.println(strObj.replace(0, 3, "a"));
		System.out.println(strObj.reverse()); //uhdda
		System.out.println(strObj.delete(0, 3));
		System.out.println(strObj.length());
		System.out.println(strObj.charAt(0));
		System.out.println(emptyStr.capacity());

		System.out.println(strObj.getClass().getName());
		System.out.println(strObj.getClass().getSuperclass().getName());
		System.out.println(strObj.getClass().getSuperclass().getSuperclass().getName());
	}

}
