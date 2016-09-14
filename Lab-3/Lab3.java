import java.io.*;
import java.util.*;

public class Lab3
{
	public static void main(String args[])
	{
		Scanner in = null;
		try
		{
		    in = new Scanner(new File("dates.txt"));
		}
		catch (FileNotFoundException exception)
		{
		    System.err.println("Failed to open dates.txt");
		    System.exit(1);
		}
		while (in.hasNextLine())
		{
		    String line = in.nextLine();
		    Date date = new Date(line);
		    System.out.println(date);
		    // need more code for DateRange objects
		}
		
		in.close();
	}
}
