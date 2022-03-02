//DiceRolling.java - Program which simulates the rolling of two dice.
//CSIS212-D04

import java.security.SecureRandom;

public class DiceRolling {

	private static final SecureRandom factorNumbers = new SecureRandom(); // Create new random number object
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Christopher Ertsos - Assignment 5");
		// Initiate variables for possible rolls
		int two = 0, three = 0, four = 0, five = 0, six = 0;
		int seven = 0, eight = 0, nine = 0, ten = 0, eleven = 0, twelve = 0;
		//Initiate array rollFrequency to store values of frequency of each roll
		int[] rollFrequency = { two, three, four, five, six, seven, eight, nine, ten, eleven, twelve };
		// Loop to simulate 36,000 dice rolls using two dice
		for (int counter = 0; counter < 36000; ++counter) {
			int face1 = 1 + factorNumbers.nextInt(6);
			int face2 = 1 + factorNumbers.nextInt(6);
			int roll = face1 + face2;
			// Increment each array value each time the corresponding value is rolled
			if (roll == 2) {
				++two;
			}if (roll == 3) {
				++three;
			}if (roll == 4) {
				++four;
			}if (roll == 5) {
				++five;
			}if (roll == 6) {
				++six;
			}if (roll == 7) {
				++seven;
			}if (roll == 8) {
				++eight;
			}if (roll == 9) {
				++nine;
			}if (roll == 10) {
				++ten;
			}if (roll == 11) {
				++eleven;
			}if (roll == 12) {
				++twelve;
			}
		}
		System.out.println("\nDice Rolling\n\nResults After 36,000 Rolls:\n"); // Program header
		// Display tablet of frequencies after rolling complete
		System.out.printf("Twos: %d%nThrees: %d%nFours: %d%nFives: %d%nSixes: %d%nSevens: %d%nEights: %d%nNines: %d%n"
				+ "Tens: %d%nElevens: %d%nTwelves: %d%n", two, three, four, five, six, seven, eight, nine, ten, eleven, twelve);
	}

}
