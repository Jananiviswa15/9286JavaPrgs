package FactoryMethod;


//Plan --> domestic, commeric, institi, industr
public abstract class Plan {
	protected double rate;
	abstract void getRate();
	public void calculateBill(int units){
		System.out.println(units*rate);
	}
	final void display() {  //t nd c 
		System.out.println("last date for oaying the bill from 15days of bill calc");
	}
}
