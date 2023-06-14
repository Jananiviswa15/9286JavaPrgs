package FactoryMethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GenerateBill {

	public static void main(String args[])throws IOException{
		GetPlanFactory planFactory = new GetPlanFactory();
		System.out.print("Enter the name of plan for which the bill will be generated: ");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String planName=br.readLine();  //industrial / domestic / coomercial
		System.out.print("Enter the number of units for bill will be calculated: ");
		int units=Integer.parseInt(br.readLine());  //"123" //123units
		Plan p = planFactory.getPlan(planName); //new institutionalPlan()
		//Plan p = new institutionalPlan()
		System.out.print("Bill amount for "+planName+" of "+units+" units is: ");
		p.getRate();  //new institutionalPlan().getRate();
		p.calculateBill(units);
		}
}
