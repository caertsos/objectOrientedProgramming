// SalaryCalc.java -- Calculate salaries for up to 3 employees
//CSIS 212-D04
import java.util.Scanner; // class uses class Scanner

public class SalaryCalc {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Christopher Ertsos - Salary Calculator\n");
		
		Scanner input = new Scanner(System.in); //create Scanner to obtain input from user
		
		int empCounter = 1; // initialize employee counter to 1

		// repeat calculation steps for up to 3 employees
		while (empCounter <= 3)
		{
			// prompt user to input hourly rate followed by hours worked and store each in variables
			System.out.print("Enter hourly rate: ");
			double rate = input.nextDouble(); //
			System.out.print("Enter hours worked: ");
			int hours = input.nextInt();
				// check if overtime rate applies and calculate salary based on sum of (product of overtime rate and number of hours over 40) and (product of regular rate and hours up to 40)
				if (hours > 40)
					{
					int overtimeHours = hours - 40;
					double salaryOT = (double) (rate * hours) + (rate * 1.5 * overtimeHours);
					System.out.printf("Employee %d salary is $%f%n", empCounter, salaryOT);
					}
				// if overtime rate does not apply calculate salary based on rate and hours
				else
				{
					double salary = (double) rate * hours;
					System.out.printf("Employee %d salary is $%f%n", empCounter, salary);
				}
			
			empCounter = empCounter + 1; //add 1 for next employee
		}
											} //end class main

						} //end class SalaryCalc