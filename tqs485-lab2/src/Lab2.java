import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lab2
{
	public static void main(String args[])
	{
		Scanner in = null;
		try
		{
			in = new Scanner(new File("data.txt"));
		}
		catch (FileNotFoundException exception)
		{
			System.err.println("Failed to open data.txt");
			System.exit(1);
		}
		
		while (in.hasNextLine())
		{	
			Grades student = new Grades(in.nextLine(), in.nextLine());
			Grades.testGrades(student);
		}
		
		in.close();
	}
}
