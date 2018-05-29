/**
 * This is a class program for making rectangles
 * @author James Basquill
 * @author 17186285
 * @version 11/9/17
 */
public class Rectangle
{
	/**
	 * The attributes for our rectangles
	 * @param len, the length of the rectangle
	 * @param width, the width of the rectangle
	 * @param colour, the colour of the rectangle
	 * @param area, the area of the rectangle
	 * @param perimeter, the perimeter of the rectangle
	 */
	private double len;
	private double width;
	private String colour;
	private double area;
	private double perimeter;
	
	/**
	 * The class constructor for Rectangle 
	 * @param l, the input for length
	 * @param b, the input for width
	 * @param c, the input for colour
	 */
	public Rectangle(double l, double b, String c)
	{
		len = l;
		width = b;
		colour = c;
	}
	/**
	 * The default constructor 
	 */
	public Rectangle()
	{
		len = 1;
		width = 1;
		colour = "grey";
	}
	
	/**
	 *  Getter method for length
	 *  @return Returns current length of the rectangle
	 */
	public double getLength()
	{
		return len;
	}
	/**
	 *  Getter method for width
	 *  @return Returns current width of the rectangle
	 */
	public double getWidth()
	{
		return width;
	}
	/**
	 *  Getter method for colour
	 *  @return Returns current colour of the rectangle
	 */
	public String getColour()
	{
		return colour;
	}
	
	/**
	 *  Setter method for length
	 *  @param l, the updated length for Rectangle
	 */
	public void setLength(double l)
	{
		len = l;
	}
	/**
	 *  Setter method for width
	 *  @param l, the updated width for Rectangle
	 */
	public void setWidth(double b)
	{
		width = b;
	}
	/**
	 *  Setter method for colour
	 *  @param l, the updated colour for Rectangle
	 */
	public void setColour(String c)
	{
		colour = c;
	}
	
	/**
	 *  Method to calculate area with current values for length and width
	 */
	public double area()
	{
		area = len*width;
		return area;
	}
	
	/**
	 *  Method to calculate perimeter with current values for length and width
	 */
	public double perimeter()
	{
		perimeter = (2*len)+(2*width);
		return perimeter;
	}
}