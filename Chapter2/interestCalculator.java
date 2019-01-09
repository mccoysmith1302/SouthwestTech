/*
Author: McCoy Smith
Date: 9/11/2018
*/

import java.util.Scanner;

public class interestCalculator{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("How much would you like to contribute monthly to the savings account? ");
		
		double monthlyDeposit = input.nextDouble();
		
		double currentValue = monthlyDeposit;
		
		currentValue = (monthlyDeposit) * (1 + 0.05 / 12);
		System.out.println("After the first month, the account value is " + currentValue);
		
		currentValue = (currentValue + monthlyDeposit) * (1 + 0.05 / 12);
		System.out.println("After the second month, the account value is " + currentValue);
		
		currentValue = (currentValue + monthlyDeposit) * (1 + 0.05 / 12);
		System.out.println("After the third month, the account value is " + currentValue);
		
		currentValue = (currentValue + monthlyDeposit) * (1 + 0.05 / 12);
		
		currentValue = (currentValue + monthlyDeposit) * (1 + 0.05 / 12);
		
		currentValue = (currentValue + monthlyDeposit) * (1 + 0.05 / 12);
		
		System.out.println("After the sixth and final month, the account value has matured to " + currentValue);			
	}
}