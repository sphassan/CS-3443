import java.util.Scanner;
import java.io.File;
import java.math.BigDecimal;

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
		int nums = 0; //the number of tokens that are numbers
		int notNums = 0; //the number of tokens that are not numbers
		//double sum = 0; //caused floating point imprecision errors (test data returns a sum of 12.600000000000001)
		double current = 0; //stores the parsed value of the token parsed
		BigDecimal convert = BigDecimal.valueOf(0.0); //holding variable for allowing BigDecimal addition
		BigDecimal bdSum = BigDecimal.valueOf(0.0); //the sum of all numbers with more accurate floating points
		
		while (in.hasNext())
		{
			if (in.hasNextDouble())
			{
				token = in.next();
				nums++;
				//sum += Double.parseDouble(token);
				current = Double.parseDouble(token);
				convert = BigDecimal.valueOf(current);
				bdSum = bdSum.add(convert);
			}
			else
			{
				token = in.next();
				notNums++;
			}
		}
		
		//System.out.println(nums + " " + notNums + " " + sum);
		System.out.println(nums + " " + notNums + " " + bdSum);
	}
}
