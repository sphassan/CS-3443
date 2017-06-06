public class DateRange //contains the range of two Date objects
{
	Date first, second;
	
	public DateRange() //default constructor
	{
		first = new Date();
		second = new Date();
	}
	
	public DateRange(Date first, Date second) //preferred constructor
	{
		this.first = first;
		this.second = second;
	}
	
	public String toString() //provides String output with daterange if both dates validate and nothing if not
	{
		if (first.verifyString() && second.verifyString())
			return "DateRange: " + first.toString() + " - " + second.toString() + "\n";
		else
			return "";
	}
}