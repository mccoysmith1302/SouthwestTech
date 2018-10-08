/*
Author: McCoy Smith
Date: 10/8/2018
*/
import java.util.Scanner;
class Exercise5_49 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String s =  input.nextLine();
		
		int vowels = 0;
		int consonants = 0;
		for (int i = 0; i < s.length(); i++) {
			char temp = Character.toUpperCase(s.charAt(i));
			if (temp == 'A' || temp == 'E' || temp == 'I' || temp == 'O' || temp == 'U') {
				vowels++;
			}
			else if (Character.isLetter(temp)) {
				consonants++;
			}
		}
		
		System.out.println("The number of vowels is " + vowels);
		System.out.println("the number of consonants is " + consonants);
	}
}