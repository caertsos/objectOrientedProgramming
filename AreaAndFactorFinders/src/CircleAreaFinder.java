// CircleAreaFinder.java - Program which asks for the radius of a circle and returns the area of the circle.
// CSIS212-D04

import java.util.Scanner; // Import Scanner utility for user input
import java.lang.Math;

public class CircleAreaFinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Christopher Ertsos - Assignment 4");
		
		Scanner input = new Scanner(System.in); // create new Scanner input
		
		System.out.println("\nThis program determines the area of a circle"); // Program header
		System.out.println("\nEnter the radius of the circle in centimeters: "); //Ask for circle radius from user
		double radius = input.nextDouble(); // Store radius in double
		
		double area = circleArea(radius); // circleArea method result stored in double
		System.out.printf("The area of the cirlce is %f sq.cm", area); // Output the circle area formatted as double
		
	}
	
	public static double circleArea(double radius) // Method using Java math class to determine area of a circle based on a given radius
	{
		double area = radius * radius * Math.PI;
		return area;
	}
}
