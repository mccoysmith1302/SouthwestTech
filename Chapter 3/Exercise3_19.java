/*
Author: McCoy Smith
Date: 9/18/18
*/
import java.util.Scanner;

class Exercise3_19 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the legth of three sides of a triangle: ");
		
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();
		
		double perimeter = side1 + side2 + side3;
		
		if (side1 + side2 > side3) {
			if (side2 + side3 > side1) {
				if (side3 + side1 > side2) {
					System.out.println("The Perimeter of the Triangle is " + perimeter);
				} 
				else { 
					System.out.println("The triangle is invalid");
					
				}
			}
			else { 
				System.out.println("The triangle is invalid");
			
			}
		}	
		else {
			System.out.println("The triangle is invalid");
			
		}
	}
}