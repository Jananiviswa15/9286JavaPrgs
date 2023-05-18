package ConditionalPrg;

public class SwitchEg {
/*
 * switch(pdt + str + wrapper class) case default(opt)
 * case should hav only val, no expr / cond is allwoed , in case no order
 * no dup caseis allowd
 */
	public static void main(String args[]) {
		
		int dayNum = 5;
		switch(dayNum) {
		case 2 : 
			System.out.println("tuesday");
			break;
		case  4: 
			System.out.println("wednesday");
		
		case 5 : 
			System.out.println("thursday");
		
		case 3 : 
			System.out.println("friday");
		case 6 : 
			//System.out.println(" holiday");
			//break;
		case  7: 
			System.out.println(" holiday");
			break;
		default :
			System.out.println("give proper val");
		//	break;
		
		}
	}
}
