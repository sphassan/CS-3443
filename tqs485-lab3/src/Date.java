public class Date implements Comparable<Date> //contains a Date object and compares two dates
{
	String month;
	int day;
	int year;
	String months[] = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
	int days[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public Date() //default constructor with multiple redundancy to stop output on DateRange call for initial month
	{
		month = "Fake";
		day = 100;
		year = 0;
	}
	
	public Date(String line) //preferred constructor
	{
		String array[] = line.split(" ");
		month = array[0];
		array[1] = array[1].substring(0, array[1].length()-1);
		day = Integer.parseInt(array[1]);
		year = Integer.parseInt((array[2]));
		
		switch (month) //sets all abbreviations of the months to full name
		{
			case "Jan.": month = "January";
			break;
			case "Feb.": month = "February";
			break;
			case "Mar.": month = "March";
			break;
			case "Apr.": month = "April";
			break;
			case "Jun.": month = "June";
			break;
			case "Jul.": month = "July";
			break;
			case "Aug.": month = "August";
			break;
			case "Sep.": month = "September";
			break;
			case "Oct.": month = "October";
			break;
			case "Nov.": month = "November";
			break;
			case "Dec.": month = "December";
			break;
			case "Jan": month = "January";
			break;
			case "Feb": month = "February";
			break;
			case "Mar": month = "March";
			break;
			case "Apr": month = "April";
			break;
			case "Jun": month = "June";
			break;
			case "Jul": month = "July";
			break;
			case "Aug": month = "August";
			break;
			case "Sep": month = "September";
			break;
			case "Oct": month = "October";
			break;
			case "Nov": month = "November";
			break;
			case "Dec": month = "December";
			break;
		}
	}
	
	public boolean verifyString() //confirms whether or not a date is valid before output
	{
		boolean flag29 = false; //check for 29 days in February
		if (this.month.equals("February"))
			if (checkLeap())
				flag29 = true;
		
		int month = 0;
		for (month = 0; month < 12; month++)
			if (months[month].equals(this.month))
				break;

		if (month == 12)
				return false;
		else if (month == 1 && flag29)
		{
			if (day > 29 || day < 1)
				return false;
		}
		else if (day > days[month] || day < 1)
			return false;
		
		return true;
	}
	
	private boolean checkLeap() //determines if year is leap year for February
	{
		if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0))
			return true;
		else
			return false;
	}
	
	public int compareTo(Date other) //compares two different Date objects to see which is larger
	{
		int thismonth = 0;
		for (thismonth = 0; thismonth < 12; thismonth++)
			if (months[thismonth].equals(this.month))
				break;
		
		int othermonth = 0;
		for (othermonth = 0; othermonth < 12; othermonth++)
			if (months[othermonth].equals(other.month))
				break;
		
		if (this.year < other.year)
			return -1;
		else if (this.year == other.year && thismonth < othermonth)
			return -1;
		else if (this.year == other.year && thismonth == othermonth && this.day < other.day)
			return -1;
		if (this.year == other.year && thismonth == othermonth && this.day == other.day)
			return 0;
		else
			return 1;
	}
	
	public String toString() //outputs date or invalid notice to user
	{
		if (verifyString())
			return ("Date: " + month + " " + day + ", " + year);
		else
			return ("Invalid Date");
	}

}