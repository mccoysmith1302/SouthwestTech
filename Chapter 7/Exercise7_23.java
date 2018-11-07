/*
Author: McCoy Smith
Date: 11/5/2018s*/
class Exercise7_23 {
	public static void main(String[] args) {
		boolean lockers[] = new boolean[100];
		
		for (int i = 0; i <= 99; i++) {
			lockers[i] = false;
		}
		
		for(int s = 1; s <= 100; s++) {
			
			for(int i = s - 1; i < 100; i += s) {
				lockers[i] = !lockers[i];
			}
		}
		
		System.out.println("The lockers that are open are; "); 
		for (int i = 0; i <= 99; i++) {
			if(lockers[i]) {
				System.out.print((i + 1) + ", ");
			}
		}
	}
}