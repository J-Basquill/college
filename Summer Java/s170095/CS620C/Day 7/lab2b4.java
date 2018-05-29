/* James Basquill
No number as yet*/

public class lab2b4
{
	public static void main(String[] args)
	{
		int sum = 0;
		for(int n1=0;n1<=20;n1++)
		{	
			sum = mySigma(n1);
			System.out.println("The sigma of "+n1+" is : "+sum);
		}
	}
	
	public static int mySigma(int a)
	{
		int result = 0;
		for(int i=a; i>0;i--)
		{
			result += i;
		}
		return result;
	}
}