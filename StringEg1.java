
public class StringEg1 {
public static void main(String args[]) {
	
	
	String name = "sharu";
	//adithya vs adhiti
	System.out.println(name.repeat(3));
	System.out.println(name.compareTo("van"));  //lexio //+ve -ve 0
	System.out.println("van".compareTo(name));
	System.out.println(name.compareTo(name));
	
	System.out.println(name.contains("a"));
	System.out.println(name.endsWith("u"));
	System.out.println(name.startsWith("saa"));
	
	String strObj = new String(name);
	//move ur data from heap to scp
	String movedData = strObj.intern();
	
	// scp --> name, movedData --> sharu
	
		//heap --> sharu
	System.out.println(movedData == name);
	
	
	char arr[] = {'h', 'i', ' ', 'a', 'l','l'}; //arr to str
	System.out.println(arr);
	String strFromArray = new String(arr);
	System.out.println(strFromArray);
	
	
	char array[] = name.toCharArray(); //str to arr
	System.out.println(array[0]);
	System.out.println(array[1]);
}
}
