// VariableLengthArgList.java - Program which calculates the product of a series of integers 
// that are passed to method product using a variable-length argument list.
//CSIS212-D04

public class VariableLengthArgList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Christopher Ertsos - Assignment 5");
		// initiate numbers to be multiplied
		int n1 = 2;
		int n2 = 4;
		int n3 = 6;
		int n4 = 8;
		int n5 = 10;
		int n6 = 12;
		
		System.out.println("\nVariable Length Argument List for Product Calculations."); // Program header
		System.out.printf("%nThe factors are: %nn1=%d%nn2=%d%nn3=%d%n"
				+ "n4=%d%nn5=%d%nn6=%d%n", n1, n2, n3, n4, n5, n6); // State all factors to be manipulated
		System.out.printf("%nThe product of all factors is: %d%n", product(n1, n2, n3, n4, n5, n6)); // Multiply all factors using product()
		System.out.printf("The product of n1, n3 and n5 is: %d%n", product(n1, n3, n5)); // Multiply odd numbered factors using product()
		System.out.printf("The product of n2, n4 and n6 is: %d%n", product(n2, n4, n6)); //Multiply even numbered factors using product()
	}
		
		// Method which uses variable length arguments 
	public static int product(int... factors) {
			
		int product = 1; // Initiate return variable
		// Enhanced for loop for multiplying array values from main
		for (int n : factors) {
			product *= n;
		}
		return product; // Return the product of the variable length list in called method
	}	
}
