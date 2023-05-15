
public class FourthPrg {

	void compareValues(int num1, int num2) {
		System.out.println(num1 > num2);
		System.out.println(num1 >= num2);
		System.out.println(num1 < num2);
		System.out.println(num1 <= num2);
		System.out.println(num1 == num2);	  //values are equal
		System.out.println(num1 != num2);	
	}


	//&& all the cond should be tru
	//|| any one cond should be true or all the cond should be tru
	//10 10
	static void logicalOperators(int num1, int num2) {
		System.out.println(num1 <= num2 && num1 > num2 && num1 < num2);//f
		System.out.println(num1 <= num2 || num1 > num2 || num1 < num2);//true
	}
	static void unaryOperators(int num) { //5
		// unary increme --> post increm --> assign and then inc by 1
		//pre incr --> incr by 1 and then assign 
		//decrem --> ppost dec assign and then dec by 1
		//pre dec --> dec by 1 and then assign
		System.out.println(num++);  //in this line it ll 5  new val --> 6
		System.out.println(++num);  //6+1 = 7
		System.out.println(num--);  //7 next line 6
		System.out.println(--num);  //5


	}

	void compoundOperators(int number) { //10
		number = number + 5;  
		number += 5;
		System.out.println(number);  //60
		number = number - 5;
		number -= 5;
		System.out.println(number); //50
		number = number / 5;   
		number /= 5;
		System.out.println(number); //2
		number = number * 5;
		number *= 5;
		System.out.println(number); //50

		number = number % 2;
		number %= 2;
		System.out.println(number);
	}

	static void bitwiseOperators(int number1, int number2) { //10, 2
		System.out.println(number1 & number2);   //2
		System.out.println(number1 | number2);
		System.out.println(!true);
	}

	void toUnderstandShiftOperator(int num) {
		System.out.println(num >> 2);  //right  //2
		System.out.println(num << 2);  //left //40


	}
	// cond ? true : false
	static void toUnderstandTrenaryOperator(int num1, int num2) {
		byte age = 70;
		short marks = 190;
		System.out.println(age >= 18 ? "eligible" : "not eligible");
		System.out.println(marks >= 50 ? "pass" : "better luck");

		System.out.println(num1 <= num2 || num1 > num2 || num1 < num2 ? "cond true" : " false codn");
	}
	public static void main(String args[]) {
		FourthPrg operatorObject = new FourthPrg();
		//		operatorObject.compareValues(23, 34);
		//	unaryOperators(5);
		//	operatorObject.compoundOperators(50);
		//logicalOperators(10, 10);
		//		bitwiseOperators(10, 2);
		//	toUnderstandTrenaryOperator(10, 10);

		operatorObject.toUnderstandShiftOperator(10);
	}
}
