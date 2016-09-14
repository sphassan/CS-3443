public class Date
{
	String month;
	int day;
	int year;
	String months[] = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
	int days[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public Date(String line)
	{
		String array[] = line.split(" ");
		month = array[0];
		array[1] = array[1].substring(0, array[1].length()-1);
		day = Integer.parseInt(array[1]);
		year = Integer.parseInt((array[2]));
		
		switch (month)
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
	
	private boolean verifyString()
	{
		boolean flag29 = false;
		if (this.month.equals("February"))
			if (checkLeap())
				flag29 = true;
		
		int month = 0;
		for (month = 0; month < 12; month++)
			if (months[month].equals(this.month))
				break;

		if (month == 1 && flag29)
		{
			if (day > 29)
				return false;
		}
		else if (day > days[month])
			return false;
		
		return true;
	}
	
	private boolean checkLeap()
	{
		if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0))
			return true;
		else
			return false;
	}
	
	public String toString()
	{
		if (verifyString())
			return ("Date: " + month + " " + day + ", " + year);
		else
			return ("Invalid Date");
	}

}
