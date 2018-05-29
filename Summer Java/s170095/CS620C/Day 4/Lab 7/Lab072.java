/* James Basquill
No number as yet*/

public class Lab082
{
	public static void main(String[] args)
	{
		int count = 1;		//Declare counter
		int check = 0;		//Declare even/odd checker
		int result = 0;		//Declare print result
		
		while(count<=20)	//Loop for 20 runs
		{	
			check = count%2;	//Calculation for even/odd
			if(check==0)		//If check for even
			{	
				result = count*10;
				System.out.println(result);
			}
			count++;
		}
		
	}
}