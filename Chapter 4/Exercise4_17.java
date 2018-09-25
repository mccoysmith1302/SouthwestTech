/* 
Author: McCoy Smith
Date: 9/21/18
*/
import java.util.Scanner;

class Exercise4_17 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String month = "";
		int year = 0;
		
		System.out.println("Enter a month:");
		month = input.next();
		System.out.print("Enter year: ");
		year = input.nextInt();
		
		if (month.equals("Jan") || month.equals("Mar") || month.equals("May") || month.equals("Jul") || month.equals("Aug") || month.equals("Oct") || month.equals("Dec"))
		 {
			System.out.println(month + " " + year + " has 31 days");
			
			
		}
		else if ((month.equals("Apr")) || (month.equals("Jun")) || (month.equals("Sep")) || month.equals("Nov")){
			System.out.println(month + " " + year + " has 30 days");
		}
		else if ((month.equals("Feb")) && (year % 4 == 0)) {
			System.out.println(month + " " + year + " has 29 days");
		}
		else if ((month.equals("Feb")) && (year % 4 != 0)) {
			System.out.println(month + " " + year + " has 28 days");
		}
		else {
			System.out.println("Invalid month");
		}
	}
}