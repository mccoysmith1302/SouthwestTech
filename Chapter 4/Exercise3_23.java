/*
Author: McCoy Smith
Date: 9/19/18
*/

import java.util.Scanner;

class Exercise3_23 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the x and y Value ");
		
		double x = input.nextDouble();
		double y = input.nextDouble();
		
		input.close();
		
		double xDistance = (10 / 2);
		double yDistance =  (5.0 / 2);
		
		if (Math.abs(x) <= xDistance) {
			if (Math.abs(y) <= yDistance) {
				System.out.println("Point (" + x + " , " + y + ") is in the rectangle.");
			} 
			else {
					System.out.println("Point (" + x + " , " + y + ") is not in the rectangle.");			}
		} 
		else {
				System.out.println("Point (" + x + " , " + y + ") is not in the rectangle.");
		}
	}
}