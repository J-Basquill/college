/* James Basquill
No number as yet*/

public class lab103
{	
	public static void main(String[] args)
	{
		printHalf(7);	//method call
	}
	public static void printHalf(double input)	//method declaration with double 
	{
		double result = input/2;		//calculate for half
		System.out.println("Half of the input, "+input+", is "+result);
	}
}