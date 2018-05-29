/* James Basquill
No number as yet*/


public class test2
{
	public static void main(String[] args)
	{
		int num = 1;
		
		while(num<=10)
		{
			square(num);
			num++;
		}
	}
	
	public static void square(int a)
	{
		int result = a*a;
		System.out.println("The square of "+a+" is equal to "+result);
	}
}