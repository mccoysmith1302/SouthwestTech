# Ice Cream Combinations

## Synopsis
My code is a combinations code. It will help you in the hard decision of choosing your toppings. You have 20 toppings to choose from. You will enter how many toppings you want, and it would compute the total different amounts of toppings there is. It will also give you a random combination of toppings. 

## Motivation
I created this project because I wanted to make it easier for people when making the extremely difficult decision of what toppings they want on their ice cream. 

## How to run
My program starts out by asking you what flavor of ice cream you want. After you enter your flavor, it asks you how many toppings you want out of 20. If you enter a number higher than 20, it will ask you to enter a new number. After you enter a new number that is less than 20, it will compute the total amount of different toppings. It will then print out a random order of toppings. 

## Code Example
```
int t = input.nextInt();
	while (t > 20) {
	System.out.println("Enter a new amount!");
	System.out.println();
	System.out.println("How many toppings would you like out of 20 different choices?");
	t = input.nextInt();
		}
```
This part of my code has you reenter the amount of toppings if you enter an amount larger than 20. It will then compute the amount of different combinations. 






