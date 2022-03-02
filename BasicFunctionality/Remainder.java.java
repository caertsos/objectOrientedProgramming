// Program5.java - Program which takes two integers and determines whether the first is a multiple of the second and displays the result
//CSIS 212-D04

import java.util.Scanner;

public class Program5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Christopher Ertsos - Assignment 1\n"); // name and assignment #
		
		Scanner input = new Scanner(System.in); // create new Scanner input
				
		System.out.print("Enter first number: "); //prompt to enter first number
		int number1 = input.nextInt(); //store value of number entered in number1
		
		System.out.print("Enter second number: "); //prompt to enter second number
		int number2 = input.nextInt(); //store value of number entered in number2
		
		int remainder = number1 % number2; // store remainder of quotient in remainder variable after dividing number 1 by number 2
		
		if (remainder == 0) // evaluate whether or not there is a remainder
			System.out.println("The first number is a multiple of the second number."); // if there is no remainder declare the first number is a multiple of the second number
		if (remainder > 0)
			System.out.println("The first number is not a multiple of the second number."); // if there is a remainder declare the first number is not a multiple of the second number
		if (remainder < 0)
			System.out.println("The first number is not a multiple of the second number."); // if there is a remainder declare the first number is not a multiple of the second number
		
	} // end method main

} // end class Program5
