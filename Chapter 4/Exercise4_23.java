/*
Author: McCoy Smith
Date: 9/24/18
*/
import java.util.Scanner;

class Exercise4_23 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter employee's name: ");
		String name = input.next(); 
		
		System.out.print("Enter the number of hours worked in a week: ");
		double hours = input.nextDouble();
		
		System.out.print("Enter the hourly rate: ");
		double payRate = input.nextDouble();
		
		System.out.print("Enter federal tax withholding rate: ");
		double fedTaxWithholdingRate = input.nextDouble();
		
		System.out.print("Enter state tax withholding rate: ");
		double stateTaxWithholdingRate = input.nextDouble();
		
		double grossPay= hours * payRate;
		double fedTaxWithholding = grossPay * fedTaxWithholdingRate;
		double stateTaxWithholding = grossPay * stateTaxWithholdingRate;
		double totalDeduction = fedTaxWithholding + stateTaxWithholding;
		double netPay = grossPay - totalDeduction;
		
		String out = "Employee Name: " + name + "\n\n";
		out += "Hours Worked: " + hours + "\n";
		out += "Pay Rate: $" + payRate + "\n";
		out += "Gross Pay: $" + grossPay + "\n"; 
		out += "Deductions:\n ";
		out += "  Federal Withholding (" + fedTaxWithholdingRate * 100 + "%): $" + (int)(fedTaxWithholding * 100) / 100.0 + "\n";
		System.out.print(out);
		out += "  State Withholding (" + stateTaxWithholdingRate * 100 + "%) $" + (int)(stateTaxWithholding * 100) / 100.0 + "\n";
		System.out.print(out);
		out += "  Total Deduction $" + (fedTaxWithholding + stateTaxWithholding) + "\n";
		System.out.print(out);
		out += "Net Pay " + (grossPay - fedTaxWithholding - stateTaxWithholding);
		System.out.print(out);
	}
}