/* James Basquill
No number as yet*/

public class Lab085
{
	public static void main(String[] args)
	{
		int input = 58;		//Declare input
		int test = input;		//Declare variable to run through code
		int sum = 0;		//Declare variable to be printed
		
		while(test>=0)
		{
			sum+=test;		//Sum calculation
			test--;
		}
		
		System.out.println("The sigma of "+input+" is "+sum);
		
		
		
	}
}