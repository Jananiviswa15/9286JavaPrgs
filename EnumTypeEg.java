
public class EnumTypeEg {
//math sci social lang
	//your hobbies
	//directions --> NSEW
	
	enum Hobbies{ DRAWING, WRITING, POETRY};  //static final
	//all val in capt
	enum Subjects {SOCIAL, LANGUAGE, SCIENCE};
	public static void main(String args[]) {
		System.out.println(Hobbies.valueOf("DRAWING"));
		Hobbies allHobbies[] = Hobbies.values();
		System.out.println(Hobbies.values());  //all the val
		System.out.println(allHobbies[0]);
		System.out.println(Hobbies.valueOf("DRAWING").ordinal());
		System.out.println(Hobbies.valueOf("DRAWI   NG").ordinal());
	}
}
