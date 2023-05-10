
public class SecondProgram {
public static void main(String args[]) {
	
	//8 pdt
	//boolean/true / false / 1bit
	boolean isJyostnaSleeping;  //var decl
	boolean isSleeping = true;  //var def / initiali
	//a var created , name , memo - 1 bit , value 
	isJyostnaSleeping = false;
	System.out.println(isSleeping);
	System.out.println(isJyostnaSleeping);
	
	//byte // numbers -128 to 127 1byte - 8 bits
	byte maxAgeOfHuman = 20;
	
	
	//2 bytes - 16bits
	short avgHumanHeight = 150;
	
	//int 4bytes 
	int annualSalary = 1200000; 
	
	//8bytes
	long worldPopulation = 5644646878L;
	
	//2 bytes //unicode system
	char value = '1';
	char value1 = 's';
	char value2 = 400;  //0 255
	
	//after decim u can store 6 to 7 digits
	//4 bytes
	float floatValue = 34.5656f;
	
	//8bytes
	double doubleValue = 4545.454545454;
	
	System.out.println(floatValue);
	System.out.println(doubleValue);
	System.out.println(value);
	System.out.println(value1);
	System.out.println(value2);
	System.out.println("=========");
	System.out.println(23+67);
	byte num1 = 90;
	byte num2 = 100;
	System.out.println(num1-num2);
	System.out.println(num1/num2);
	System.out.println(90.0/num2);
	System.out.println(num1*num2);
	System.out.println(13 % 6);  //modulus 
	//12%6 = 0, 13%6 = 1
}
}
