/* James Basquill
17186285*/

public class Rectangle
{
	private int length;
	private int breadth;
	private int area;
	private int perimeter;
	
	public Rectangle(int l, int b)
	{
		length = l;
		breadth = b;
	}
	
	public int getLength()
	{
		return length;
	}
	
	public int getBreadth()
	{
		return breadth;
	}
	
	public void setlength(int l)
	{
		length = l;
	}
	
	public void setBreadth(int b)
	{
		breadth = b;
	}
	
	public int area()
	{
		area = length*breadth;
		return area;
	}
	
	public int perimeter()
	{
		perimeter = (2*length)+(2*breadth);
		return perimeter;
	}
}