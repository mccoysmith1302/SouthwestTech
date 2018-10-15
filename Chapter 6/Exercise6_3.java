/*
Author: McCoy Smith
Date: 10/9/18
*/
import java.util.Scanner;
class Exercise6_3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		String s = input.nextLine();
		
		int low = 0; 
		int high = s.length() - 1; 
		
		boolean isPalindrome = true;
		while (low < high) {
			if (s.charAt(low) != s.charAt(high)) {
				isPalindrome = false;
				break;
			}
			low++;
			high--;
		}
		if (isPalindrome)
		  System.out.println(s + " is a palindrome");
		else {
			System.out.println(s + " is not a palindrome");
		}
	}
}