/*
Author: McCoy Smith
Date: 9/28/2018
*/
class Exercise5_11 {
	public static void main(String[] args) {
		int n = 100;
		int counter = 0;
		while (n <= 200){
			
			if (n % 5 == 0 && n % 6 > 0){
				System.out.print(n + " ");
				counter = counter + 1;
			}
			if (n % 5 > 0 && n % 6 == 0){
				System.out.print(n + " ");
				counter = counter + 1;

			}
			n = n + 1;
			if (counter % 10 == 0){
				System.out.println();
			}
			if (counter == 32) {
				System.out.print(" is divisible by five or six, but not both. ");
			}
		}
	}
}