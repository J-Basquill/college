/**This class defines a circle.
 * it includes methods to set and get the radius
 * and also to find the area and circumference
 * @author James Basquill
 * @author 17186285
 * @version 1.1
 */

public class Circle
{
	private double radius;
	private double area;
	private double circumference;
	
	/**This is the class constructor
	 * @param The radius of the circle to be created
	 */
	public Circle(double r)
	{
		radius = r;
	}
	
	/**Method to discover the radius of the circle
	 * @return returns the current radius of the circle
	 */
	public double getRadius()
	{
		return radius;
	}
	
	/**Method to set a new radius for the circle
	 * @param The revised radius for the circle
	 */
	public void setRadius(double r)
	{
		radius = r;
	}
	
	/**Method to calculate the area 
	 * @return Returns the area of the circle from the current radius
	 */
	public double area()
	{
		area = 3.14*radius*radius;
		return area;
	}
	
	/**Method to calculate the circumference of the circle
	 * @return Returns the circumference as calculated from the current radius
	 */
	public double circumference()
	{
		circumference = 2*3.14*radius;
		return circumference;
	}
}