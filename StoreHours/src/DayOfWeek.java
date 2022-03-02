//DayOfWeek.java - Public enum for day of week constant values
//CSIS212-D04

public enum DayOfWeek {
	SUNDAY("Sunday", 0, "6a-2p"),
	MONDAY("Monday", 1, "7a-3p"),
	TUESDAY("Tuesday", 2, "8a-4p"),
	WEDNESDAY("Wednesday", 3, "9a-5p"),
	THURSDAY("Thrusday", 4, "10a-6p"),
	FRIDAY("Friday", 5, "11a-7p"),
	SATURDAY("Saturday", 6, "12p-8p");
	//Instance variables
	private final String dayName;
	private final int dayNum;
	private final String openHours;
	
	//Constructor
	DayOfWeek(String dayName, int dayNum, String openHours) {
		this.dayName = dayName;
		this.dayNum = dayNum;
		this.openHours = openHours;
	}
	//Get methods for constants
	public String getDayName()
	{
		return dayName;
	}

	public int getDayNum()
	{
		return dayNum;
	}

	public String getOpenHours()
	{
		return openHours;
	}
}//End enum DayOfWeek

