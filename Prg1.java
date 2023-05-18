package ConditionalPrg;


/*simple if
 * if else
 * ladder if
 * nested if
 */
public class Prg1 {
/*if(cond){
 * cond is true
 * }
 * 
 */
	
	static void	toCheckIfElse(int number) {
		if(number > 100) {
			System.out.println(number + " is greater than 100");
		}
		else {
			System.out.println(number + " is lesser than 100");
		}
	}
	static void toCheckSimpleIf(int number) {
		if(number > 100) {
			System.out.println(number + " is greater than 100");
		}
		
	}
	public static void main(String args[]) {
		int num = -1000;
	//	toCheckSimpleIf(num);
		toCheckIfElse(num);
	}
	
}
