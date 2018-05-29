/* James Basquill
No number as yet*/

public class lab206
{
	public static void main(String[] args)
	{
		int count = 20;			//declare and set while loop counter
		int mod = 0;			//declare mod variable
		
		while(count>0)			//loop as long as counter is above 0
		{
			mod = count%2;		//calculate counter mod 2
			if(mod==0)			//print if even
			{
				System.out.println(count+" is even");
			}
			else				//print if odd
			{
				System.out.println(count+" is odd");
			}
			count--;			//while updater
		}
	}
}