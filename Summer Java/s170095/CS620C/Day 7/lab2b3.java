/* James Basquill
No number as yet*/

public class lab2b3
{
	public static void main(String[] args)
	{
		double len = 10.5;
		double bre = 6.3;
		double area = returnArea(len,bre);
		System.out.println("The area a rectangle, length "+len+" and breadth "+bre+", is "+area);
	}
	
	public static double returnArea(double a,double b)
	{
		return a*b;
	}
}