/* James Basquill
No number as yet*/

public class lab106
{	
	public static void main(String[] args)
	{
		for(int i=1; i<=100; i++)
		{
			boolean flag = checkEven(i);			//method call
			if(flag==true)							//branch if true, even
			{
				System.out.println(i+" is an even number");
			}
			else									//otherwise, it is false, odd
			{
				System.out.println(i+" is an odd number");
			}
		}	
	}
	
	public static boolean checkEven (int test)		//method declaration with boolean
	{
		int result = test%2;						//calc for odd or even
		if(result==0)								//if even return true
		{
			return true;
		}
		else										//if odd return false
		{
			return false;
		}
	}
}