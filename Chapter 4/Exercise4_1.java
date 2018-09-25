/*
Author: McCoy Smith
Date: 9/20/18
*/
import java.util.Scanner;

class Exercise4_1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the length from the center to a vertex: ");
		double r = input.nextDouble();
		
		double side = 2 * r * Math.sin(Math.PI / 5);
		System.out.println("The side length is; " + side);
		double area = 5 * side * side / Math.tan(Math.PI / 5) / 4;
		
		System.out.println("The area of the pentagon is " + area);
	}
}