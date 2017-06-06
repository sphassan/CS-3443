import java.awt.*;
import java.util.ArrayList;

/**
 * The DemoModel class holds the information that is used by the GUI.
 * Ask yourself the question, what data would be needed to recreate
 * the state of the GUI?  This data is what should be stored in the
 * model.
 * <p>
 * The instance variables are from Fig. 14.34.
 * @author Tom Bylander
 */
public class DemoModel {
    /** 
     * The number of points 
     */
	private int pointCount;

	/** 
	 * An arraylist of java.awt.Point references 
	 */
	private ArrayList<Point> points;
	
	/** 
	 * The color selected by the user 
	 */
	private Color selectedColor;
	
	/** 
     * The number of colors 
     */
	private int colorCount;
	
	/** 
	 * An arraylist of java.awt.color references 
	 */
	private ArrayList<Color> colors;
	
	public DemoModel() {
		pointCount = 0;
		points = new ArrayList<Point>();
		colorCount = 0;
		colors = new ArrayList<Color>();
		selectedColor = Color.CYAN;
		colors.add(Color.CYAN);
		colorCount++;
	}
	
	/**
	 * Add a Point to the points arraylist.
	 * @param point the Point to be added to points.
	 */
	public void addPoint(Point point) {
		// avoids out-of-bounds errors
		points.add(pointCount, point);
		pointCount++;
	}
	
	/**
	 * Returns point at index i.
	 * Returns null if no such point exists.
	 * @param i
	 */
	public Point getPoint(int i) {
		if (i >= 0 && i < pointCount) {
			// probably should return a new point so that the return
			// value cannot be used to change the array element
			return points.get(i);
		}
		return null;
	}
	
	/**
	 * Add a Color to the colors arraylist.
	 * @param color the Color to be added to colors.
	 */
	public void addColor(Color color) {
		colors.add(colorCount, color);
		colorCount++;
	}
	
	/**
	 * Returns color at index i.
	 * Returns null if no such color exists.
	 * @param i
	 */
	public Color getColor(int i) {
		if (i >= 0 && i < colorCount) {
			return colors.get(i);
		}
		return null;
	}
	
	/**
	 * Store the color that the user selected.
	 * @param color the color selected by the user
	 */
	public void setSelectedColor(Color color) {
		selectedColor = color;
	}
	
	/**
	 * @return the color selected by the user
	 */
	public Color getSelectedColor() {
		return selectedColor;
	}
}
