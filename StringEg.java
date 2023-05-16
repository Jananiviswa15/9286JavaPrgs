
public class StringEg {
//contin/seq of char --> "janani"
						//012345
	
	//String, StringBuffer, StringBuilder --> predefinedclasses
	//String --> java.lang
	public static void main(String args[]) {
		String name = "janani"; // str literal  // string constant pool --> heap area
		String whitespcStr = "    ";
		//cn obj = new class();
		String nameObj = new String("JANANI");  //str obj //heap mem
		
		System.out.println(name.charAt(0));
		//System.out.println(name.charAt(9));
		
		System.out.println(nameObj.indexOf('a'));
		System.out.println(nameObj.indexOf(4));
		
		//==
		System.out.println(name == nameObj); //false
		System.out.println(name.equals(nameObj)); //true
		System.out.println(name.equalsIgnoreCase(nameObj));
		System.out.println(name.length());
		System.out.println(name.replace('a', 'w'));
		System.out.println(name.concat(nameObj));
		
		System.out.println(name.isBlank()); //whitespc
		System.out.println(whitespcStr.isBlank()); //whitespc
		
		String emptyStr = "";
		System.out.println(emptyStr.isEmpty());
		System.out.println(whitespcStr.isEmpty());
		
		String spaceChars = "      hi               alllll              ";
		System.out.println(spaceChars.stripLeading());
		System.out.println(spaceChars.stripTrailing());
		System.out.println(spaceChars.strip());
		
		System.out.println(nameObj.toLowerCase());
		System.out.println(name.toUpperCase());
		
		System.out.println(name.lastIndexOf('a'));
		
	}
}
