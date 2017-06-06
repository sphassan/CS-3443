package length;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Lab4 {

	public static void main(String[] args)
	{
		Scanner in = null;
		try
		{
		    in = new Scanner(new File("data.txt"));
		}
		catch (FileNotFoundException exception)
		{
		    throw new RuntimeException("failed to open data.txt");
		}
		
		
		ArrayList<Length> lengths = new ArrayList<Length>();
	    Length max = new Meter(0);
	    Length min = new Meter(0);
	    Length summeters = new Meter(0);
	    Length suminches = new Inch(0);
	    Length sumfeet = new Foot(0);
	    Length sumyards = new Yard(0);
		
		while (in.hasNextDouble())
		{
		    double value = in.nextDouble();
		    String unit = in.next();
		    Length length = null;
		    
		    if (unit.startsWith("m"))
		    	length = new Meter(value);
		    else if (unit.startsWith("i"))
		    	length = new Inch(value);
		    else if (unit.startsWith("f"))
		    	length = new Foot(value);
		    else if (unit.startsWith("y"))
		    	length = new Yard(value);
		    
		    lengths.add(length);
		    
		    System.out.println(length);
		    
		    if (max.getLength() == 0)
		    	max = length;
		    if (min.getLength() == 0)
		    	min = length;
		    
		    if (length.compareTo(max) == 1)
		    	max = length;
		    if (length.compareTo(min) == -1)
		    	min = length;
		    
		    summeters.add(length);
		    suminches.add(length);
		    sumfeet.add(length);
		    sumyards.add(length);
		}
		in.close();
		
		System.out.println("\nMinimum is " + min);
		System.out.println("Maximum is " + max);
		System.out.println("\nSum of Lengths Adding from First to Last\n");
		System.out.println(summeters + "\n" + suminches + "\n" + sumfeet + "\n" + sumyards);
		
		summeters.setLength(0);
		suminches.setLength(0);
		sumfeet.setLength(0);
		sumyards.setLength(0);
		
		for (int x = lengths.size() - 1; x >= 0; x--)
		{
			summeters.add(lengths.get(x));
			suminches.add(lengths.get(x));
			sumfeet.add(lengths.get(x));
			sumyards.add(lengths.get(x));
		}
		
		System.out.println("\nSum of Lengths Adding from Last to First\n");
		System.out.println(summeters + "\n" + suminches + "\n" + sumfeet + "\n" + sumyards);
	}
}