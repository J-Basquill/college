/* James Basquill
No number as yet*/

public class lab2a2
{
	public static void main(String[] args)
	{
		int n1 = 10;
		int n2 = 9;
		int n3 = 7;
		int n4 = addThreeNumbers(n1,n2,n3);
		System.out.println("The sum of "+n1+" and "+n2+" and "+n3+" is "+n4);
	}
	
	public static int addThreeNumbers(int a,int b,int c)
	{
		return (a+b+c);
	}
}