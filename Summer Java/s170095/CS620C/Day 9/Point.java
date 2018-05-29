/* James Basquill
17186285*/

public class Point
{
	private int x;
	private int y;
	
	public Point(int a, int b)
	{
		x = a;
		y = b;
	}
	
	public int getXCoordinate()
	{
		return x;
	}
	
	public int getYCoordinate()
	{
		return y;
	}
	
	public void setXCoordinate(int a)
	{
		x = a;
	}
	
	public void setYCoordinate(int b)
	{
		y = b;
	}
	public void printPoint()
	{
		System.out.println("Point coordinates are "+x+", "+y);
	}
}