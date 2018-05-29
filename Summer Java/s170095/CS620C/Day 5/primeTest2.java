/* James Basquill
No number as yet*/

import java.util.Scanner;

public class primeTest2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number >");
		double input = sc.nextDouble();
		int test = (input/4);
		double result = 0.0d;
		double mod = 0.0d;
		
		while(test>=2)
		{	
			result = input/test;
			mod = result%1;
			test--;
			
			if(mod==0)
			{
				System.out.println(input+" is not prime number.");
				break;
			}
		}		
		if(mod!=0)
		{
			System.out.println(input+" is a prime number.");
		}	
	}
}