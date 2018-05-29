/* James Basquill
No number as yet*/


public class lab506
{
	public static void main(String[] args)
	{
		int num = 1;		//declares input
		int ans = 0;		// declares print answer
		
		while(num<=20)
		{
			ans = square(num);	//method call for squaring
			
			System.out.println("The number "+num+" squared is "+ans);
			num++;		//updater for while loop
		}
	}
	
	public static int square(int a)		//method for squaring an integer
	{
		int result = a*a;		//square calc
	
		return result;		//instructions to return our result to the main method
	}
}