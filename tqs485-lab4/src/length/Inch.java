package length;

/**
 * An Inch is a Length with a unit of inches and a length that can be added
 * to other Lengths, can convert other units to itself and return the name of its unit.
 * @author Sean Hassan
 */
public class Inch extends Length
{
	/**
	 * 1 inch = 0.0254 meters
	 */
	public static final double METERS_PER_INCH = 0.0254;
	
	/**
	 * Declares the Length to be an Inch and passes to superclass constructor
	 * @param length
	 */
	public Inch(double length)
	{
		super(length);
	}

	@Override
	public void add(Length other)
	{
		super.setLength(super.getLength() + otherToInches(other));
	}
	
	/**
	 * Converts a Length to meters, and then to inches so it can be added.
	 * @param other
	 * @return length
	 */
	private double otherToInches(Length other)
	{
		return other.toMeters() * (1/METERS_PER_INCH);
	}

	@Override
	public String getUnit()
	{
		if (super.getLength() == 1.0)
			return "inch";
		else
			return "inches";
	}

	@Override
	public double toMeters()
	{
		return super.getLength() * METERS_PER_INCH;
	}
}
