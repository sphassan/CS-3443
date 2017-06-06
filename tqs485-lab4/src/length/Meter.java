package length;

/**
 * A Meter is a Length with a unit of meters and a length that can be added
 * to other Lengths and return the name of its unit.
 * @author Sean Hassan
 */
public class Meter extends Length
{
	/**
	 * Declares the Length to be a Meter and passes to superclass constructor
	 * @param length
	 */
	public Meter(double length)
	{
		super(length);
	}

	@Override
	public void add(Length other)
	{
		super.setLength(super.getLength() + other.toMeters());
	}

	@Override
	public String getUnit()
	{
		if (super.getLength() == 1.0)
			return "meter";
		else
			return "meters";
	}

	@Override
	public double toMeters()
	{
		return super.getLength();
	}
}
