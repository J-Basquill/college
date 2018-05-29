/* James Basquill
17186285*/

public class Circle extends TwoDShape
{
	private double radius;
	private double area;
	private double circumference;
	
	public Circle(double r)
	{
		radius = r;
	}
	
	public Circle (double r, String shape)
	{
	    super (shape);
	    radius = r;
	}
	public double getRadius()
	{
		return radius;
	}
	
	public void setRadius(double r)
	{
		radius = r;
	}
	
	public double area()
	{
		area = 3.14*radius*radius;
		return area;
	}
	
	public double circumference()
	{
		circumference = 2*3.14*radius;
		return circumference;
	}
}