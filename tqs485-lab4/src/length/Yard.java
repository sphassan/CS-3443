package length;

/**
 * A Yard is a Length with a unit of yards and a length that can be added
 * to other Lengths, can convert other units to itself and return the name of its unit.
 * @author Sean Hassan
 */
public class Yard extends Length
{
	/**
	 * 1 yard = 0.9144 meters
	 */
	public static final double METERS_PER_YARD = 0.9144;
	
	/**
	 * Declares the Length to be a Yard and passes to superclass constructor
	 * @param length
	 */
	public Yard(double length)
	{
		super(length);
	}

	@Override
	public void add(Length other)
	{
		super.setLength(super.getLength() + otherToYards(other));
	}

	/**
	 * Converts a Length to meters, and then to yards so it can be added.
	 * @param other
	 * @return length
	 */
	private double otherToYards(Length other)
	{
		return other.toMeters() * (1/METERS_PER_YARD);
	}

	@Override
	public String getUnit() 
	{
		if (super.getLength() == 1.0)
			return "yard";
		else
			return "yards";
	}

	@Override
	public double toMeters()
	{
		return super.getLength() * METERS_PER_YARD;
	}
}
