// Program4.java - Program which takes two integers from user input and displays their sum, difference, product and quotient
// CSIS-D04

import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Christopher Ertsos - Assignment 1\n");
		
		Scanner input = new Scanner(System.in); // create scanner to obtain input
		
		System.out.print("Enter number 1: "); // prompt for number1
		int number1 = input.nextInt(); // store prompt entry in number1
		
		System.out.print("Enter number 2: "); // prompt for number2
		int number2 = input.nextInt(); // store prompt entry in number2
		
		int sum = number1 + number2; //add numbers and store value in sum
		int difference = number1 - number2; //subtract numbers and store value in difference
		int product = number1 * number2; //multiply numbers and store value in product
		int quotient = number1 / number2; //divide number1 by number 2 and store value in quotient
		
		System.out.printf("Sum is %d%nDifference is %d%nProduct is %d%nQuotient is %d%n", sum, difference, product, quotient, args); //display sum, difference, product and quotient of number1 and number 2 on separate lines
		
	} // end method main

} // end class Program4
