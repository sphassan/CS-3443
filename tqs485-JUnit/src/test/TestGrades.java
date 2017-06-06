package test;

import static org.junit.Assert.*;
import org.junit.Test;
import core.Grades;

public class TestGrades
{
	//median tests
	
	/**
	 * median method test using an input of a null string
	 * proper behavior should be zero
	 */
	@Test
	public void testNoElementsMedian()
	{
		Grades nogrades = new Grades("test", "");
		
		assertEquals("Should be 0", 0, nogrades.getMedian(), 0.000001);
	}
	
	/**
	 * median method test using an input of a single data entry of 0
	 * proper behavior should be zero
	 * also tests the code that controls for an odd number of data
	 */
	@Test
	public void testFewElementsMedian()
	{
		Grades fewgrades = new Grades("test", "0");
		
		assertEquals("Should be 0", 0, fewgrades.getMedian(), 0.000001);
	}
	
	/**
	 * median method test using an input of an even number of data, 50 60 70 and 80
	 * proper behavior should be 65
	 */
	@Test
	public void testEvenElementsMedian()
	{
		Grades evengrades = new Grades("test", "50 60 70 80");
		
		assertEquals("Should be 65", 65, evengrades.getMedian(), 0.00001);
	}
	
	/**
	 * median method test using an input of many elements, repeating 90 and 100
	 * proper behavior should be 95
	 */
	@Test
	public void testManyElementsMedian()
	{
		Grades manygrades = new Grades("test", "90 100 90 100 90 100 90 100 90 100 90 100 90 100 90 100 90 100 90 100 90 100 90 100 90 100 90 100 90 100");
		
		assertEquals("Should be 95", 95, manygrades.getMedian(), 0.00001);
	}
	
	//average tests
	
	/**
	 * average method test using an input of a null string
	 * proper behavior should be zero
	 */
	@Test
	public void testNoElementsAverage()
	{
		Grades nogrades = new Grades("test", "");
		
		assertEquals("Should be 0", 0, nogrades.getAverage(), 0.000001);
	}
	
	/**
	 * average method test using an input of a single data entry of 0
	 * proper behavior should be zero
	 */
	@Test
	public void testFewElementsAverage()
	{
		Grades fewgrades = new Grades("test", "0");
		
		assertEquals("Should be 0", 0, fewgrades.getAverage(), 0.000001);
	}
	
	/**
	 * average method test using an input of two elements, 50 and 60
	 * proper behavior should be 55
	 */
	@Test
	public void testOneIterationAverage()
	{
		Grades evengrades = new Grades("test", "50 60");
		
		assertEquals("Should be 55", 55, evengrades.getAverage(), 0.00001);
	}
	
	/**
	 * average method test using an input of many elements, repeating 90 and 100
	 * proper behavior should be 95
	 */
	@Test
	public void testManyElementsAverage()
	{
		Grades manygrades = new Grades("test", "90 100 90 100 90 100 90 100 90 100 90 100 90 100 90 100 90 100 90 100 90 100 90 100 90 100 90 100 90 100");
		
		assertEquals("Should be 95", 95, manygrades.getAverage(), 0.00001);
	}
	
	//minimum tests
	
	/**
	 * minimum method test using an input of a null string
	 * proper behavior should be zero
	 */
	@Test
	public void testNoElementsMinimum()
	{
		Grades nogrades = new Grades("test", "");
		
		assertEquals("Should be 0", 0, nogrades.getMinimum(), 0.000001);
	}
	
	/**
	 * minimum method test using an input of a single data entry of 0
	 * proper behavior should be zero
	 */
	@Test
	public void testFewElementsMinimum()
	{
		Grades fewgrades = new Grades("test", "0");
		
		assertEquals("Should be 0", 0, fewgrades.getMinimum(), 0.000001);
	}
	
	/**
	 * minimum method test using an input of unsorted elements 100 75 90 32 60 to check sorting
	 * proper behavior should be 32
	 */
	@Test
	public void testUnsortedElementsMinimum()
	{
		Grades evengrades = new Grades("test", "100 75 90 32 60");
		
		assertEquals("Should be 32", 32, evengrades.getMinimum(), 0.00001);
	}
	
	/**
	 * minimum method test using an input of many elements, repeating 90 and 100
	 * proper behavior should be 90
	 */
	@Test
	public void testManyElementsMinimum()
	{
		Grades manygrades = new Grades("test", "90 100 90 100 90 100 90 100 90 100 90 100 90 100 90 100 90 100 90 100 90 100 90 100 90 100 90 100 90 100");
		
		assertEquals("Should be 90", 90, manygrades.getMinimum(), 0.00001);
	}
}