/* James Basquill
No number as yet*/

public class lab2b2
{
	public static void main(String[] args)
	{
		int n1 = 25;
		printMultiplesOfThree(n1);
	}
	
	public static void printMultiplesOfThree(int a)
	{
		for(int i=3;i<a;i+=3)
		{
			System.out.print(i+" ");
		}
	}
}