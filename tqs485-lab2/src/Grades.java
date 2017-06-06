
import java.util.Arrays;
import java.util.Scanner;

public class Grades //contains the class field and methods for a student's grades
{
	private String name;
	private int[] grades;
	private int length;
	
	public Grades() //default constructor
	{
		name = "nobody";
		grades = new int[0];
	}
	
	public Grades(String name, String grades) //preferred constructor
	{	
		this.name = name;
		Scanner in = new Scanner(grades);
		int length = length(grades);
		this.grades = new int[length];
		for (int x = 0; x < length; x++)
			this.grades[x] = in.nextInt();
		in.close();
	}
	
	private String getName() //provides name for output
	{
		return name;
	}
	
	private int length(String grades) //special length method called during construction
	{
		length = 0;
		
		if (grades == null)
			return length;
		
		Scanner in = new Scanner(grades);
		while (in.hasNext())
		{
			length++;
			in.nextInt();
		}
		in.close();
		
		return length;
	}
	
	private int length() //returns the length of the grades array for output
	{
		return grades.length;
	}
	
	private double average() //returns grade average for output
	{
		if (length == 0)
			return 0;
		
		double average;
		
		int total = 0;
		for (int x = 0; x < length; x++)
			total += grades[x];
		average = (double)total / length;
		
		return average;
	}
	
	private double median() //returns median grade for output
	{
		if (length == 0)
			return 0;
		
		double median;
		
		Arrays.sort(grades);
		if (length % 2 == 0)
			median = ((grades[length/2] + grades[length/2 - 1]) / 2.0);
		else
			median = grades[length/2];
		
		return median;
	}
	
	private int maximum() //returns highest grade for output
	{
		if (length == 0)
			return 0;
		
		int max;
		
		Arrays.sort(grades);
		max = grades[length-1];
		
		return max;
	}
	
	private int minimum() //returns lowest grade for output
	{
		if (length == 0)
			return 0;
		
		int min;
		
		Arrays.sort(grades);
		min = grades[0];
		
		return(min);
	}
	
	public String toString()  //replaces standard Object toString
	{
		String grades = "[";
		if (length == 0)
			grades += "]";
		else
		{
			for (int x = 0; x < length-1; x++)
				grades += this.grades[x] + ", ";
			grades += this.grades[length-1] + "]";
		}
		return(name + " " + grades);
	}
	
	public static void testGrades(Grades grades) //test output
	{
	    System.out.println(grades.toString()); 
	    System.out.printf("\tName:    %s\n", grades.getName());
	    System.out.printf("\tLength:  %d\n", grades.length());
	    System.out.printf("\tAverage: %.2f\n", grades.average());
	    System.out.printf("\tMedian:  %.1f\n", grades.median());
	    System.out.printf("\tMaximum: %d\n", grades.maximum());
	    System.out.printf("\tMininum: %d\n", grades.minimum());
	}
}
