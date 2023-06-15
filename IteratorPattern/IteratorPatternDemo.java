package IteratorPattern;

public class IteratorPatternDemo {
	public static void main(String[] args) {
		NameRepository namesRepository = new NameRepository();
		//ref of annon obj of inner clas
		for(Iterator iter = namesRepository.getIterator(); iter.hasNext();){
			String name = (String)iter.next();
			System.out.println("Name : " + name);
		}
	}
}