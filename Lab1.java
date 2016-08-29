import java.util.Scanner;
import java.io.File;

public class Lab1
{
	public static void main (String[] args)
	{
		Scanner in = null;
		
		try
		{
			in = new Scanner(new File("data.txt"));
		}
		catch (Exception FileNotFoundException)
		{
			System.err.println("Failed to open data.txt");
			System.exit(1);
		}
		
		String token = "";
		int nums = 0;
		int notNums = 0;
		double sum = 0;
		
		while (in.hasNext())
		{
			if (in.hasNextDouble())
			{
				token = in.next();
				nums++;
				sum += Double.parseDouble(token);
			}
			else
			{
				token = in.next();
				notNums++;
			}
		}
		
		System.out.println(nums + " " + notNums + " " + sum);
	}
}
