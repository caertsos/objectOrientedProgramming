// isMultiple.java - Method which takes input pairs of integers and
// determines whether the second is a multiple of the first, using a
// True/False output.
//CSIS212-D04

import java.util.Scanner; // Import Scanner utility for user input

public class FactorFinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Christopher Ertsos - Assignment 4\n");
		
		System.out.println("\nThis program determines if the first number entered\n" // Program header
				+ "is a factor of the second number entered.\n\n");
		
		Scanner input = new Scanner(System.in); // create new Scanner input
		
		for(int count = 1; count <=5; ++count) // Take 5 pairs of integers
		{
			System.out.println("Enter two integers separated by a space: "); // Ask for two input integers
			int num1 = input.nextInt();
			int num2 = input.nextInt();
			
			int remainder = isMultiple(num1, num2); // Call method isMultiple and store result in int remainder
			
			if (isMultiple(num1, num2) == 0) // Initiate T/F decision
			{
				System.out.println("True\n");
			}
			else // Stipulate output for all untrue d
			{
				System.out.println("False\n");
			}
		}
		}
	
	public static int isMultiple(int num1, int num2) // Method isMultiple determines the remainder
	{
		
		int remainder = num2 % num1; // Calculate remainder of the input values and store in remainder
		
		return remainder; // Return the result to main method
	}
		
}