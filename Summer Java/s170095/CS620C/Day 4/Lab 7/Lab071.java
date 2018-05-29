/* James Basquill
No number as yet*/

public class Lab081
{
	public static void main(String[] args)
	{
		int count = 1;		//Declare counter
		int check = 0;		//Declare even/odd checker
		
		while(count<=100)	//Loop for hundred runs
		{	
			check = count%2;	//Calculation for even/odd
			if(check==0)		//If check for even
			{	
				System.out.println(count+" is even");
			}
			count++;	
		}
		
	}
}