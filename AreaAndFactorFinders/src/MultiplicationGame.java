// MultiplicationGame.java - Program which outputs two random positive integers from 1-9 and asks the user for their product.
//CSIS212-D04

import java.util.Scanner; // Import scanner utility
import java.security.SecureRandom; // Import secure random number generator

public class MultiplicationGame 
{
	private static final SecureRandom factorNumbers = new SecureRandom(); // Create new random number object

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("Christopher Ertsos - Assignment 4" // Program header
				+ "\n\nMultiplication Game\n"); 
		
		int count = 1; // Initialize counter variable
		while (count <= 5) // Begin count to 5 questions
		{
			int num1 = 1 + factorNumbers.nextInt(9); // Generate random number 1
			int num2 = 1 + factorNumbers.nextInt(9); // Generate random number 2
			int product = num1 * num2; // Define product of random numbers
			System.out.printf("Question %d of 5: How much is %d times %d? ", count, num1, num2); //Ask the user the next question
			
				Scanner input = new Scanner(System.in); // Create new Scanner input
				int answer = input.nextInt(); // Store user input as answer
				
				while (answer != product) // Continue to ask the user the same question until the answer equals the product
				{
					System.out.printf("No. Please try again.\n" // Tell user answer is incorrect, to try again
							+ "How much is %d times %d? ", num1, num2); // Re-ask question
					answer = input.nextInt(); // Redefine answer as next input
				}
				System.out.println("Very good!\n"); // Congratulate user when answer is correct
				++count; // Add to the count and continue with next question
		}
	}
}