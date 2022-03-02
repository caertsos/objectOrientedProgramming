//GpaDatabase.java - Contains student IDs, first names, and grade point average in three arrays
//CSIS212-D04

import javax.swing.*;
import java.util.Arrays;

public class GpaDatabase 
{		
	public static void main(String[]args)
	{
		String studentID[] = 
			{
			"0123", 
			"1234", 
			"2345", 
			"3456", 
			"4567", 
			"5678", 
			"6789", 
			"7890", 
			"8901", 
			"9012"};
		String firstName[] = 
			{
			"John", 
			"Bob", 
			"Sue", 
			"Jennifer", 
			"Chris", 
			"Jillian", 
			"Olive", 
			"Mike", 
			"Laurie", 
			"Ted"};
		double gradePoint[] = 
			{
			3.29, 
			2.88, 
			2.94, 
			2.96, 
			3.54, 
			3.67, 
			3.9, 
			3.82, 
			3.75, 
			3.87};
	
		System.out.println("Christopher Ertsos - Final Assignment Part 1");
		// initialize loop control and begin loop while control variable negative
		int i = -1;
		while(i < 0)
		{	// dialog box for user ID string search
			String searchID = JOptionPane.showInputDialog(null, "GPA Search\nEnter Student ID: ");
			 // search for input value and return location if found
			i = Arrays.binarySearch(studentID, searchID);
			// if search positive display name and GPA, else return error and continue loop
			if(i >= 0)
			{
				JOptionPane.showMessageDialog(null, "ID Found!\nFirst Name: " +
						firstName[i] + "\nGPA: " + gradePoint[i]);
			}else
			{
			JOptionPane.showMessageDialog(null,
					"ID number " + searchID + " not found.",
					"Error",
					JOptionPane.WARNING_MESSAGE);
			} // end if/else
		} //end while loop
		} // end method main
} // end class GpaDatabase