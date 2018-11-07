/*
Date: 10/31/2018
Author: McCoy Smith
*/
import java.util.Scanner;

class Exercise7_5 {
	public static void main(String[] args) {
		int[] numbers = new int[10];
		Scanner input = new Scanner(System.in);
		int numberOfDistinctValues = 0;
		
		System.out.print("Enter 10 numbers with spaces in between");
		for (int i = 0; i < 10; i++ ) {
			int value = input.nextInt();
		
			boolean inIt = false;
			for (int j = 0; j < numberOfDistinctValues; j++){
				if(value == numbers[j]){
					inIt = true;
				}
			}
			if(!inIt){
				numbers[numberOfDistinctValues] = value;
				numberOfDistinctValues++;
			}
		}
		System.out.println("The number of distinct numbers in the array is: " + numberOfDistinctValues);
		
		System.out.print("The list without duplicates: ");
	
	
		
		for (int i = 0; i < numberOfDistinctValues; i++) {
			System.out.print(numbers[i] + " ");
			}
		}
}