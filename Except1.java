package ExceptionHandling;


class userDefinedException extends Exception{
	userDefinedException(String excp){
		super(excp);
	}
}
public class Except1 {

	public static void main(String args[]) throws userDefinedException, Exception {
		
		String name = null;
		try {
		if(name == null)
			throw new userDefinedException("user defined excp got incvoked");
		}
		catch(Exception exc) {
			
		}
	}
}
