// Program2.java - program which takes a user's name and displays a welcome message on a website
// CSIS 212-D04

import javax.swing.JOptionPane; // import JOptionPane class

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Christopher Ertsos - Assignment 1\n"); //name and assignment #
		
		String firstName = JOptionPane.showInputDialog("What is your first name?"); // display dialog box asking user for first name
		
		String message =
			String.format("Welcome, %s, to my website!\n"
				+ "The message of the day is: Hello, World!", firstName); //display a welcome message using string entered in the dialog box
		JOptionPane.showMessageDialog(null, message);
	} // end method main

} // end class Program2
