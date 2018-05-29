/* James Basquill
No number as yet*/

public class Lab085b
{
	public static void main(String[] args)
	{
		int n1 = 5;		//Declare input
		int n2 = 10;			//Declare second input
		int test = n1;		//Declare variable to run through code
		int sum = 0;		//Declare variable to be printed
		
		if(n1>=n2)			//if for if first entry is greater than second
		{
			while(test>=n2)
			{
				sum+=test;		//Sum calculation
				test--;
			}
		}
		else				// default to here if first input is less than second
		{
			while(test<=n2)
			{
				sum+=test;		//Sum calculation
				test++;
			}
		}
		
		System.out.println("The sigma of "+n1+" and "+n2+" is "+sum);
		
		
		
	}
}