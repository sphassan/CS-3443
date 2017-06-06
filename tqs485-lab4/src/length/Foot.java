package length;

/**
 * A Foot is a Length with a unit of feet and a length that can be added
 * to other Lengths, can convert other units to itself and return the name of its unit.
 * @author Sean Hassan
 */
public class Foot extends Length
{
	/**
	 * 1 foot = 0.3048 meters
	 */
	public static final double METERS_PER_FOOT = 0.3048;
	
	/**
	 * Declares the Length to be a Foot and passes to superclass constructor
	 * @param length
	 */
	public Foot(double length)
	{
		super(length);
	}

	@Override
	public void add(Length other) 
	{
		super.setLength(super.getLength() + otherToFeet(other));	
	}

	/**
	 * Converts a Length to meters, and then to feet so it can be added.
	 * @param other
	 * @return length
	 */
	private double otherToFeet(Length other)
	{
		return other.toMeters() * (1/METERS_PER_FOOT);
	}

	@Override
	public String getUnit()
	{
		if (super.getLength() == 1.0)
			return "foot";
		else
			return "feet";
	}

	@Override
	public double toMeters()
	{
		return super.getLength() * METERS_PER_FOOT;
	}
}
