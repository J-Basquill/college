/* James Basquill
No number as yet*/

public class lab2a4
{
	public static void main(String[] args)
	{
		int n1 = 10;
		int n2 = nMinusOneProduct(n1);
		System.out.println("The product of "+n1+" and "+(n1-1)+" is "+n2);
	}
	
	public static int nMinusOneProduct(int a)
	{
		
			return a*(a-1);
		
	}
}