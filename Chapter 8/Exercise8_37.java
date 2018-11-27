/*
Author: McCoy Smith
Date: 8/26/18
*/
import java.util.Scanner;

class Exercise8_37 {
	public static void main(String[] args) {
		
		String [][] stateCapital = {
			{"Alabama" , "Montgomery"},
			{"Alaska" , "Juneau"},
			{"Arizona" , "Phoenix"},
			{"Arkansas" , "Little Rock"},
			{"California" , "Sacramento"},
			{"Colorado" , "Denver"},
			{"Connecticut" , "Hartford"},
			{"Delaware" , "Dover"},
			{"Georgia", "Atlanta"},
			{"Idaho" , "Boise"},
			
		};
		
		Scanner input = new Scanner(System.in);
		int isCorrect = 0;
		
		for (int i = 0; i < stateCapital.length; i++) {
			System.out.println("What is the capital of " + stateCapital[i][0] + "?");
			String n = input.nextLine();
			if(n.equalsIgnoreCase(stateCapital[i][1])) {
				System.out.println("Your answer is correct!");
				isCorrect++;
			}
			else {
				System.out.println("Your answer is incorrect, the correct anser is " + stateCapital[i][1]);
			}
		}
		System.out.println("Your correct count is: " + isCorrect + "/10");
	}
}