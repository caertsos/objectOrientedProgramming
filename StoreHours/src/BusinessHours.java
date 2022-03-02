//BusinessHours.java - Class which stores constants from DayOfWeek in array, prompts user to select a day, and displays constant hours
//CSIS212-D04

import javax.swing.JOptionPane;

public class BusinessHours {

	public static void main(String[] args) {
		System.out.println("Christopher Ertsos - Final Assignment Part 2");
		
		String[] openHours = 
			{
					DayOfWeek.SUNDAY.getOpenHours(),
					DayOfWeek.MONDAY.getOpenHours(),
					DayOfWeek.TUESDAY.getOpenHours(),
					DayOfWeek.WEDNESDAY.getOpenHours(),
					DayOfWeek.THURSDAY.getOpenHours(),
					DayOfWeek.FRIDAY.getOpenHours(),
					DayOfWeek.SATURDAY.getOpenHours(),
			};

		Object[] choices = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
		String dayChoice = (String)JOptionPane.showInputDialog(
		                    null,
		                    "Please select a day of the week.",
		                    "Business Hours",
		                    JOptionPane.QUESTION_MESSAGE,
		                    null,
		                    choices, 
		                    null);
		
		switch(dayChoice)
		{
		case "Sunday": 
			JOptionPane.showMessageDialog(null, "Sunday hours: " + openHours[0]);
			break;
		case "Monday":
			JOptionPane.showMessageDialog(null, "Monday hours: " + openHours[1]);
			break;
		case "Tuesday": 
			JOptionPane.showMessageDialog(null, "Tuesday hours: " + openHours[2]);
			break;
		case "Wednesday":
			JOptionPane.showMessageDialog(null, "Wednesday hours: " + openHours[3]);
			break;
		case "Thursday": 
			JOptionPane.showMessageDialog(null, "Thursday hours: " + openHours[4]);
			break;
		case "Friday":
			JOptionPane.showMessageDialog(null, "Friday hours: " + openHours[5]);
			break;
		case "Saturday": 
			JOptionPane.showMessageDialog(null, "Saturday hours: " + openHours[6]);
			break;
		default: System.exit(0);
	}//End switch
	}//End method main
}//End class BusienssHours

