package com.mphasis.billsystem;

public class BillCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int units =250;
		double billToPay=0;
		if(units < 100)
		{
			billToPay = units * 1.20;
			
		}
		else if(units < 300)
		{
			billToPay = 100 * 1.20+ (units -100)*2;
			
		}
		System.out.println("the eletricity bill for "+units+"is:"+ billToPay);

	}

}
