/* James Basquill
No number as yet*/

public class Lab083
{
	public static void main(String[] args)
	{
		int count = 1;		//Declare counter
		int check = 0;		//Declare multiple checker
		
		while(count<=100)	//Loop for hundred runs
		{	
			check = count%5;	//Calculation for multiple of 5
			if(check==0)		//If check for multiple
			{	
				System.out.println(count+" is a multiple of 5");
			}	
			count++;			
		}
		
	}
}