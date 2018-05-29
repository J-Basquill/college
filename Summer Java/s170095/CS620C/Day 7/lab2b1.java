/* James Basquill
No number as yet*/

public class lab2b1
{
	public static void main(String[] args)
	{
		double n1 = 10.9;
		double n2 =  9.1;
		double n3 = getAverage(n1,n2);
		System.out.println("The average of "+n1+" and "+n2+" is "+n3);
	}
	
	public static double getAverage(double a, double b)
	{
		return (a+b)/2;
	}
}