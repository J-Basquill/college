/* James Basquill
No number as yet*/

import java.util.Scanner;

public class primeTest
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number >");
		int input = sc.nextInt();
		int test = input;
		double result = 0;
		double mod = 0;
		
		while(test>=2)
		{
			result = input/test;
			mod = (result*100000000)%100000000;
			System.out.println("The mod result is "+mod);
			test--;
		}	
		
		
		
		
		
	}
}